package lifeShare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lifeShare.dao.UsersMapper;
import lifeShare.dto.Users;
import lifeShare.service.UsersService;

@Controller
@RequestMapping(path = "/")
public class UsersController {
	@Autowired
	private UsersService usersService;
	/** JH �߰� **/
//	private UsersMapper usersMapper;

	@GetMapping
	public String home() {
		return "index";
	}

	// �α��� ������
	//@PostMapping
	@GetMapping("/login")
	public String login() {
		/** JH �߰� **/
// 		Users users, UsersMapper usersMapper		
//		if(usersMapper.getUser(users) != null) return "";
//		else		
		return "login";
	}

	//ȸ������ ������
	/** JH �߰� **/
	@GetMapping("/join")
	public String join()  {
// Users users	 throws Exception	 
//		usersMapper.addUsers(users);
		return "join";
	}

	@GetMapping("/mypage={id}")
	public String getUser(@PathVariable(name = "id") String id, ModelMap model) {
		Users users = usersService.getUser(id);
		model.addAttribute("users", users);
		return "mypage";
	}
	

}
