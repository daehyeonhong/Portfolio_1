package com.portfolio.carrental.mappers;

import com.portfolio.carrental.domain.UserVO;

public interface UserMapper {

	public UserVO read(String user_id);

	public void register(UserVO userVO);

}