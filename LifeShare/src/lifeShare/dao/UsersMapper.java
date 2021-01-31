package lifeShare.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import lifeShare.dto.Users;

@Mapper
public interface UsersMapper {
	public Users getUser(String id);
	public void updateUser(Users users);
	
	public int addUsers(Users users);


}
