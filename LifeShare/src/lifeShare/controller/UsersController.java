package lifeShare.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.mbeans.UserMBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lifeShare.dao.UsersMapper;
import lifeShare.dto.Users;
import lifeShare.service.UsersService;

@Controller

public class UsersController {
	@Autowired
	private UsersService usersService;

//	@GetMapping
//	public String home() {
//		return "index";
//	}

//	//@PostMapping
	@GetMapping("/userlogin")
	public String login() {
// 		Users users, UsersMapper usersMapper		
//		if(usersMapper.getUser(users) != null) return "";
//		else		
		return "index";
	}

	@PostMapping("/userJoin")
	public String join(Users users)  {
		usersService.addUsers(users);
		return "login";
	}

	@GetMapping("/mypage={id}")
	public String getUser(@PathVariable(name = "id") String id, ModelMap model) {
		Users users = usersService.getUser(id);
		model.addAttribute("users", users);
		return "mypage";
	}
	//留덉씠�럹�씠吏� �쉶�썝�젙蹂� �닔�젙(�떒�닚 �럹�씠吏� �씠�룞)
	@GetMapping("/modify={id}")
	public String modify(@PathVariable(name = "id") String id, ModelMap model) {
		Users users = usersService.getUser(id);
		model.addAttribute("users", users);
		return "modify";
	}
	//留덉씠�럹�씠吏� �쉶�썝�젙蹂� �닔�젙 �셿猷� �썑 留덉씠�럹�씠吏�濡� �씠�룞
	@PostMapping("/update")
	public String updateUser(@ModelAttribute Users users, HttpServletRequest request) {
		usersService.updateUser(users);
		return "mypage";
	}

}
