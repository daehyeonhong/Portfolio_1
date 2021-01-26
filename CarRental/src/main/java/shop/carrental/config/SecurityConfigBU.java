package shop.carrental.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import shop.carrental.security.LoginSuccessHandlerImpl;
import shop.carrental.security.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
@Log4j
public class SecurityConfigBU extends WebSecurityConfigurerAdapter {

	@Setter(onMethod_ = @Autowired)
	private DataSource dataSource;

	@Bean
	public UserDetailsService userDetailsService() {
		return new UserDetailsServiceImpl();
	}

	@Bean
	public AuthenticationSuccessHandler loginSuccessHandler() {
		return new LoginSuccessHandlerImpl();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		log.info("Configure with JDBC");
		auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.formLogin().loginPage("/user/login").loginProcessingUrl("/login").successHandler(loginSuccessHandler());

		http.logout().logoutUrl("/logout").invalidateHttpSession(true);
	}

	/*
	 * @Override public void configure(WebSecurity web) throws Exception {
	 * web.httpFirewall(defaultHttpFirewall()); }
	 * 
	 * @Bean public HttpFirewall defaultHttpFirewall() { return new
	 * DefaultHttpFirewall(); }
	 */

}