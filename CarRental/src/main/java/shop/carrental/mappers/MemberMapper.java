package shop.carrental.mappers;

import shop.carrental.domain.MemberVO;

public interface MemberMapper {

	public MemberVO read(String user_id);

}