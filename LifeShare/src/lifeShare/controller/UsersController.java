package lifeShare.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

	@PostMapping("/userLogin")
	public String login(@ModelAttribute Users users, HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		HttpSession session = request.getSession(); 
		String id = users.getId();
		String pw = users.getPassword();
		Users User = usersService.getUser(id);
		System.out.println("id:"+id);
		System.out.println("pw:"+pw);
		System.out.println("users:"+User);
		System.out.println("usersGetPw:"+ User.getPassword());
		//회원정보가 없을 때
		if(User == null) {
			System.out.println("존재 ㄴㄴ ");
			return "login";
		}
		//로그인 성공 
		else if(User != null && User.getPassword().equals(pw)) {
			System.out.println("성공 ! ");
			session.setAttribute("loginOK",User);
			System.out.println("로그인 세션:"+session.getAttribute("loginOK"));
			return "index";
		}
		System.out.println("비밀번호가 다름.");
		return "login";
	}
	@GetMapping("/logout")
	public String LogOut( HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		HttpSession session = request.getSession(); 
		session.removeAttribute("loginOK");
		System.out.println("로그아웃 세션:"+session.getAttribute("loginOK"));
		return "login";
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
