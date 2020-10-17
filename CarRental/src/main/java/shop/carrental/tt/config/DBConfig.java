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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import net.sf.log4jdbc.sql.jdbcapi.DriverSpy;

@Configuration
@EnableTransactionManagement(mode = AdviceMode.PROXY, order = 0)
public class DBConfig {

	@Autowired
	private Environment environment;

	@Bean(destroyMethod = "close")
	public HikariDataSource hikariDataSource() {
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDataSourceClassName(DriverSpy.class.getName());
		hikariConfig.setJdbcUrl(environment.getProperty("dataSource.url"));
		hikariConfig.setUsername(environment.getProperty("dataSource.user"));
		hikariConfig.setPassword(environment.getProperty("dataSource.password"));
		hikariConfig.setConnectionTestQuery(environment.getProperty("hikari.connectionTestQuery"));
		hikariConfig.setMaximumPoolSize(Integer.parseInt(environment.getProperty("hikari.maximumPoolSize")));
		hikariConfig.setIdleTimeout(Long.parseLong(environment.getProperty("hikari.idleTimeout")));
		hikariConfig.setMaxLifetime(Long.parseLong(environment.getProperty("hikari.maxLifetime")));
		hikariConfig.setConnectionTimeout(Long.parseLong(environment.getProperty("hikari.connectionTimeout")));
		return new HikariDataSource(hikariConfig);
	}

	@Bean
	public DataSource dataSource(HikariDataSource hikariDataSource) {
		return new LazyConnectionDataSourceProxy(hikariDataSource);
	}

	@Bean
	public DataSourceTransactionManager transactionManager(DataSource dataSource) {
		DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager(dataSource);
		return dataSourceTransactionManager;
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		PathMatchingResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean.setConfigLocation(
				resourcePatternResolver.getResource("classpath:/shop/carrental/tt/config/mybatis-config.xml"));
		sqlSessionFactoryBean.setMapperLocations(resourcePatternResolver.getResources("classpath*:mappers/*.xml"));
		TypeHandlerRegistry typeHandlerRegistry = sqlSessionFactoryBean.getObject().getConfiguration()
				.getTypeHandlerRegistry();
		typeHandlerRegistry.register(Timestamp.class, DateTypeHandler.class);
		typeHandlerRegistry.register(Time.class, DateTypeHandler.class);
		typeHandlerRegistry.register(Date.class, DateTypeHandler.class);
		return sqlSessionFactoryBean.getObject();
	}

	@Bean(destroyMethod = "clearCache")
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
		return sessionTemplate;
	}

}