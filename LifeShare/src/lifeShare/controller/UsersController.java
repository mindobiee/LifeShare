package lifeShare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lifeShare.dto.Users;
import lifeShare.service.UsersService;

@Controller
@RequestMapping(path = "/")
public class UsersController {
	@Autowired
	private UsersService usersService;

	@GetMapping
	public String home() {
		return "index";
	}

	// 로그인 페이지
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	//회원가입 페이지
	@GetMapping("/join")
	public String join() {
		return "join";
	}

	@GetMapping("/mypage={id}")
	public String getUser(@PathVariable(name = "id") String id, ModelMap model) {
		Users users = usersService.getUser(id);
		model.addAttribute("users", users);
		return "mypage";
	}
	

}
