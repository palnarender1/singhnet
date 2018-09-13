package com.aws.singhnet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aws.singhnet.mapper.UserMapper;
import com.aws.singhnet.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> getUsers() {
		
		return userMapper.getUsers();
	}

}
