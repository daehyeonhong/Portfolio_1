package shop.carrental.tt.config;

import java.util.Properties;
import javax.net.ssl.SSLSocketFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig extends JavaMailSenderImpl {

	@Value("${mail.host}")
	private String host;
	@Value("${mail.port}")
	private String port;
	@Value("${mail.username}")
	private String username;
	@Value("${mail.password}")
	private String password;
	@Value("${mail.transport.protocol}")
	private String protocol;
	@Value("${mail.defaultEncoding}")
	private String defaultEncoding;
	@Value("${mail.smtp.auth}")
	private boolean smtpAuth;
	@Value("${mail.smtp.starttls.enable}")
	private boolean stmpStarttlsEnable;
	@Value("${mail.debug}")
	private boolean debug;

	@Bean
	public JavaMailSender javaMailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setUsername(username);
		mailSender.setPassword(password);
		mailSender.setDefaultEncoding(defaultEncoding);
		mailSender.setJavaMailProperties(mailProperties());
		return mailSender;
	}

	private Properties mailProperties() {
		Properties properties = new Properties();
		properties.setProperty("mail.transport.protocol", protocol);
		properties.setProperty("mail.smtp.starttls.enable", String.valueOf(stmpStarttlsEnable));
		properties.setProperty("mail.smtp.ssl.trust", host);
		properties.setProperty("mail.smtp.host", host);
		properties.setProperty("mail.smtp.auth", String.valueOf(smtpAuth));
		properties.setProperty("mail.smtp.port", String.valueOf(port));
		properties.setProperty("mail.smtp.socketFactory.port", String.valueOf(port));
		properties.setProperty("mail.smtp.socketFactory.class", SSLSocketFactory.class.getName());
		return properties;
	}

}