package lifeShare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import lifeShare.dto.Board;
import lifeShare.service.BoardService;

@Controller 
@RequestMapping(path = "/board" )
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/form")
	public String boardform() {
		return "boardform";
	}
	
	@RequestMapping(value="/upload")
	public String uploadBoard(@ModelAttribute Board board) {
		try {
			byte[] img = board.getImgFile().getBytes();
			boardService.addBoard(board, img);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "redirect:/board";
	}
	
	@GetMapping
	public String list(ModelMap map) {
		
		List<Board> boards = boardService.getBoards();
		map.addAttribute("boards", boards);
		
		return "boardlist";
	}
	
//	@GetMapping(value="/searchBoard")
	public String search(Board board) {
//		if(board.getLoc() != null) board.setLoc("%구");
//		if(board.getLoc2() != null) board.setLoc2("%시");		
//		map.addAttribute("", BoardService.get)
		return "index";
	}
	
}
