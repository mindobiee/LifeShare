package lifeShare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import lifeShare.dto.Board;
import lifeShare.dto.Pagination;
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
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String list(ModelMap map, @RequestParam(required = false, defaultValue = "1") int page, @RequestParam(required = false, defaultValue = "1") int range) {
		int listCnt = boardService.getBoardListCnt();
		Pagination pagination = new Pagination();
		pagination.pageInfo(page, range, listCnt);

		map.addAttribute("pagination", pagination);
		List<Board> boards = boardService.getBoards(pagination);
		map.addAttribute("boards", boards);
		
		return "boardlist";
	}
	
	@RequestMapping(value = "/likes", method = RequestMethod.GET)
	public String list_likes(ModelMap map, @RequestParam(required = false, defaultValue = "1") int page, @RequestParam(required = false, defaultValue = "1") int range) {
		int listCnt = boardService.getBoardListCnt();
		Pagination pagination = new Pagination();
		pagination.pageInfo(page, range, listCnt);
		
		map.addAttribute("pagination", pagination);
		List<Board> boards = boardService.getBoardsLikes(pagination);
		map.addAttribute("boards", boards);
		
		return "boardlist";
	}
	
	@RequestMapping(value = "/views", method = RequestMethod.GET)
	public String list_views(ModelMap map, @RequestParam(required = false, defaultValue = "1") int page, @RequestParam(required = false, defaultValue = "1") int range) {
		int listCnt = boardService.getBoardListCnt();
		Pagination pagination = new Pagination();
		pagination.pageInfo(page, range, listCnt);
		
		map.addAttribute("pagination", pagination);
		List<Board> boards = boardService.getBoardsViews(pagination);
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
