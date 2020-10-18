package shop.carrental.tt.service;

import java.io.UnsupportedEncodingException;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import shop.carrental.tt.config.MailConfig;

@Service
@Log4j
@AllArgsConstructor
public class MailServiceImpl implements MailService {

	private MailConfig mailConfig;

	@Override
	public boolean sendMail() {
		log.info("Send Message");
		String senderName = "TT Rental";
		boolean result;
		try {
			MimeMessage message = mailConfig.createMimeMessage();
			message.addRecipient(RecipientType.TO, new InternetAddress(senderName));

			message.addFrom(new InternetAddress[] { new InternetAddress(mailConfig.getUsername(), "") });
			message.setSubject("HI HI", "UTF-8");
			message.setText("Bye Bye", "UTF-8");
			mailConfig.send(message);
			result = true;
		} catch (MessagingException | UnsupportedEncodingException e) {
			e.printStackTrace();
			result = false;
		}
		return result;
	}

}
