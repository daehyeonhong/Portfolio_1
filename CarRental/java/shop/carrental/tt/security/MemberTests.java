package shop.carrental.tt.security;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.junit.Ignore;
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

	@Ignore
	@Test
	public void testInsertMember() {
		log.info("InsertMember");
		String sql = "INSERT INTO MEMBER(USER_ID,USER_PASSWORD,USER_NAME)VALUES(?,?,?)";
		int j = 0;
		int k = 0;
		for (int i = 0; i < 100; i++) {
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			try {
				connection = dataSource.getConnection();
				preparedStatement = connection.prepareStatement(sql);

				if (i < 80) {
					preparedStatement.setString(1, "user" + i);
					preparedStatement.setString(2, passwordEncoder.encode("pw" + i));
					preparedStatement.setString(3, "일반 사용자" + i);
				} else if (i < 90) {
					preparedStatement.setString(1, "manager" + j);
					preparedStatement.setString(2, passwordEncoder.encode("pw" + j));
					preparedStatement.setString(3, "운영자" + j);
					j++;
				} else {
					preparedStatement.setString(1, "admin" + k);
					preparedStatement.setString(2, passwordEncoder.encode("pw" + k));
					preparedStatement.setString(3, "관리자" + k);
					k++;
				}

				preparedStatement.executeUpdate();

			} catch (SQLException e) {
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
			} /* End For */
		}
	}

	@Test
	public void testInsertAuth() {
		log.info("InsertAuth");
		String sql = "INSERT INTO MEMBER_AUTH(USER_ID,AUTHORITY)VALUES(?,?)";
		int j = 0;
		int k = 0;
		for (int i = 0; i < 100; i++) {
			Connection connection = null;
			PreparedStatement preparedStatement = null;

			try {
				connection = dataSource.getConnection();
				preparedStatement = connection.prepareStatement(sql);
				if (i < 80) {
					preparedStatement.setString(1, "user" + i);
					preparedStatement.setString(2, "ROLE_USER");
				} else if (i < 90) {
					preparedStatement.setString(1, "manager" + j);
					preparedStatement.setString(2, "ROLE_MEMBER");
					j++;
				} else {
					preparedStatement.setString(1, "admin" + k);
					preparedStatement.setString(2, "ROLE_ADMIN");
					k++;
				}

				preparedStatement.executeUpdate();

			} catch (SQLException e) {
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
			} /* End For */
		}
	}

	@Ignore
	@Test
	public void testSelectMember() {
		log.info("Select Member Test");
		String sql = "SELECT*FROM MEMBER";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				log.info("USER_ID ==> " + resultSet.getString(1));
				log.info("USER_PASSWORD ==> " + resultSet.getString(2));
				log.info("USER_NAME ==> " + resultSet.getString(3));
			}
		} catch (SQLException e) {
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

	@Ignore
	@Test
	public void testSelectMemberAuth() {
		log.info("Select Member Auth Test");
		String sql = "SELECT*FROM MEMBER_AUTH";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				log.info("USER_ID ==> " + resultSet.getString(1));
				log.info("AUTHORITY ==> " + resultSet.getString(2));
			}
		} catch (SQLException e) {
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