package com.portfolio.carrental.service;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import com.portfolio.carrental.domain.UserVO;
import com.portfolio.carrental.mappers.UserMapper;

@Log4j
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Override
    public void register(UserVO userVO) {
        log.info("User Register ==> " + userVO);

        userMapper.register(userVO);
    }

}
