package lifeShare.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import lifeShare.dto.Users;

@Mapper
public interface UsersMapper {
	public Users getUser(String id);
	
	/** JH ���� **/
//	public int addUsers(Users users);
//	public void updateMember(Users users);
//	public int deleteMember(String id);
	/** JH ���� **/
	
}
