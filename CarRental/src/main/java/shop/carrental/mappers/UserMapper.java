package shop.carrental.mappers;

import shop.carrental.domain.UserVO;

public interface UserMapper {

	public UserVO read(String user_id);

	public void register(UserVO userVO);

}