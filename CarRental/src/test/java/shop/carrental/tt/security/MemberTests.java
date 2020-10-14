package shop.carrental.tt.security;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/security-context.xml" })
@Log4j
public class MemberTests {

	@Setter(onMethod_ = @Autowired)
	private PasswordEncoder passwordEncoder;
	@Setter(onMethod_ = @Autowired)
	private DataSource dataSource;

	@Test
	public void testInsertMember() {
		log.info("Change Password");
		String sql = "INSERT INTO USERS(PASSWORD)VALUES(?)";
		for (int i = 0; i < 100; i++) {
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			try {
				connection = dataSource.getConnection();
				preparedStatement = connection.prepareStatement(sql);

				preparedStatement.setString(2, passwordEncoder.encode("PASSWORD" + i));
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (preparedStatement != null) {
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if (connection != null) {
					try {
						connection.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

}