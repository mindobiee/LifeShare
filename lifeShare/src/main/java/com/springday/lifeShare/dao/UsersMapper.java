package com.springday.lifeShare.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springday.lifeShare.vo.Users;

@Mapper 
public interface UsersMapper {
	public List<Users> getUsers();
	
}

