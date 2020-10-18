package shop.carrental.tt.service;

import java.io.UnsupportedEncodingException;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import shop.carrental.tt.config.MailConfig;
import shop.carrental.tt.config.RootConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration(classes = { RootConfig.class })
public class MailTests {

	@Setter(onMethod_ = @Autowired)
	private MailConfig mailConfig;

	@Test
	public void sendEmail() {
		log.info("Mail Test");
		try {
			MimeMessage message = mailConfig.createMimeMessage();
			message.addRecipient(RecipientType.TO, new InternetAddress("fholng@outlook.com"));
			message.addFrom(new InternetAddress[] { new InternetAddress(mailConfig.getUsername(), "TT Rental") });
			message.setSubject("TT Rental");
			message.setText("TT Message", "UTF-8");
			mailConfig.send(message);
		} catch (MessagingException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}