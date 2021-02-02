package lifeShare.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@PostMapping("/searchBoard")
	public String search(ModelMap map, @RequestParam(required=false) String loc, 
			@RequestParam(required=false) String loc2, @RequestParam(required=false) String title ) throws Exception {
	
		Board board = new Board();
		board.setLoc(loc);
		board.setLoc2(loc2);
		board.setTitle(title);
		
		List<Board> boards = new ArrayList<Board>();
		boards = boardService.getsearchBoard(board);
		map.addAttribute("boards", boards);

		return "board";
	}
	
//		HttpServletRequest request, HttpServletResponse response
//		String loc = request.getParameter("loc");
//		String loc2 = request.getParameter("loc2");
//		String title = request.getParameter("title");
//		
//		Board board = new Board();
//		// 검색 객체 생성
//		board.setLoc(loc);
//		board.setLoc2(loc2);
//		board.setTitle(title);
//		
//		List<Board> boards = boardService.getBoards();
//		request.setAttribute("boardlist", boards);
//		
//		map.addAttribute("boards", boards);
//		Model model		
//		if(board.getLoc() != null) board.setLoc("%구");
//		if(board.getLoc2() != null) board.setLoc2("%시");		
//		model.addAttribute("boardlist", boardService.getBoards());
	
}
