package shop.carrental.tt.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(basePackages = { "shop.carrental.tt.service" }, includeFilters = @Filter({ Controller.class, Service.class }), useDefaultFilters = false)
@MapperScan(basePackages = { "shop.carrental.tt.mappers" })
@Import({ PropertiesConfig.class, DBConfig.class, MailConfig.class })
public class RootConfig {}