package shop.carrental.tt.config;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.DateTypeHandler;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.Setter;

@Configuration
@EnableTransactionManagement(mode = AdviceMode.PROXY, order = 0)
public class DBConfig {

	@Setter(onMethod_ = @Autowired)
	ApplicationContext applicationContext;

	@Value("${dataSource.url}")
	private String jdbcUrl;
	@Value("${dataSource.driverClassName}")
	private String driverClassName;
	@Value("${dataSource.user}")
	private String user;
	@Value("${dataSource.password}")
	private String password;
	@Value("${hikari.connectionTestQuery}")
	private String connecttionTestQuery;
	@Value("${hikari.maximumPoolSize}")
	private int maximumPoolSize;
	@Value("${hikari.idleTimeout}")
	private long idleTimeout;
	@Value("${hikari.maxLifetime}")
	private long maxLifeTime;
	@Value("${hikari.connectionTimeout}")
	private long connectionTimeout;

	@Bean
	public HikariConfig hikariConfig() {
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName(driverClassName);
		hikariConfig.setJdbcUrl(jdbcUrl);
		hikariConfig.setUsername(user);
		hikariConfig.setPassword(password);
		hikariConfig.setConnectionTestQuery(connecttionTestQuery);
		hikariConfig.setMaximumPoolSize(maximumPoolSize);
		hikariConfig.setIdleTimeout(idleTimeout);
		hikariConfig.setMaxLifetime(maxLifeTime);
		hikariConfig.setConnectionTimeout(connectionTimeout);
		return hikariConfig;
	}

	@Bean(destroyMethod = "close")
	public HikariDataSource hikariDataSource() {
		return new HikariDataSource(hikariConfig());
	}

	@Bean
	public DataSource dataSource() {
		return new LazyConnectionDataSourceProxy(hikariDataSource());
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource());
		sqlSessionFactory.setConfigLocation(applicationContext.getResource("classpath:/shop/carrental/tt/config/mybatis-config.xml"));
		TypeHandlerRegistry typeHandlerRegistry = sqlSessionFactory.getObject().getConfiguration().getTypeHandlerRegistry();
		typeHandlerRegistry.register(Timestamp.class, DateTypeHandler.class);
		typeHandlerRegistry.register(Time.class, DateTypeHandler.class);
		typeHandlerRegistry.register(Date.class, DateTypeHandler.class);
		return (SqlSessionFactory) sqlSessionFactory.getObject();
	}

	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}

	@Bean(destroyMethod = "clearCache")
	public SqlSessionTemplate sqlSessionTemplate() throws Exception {
		SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
		return sessionTemplate;
	}

}