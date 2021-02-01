package lifeShare.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.mbeans.UserMBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	// 로그인
	@PostMapping("/userLogin")
	public String login(Users users, HttpServletRequest req, RedirectAttributes rttr) throws Exception {
		
		// 세션 생성
		HttpSession session = req.getSession();
		Users login = usersService.login(users);
		
		// 로그인이 실패하면 어떠한 값도 넘어가지 않으니 null
		if(login == null) {
			session.setAttribute("users", null);
			// 다른 페이지로 이동하거나 새로고침을 하면 없어지는 일회용값
			rttr.addFlashAttribute("msg", false);
		} else {
			// 성공하면 Mapper에 있는 쿼리문에 대한 결과가 넘어온
			session.setAttribute("users", login);
		}
		return "index";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) throws Exception {
		session.invalidate();
		return "index";
	}
	
	// 회원가입
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
	@GetMapping("/modify={id}")
	public String modify(@PathVariable(name = "id") String id, ModelMap model) {
		Users users = usersService.getUser(id);
		model.addAttribute("users", users);
		return "modify";
	}
	@PostMapping("/update")
	public String updateUser(@ModelAttribute Users users, HttpServletRequest request) {
		usersService.updateUser(users);
		return "mypage";
	}

}
