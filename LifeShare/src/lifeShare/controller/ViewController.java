package lifeShare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller 
@RequestMapping(path = "/" )
public class ViewController {	
		
		//메인 페이지 
		@GetMapping
		public String home() {
			return "index";
		}
		//로그인 페이지 
		@GetMapping("/login")
		public String login() {
			return "login";
		}
		//회원가입 페이지 
		@GetMapping("/join")
		public String join() {
			return "join";
		}
}

