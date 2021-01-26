package shop.carrental.domain;

import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberVO {

	private String user_id;
	private String user_password;
	private String user_name;
	private boolean enabled;

	private Date user_reg_date;
	private Date user_update;

	private List<AuthVO> authList;

}