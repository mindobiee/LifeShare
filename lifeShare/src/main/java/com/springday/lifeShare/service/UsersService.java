package com.springday.lifeShare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springday.lifeShare.dao.UsersMapper;
import com.springday.lifeShare.vo.Users;

@Service
public class UsersService {
	@Autowired
	private UsersMapper usersMapper;
	
	public List<Users> getUsers(){
		return usersMapper.getUsers();
	}
}
