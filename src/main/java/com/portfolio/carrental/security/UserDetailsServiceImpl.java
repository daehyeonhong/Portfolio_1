package com.portfolio.carrental.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import com.portfolio.carrental.domain.UserVO;
import com.portfolio.carrental.mappers.UserMapper;
import com.portfolio.carrental.security.domain.UserImpl;

@Log4j
public class UserDetailsServiceImpl implements UserDetailsService {

	@Setter(onMethod_ = @Autowired)
	private UserMapper UserMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		log.warn("Load User By UserName ==> " + username);

		/* userName means user_id */
		UserVO vo = UserMapper.read(username);

		log.warn("Queried by Member Mapper ==> " + vo);

		return vo == null ? null : new UserImpl(vo);
	}

}