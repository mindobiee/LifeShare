package com.springday.lifeShare;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.springday.lifeShare.dao.UsersMapper;
import com.springday.lifeShare.vo.Users;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration()
public class test {
	@Autowired
	UsersMapper usersMapper;
	
	@Test
	public void getUsers()throws Exception {
		List<Users> memberList = usersMapper.getUsers();
		Assert.assertEquals(7, memberList.size());
	}

	
}
