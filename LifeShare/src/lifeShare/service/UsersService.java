package lifeShare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import lifeShare.dao.UsersMapper;
import lifeShare.dto.Users;

@Service
public class UsersService {

	@Autowired
	private UsersMapper usersMapper;
	
	public List<Users> getUsers(){
		return usersMapper.getUsers();
	}
}
