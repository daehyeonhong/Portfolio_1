package shop.carrental.tt.mappers;

import shop.carrental.tt.domain.MemberVO;

public interface MemberMapper {

	public MemberVO read(String user_id);

}