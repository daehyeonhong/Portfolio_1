package shop.carrental.tt.config;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.Setter;

@Configuration
@ComponentScan(basePackages = { "shop.carrental.tt.service"/* , "shop.carrental.tt.aop" */ })
@EnableAspectJAutoProxy
@EnableTransactionManagement
@MapperScan(basePackages = { "shop.carrental.tt.mappers" })
public class RootConfig {

	@Setter(onMethod_ = @Autowired)
	ApplicationContext applicationContext;

	@Bean
	public DataSource dataSource() {
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		hikariConfig.setJdbcUrl("jdbc:log4jdbc:oracle:thin:@127.0.0.1:1521:xe");
		hikariConfig.setUsername("portfolio");
		hikariConfig.setPassword("1234");
		hikariConfig.setConnectionTestQuery("SELECT 1 FROM DUAL");
		hikariConfig.setMaximumPoolSize(10);
		hikariConfig.setIdleTimeout(60000);
		hikariConfig.setMaxLifetime(1800000);
		hikariConfig.setConnectionTimeout(30000);
		HikariDataSource dataSource = new HikariDataSource(hikariConfig);
		return dataSource;
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource());
		sqlSessionFactory.setConfigLocation(
				applicationContext.getResource("classpath:/shop/carrental/tt/config/mybatis-config.xml"));
		return (SqlSessionFactory) sqlSessionFactory.getObject();
	}

	public DataSourceTransactionManager txManager() {
		return new DataSourceTransactionManager(dataSource());
	}

}