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
	
	public Users getUser(String id) {
		return usersMapper.getUser(id);
	}
	
	/** JH 1.28 수정 **/
	public int addUsers(Users users) {
		return usersMapper.addUsers(users);
	}
	
//	public void updateUsers(Users users) {
//		usersMapper.updateMember(users);
//	}
//	public void deleteUsers(String id) {
//		usersMapper.deleteMember(id);
//	}
	/** JH 1.28  수정 **/
}
