package lifeShare.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import lifeShare.dto.Users;


@Controller 
@RequestMapping(path = "/" )
public class ViewController {	
		
		//메인 페이지 
		@GetMapping
		public String main() {
			return "index";
		}
		//메인 페이지 
		@GetMapping("/home")
		public String home() {
			return "index";
		}
		//로그인 페이지 
		@GetMapping("/login")
		public String login(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException  {
			HttpSession session = request.getSession();
			if(session.getAttribute("msg")!=null)
			session.removeAttribute("msg");
			return "login";
		}
		//회원가입 페이지 
		@GetMapping("/join")
		public String join() {
			return "join";
		}
}

