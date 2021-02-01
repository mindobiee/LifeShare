package lifeShare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lifeShare.dto.Board;
import lifeShare.service.BoardService;


@Controller 
@RequestMapping(path = "/" )
public class ViewController {	
		
		@Autowired
		private BoardService boardService;
	
		//메인 페이지 
		@GetMapping
		public String main(ModelMap model) {
			List<Board> list_likes = boardService.getBoardsLikes();
			List<Board> list = boardService.getBoards();
			model.addAttribute("list_likes" , list_likes);
			model.addAttribute("list" , list);
			return "index";
		}
		//메인 페이지 
		@GetMapping("/home")
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

