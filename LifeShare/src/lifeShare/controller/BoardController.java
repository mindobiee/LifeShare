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
@RequestMapping(path = "/board" )
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/form")
	public String boardform() {
		return "boardform";
	}
	
	@RequestMapping(value="/saveImage")
	public String saveImage(Board board) {
		try {
			//Map<String, Object> hmap=new HashMap<String, Object>();
			//hmap.put("imag",board.getImgFile().getBytes());
			
			byte[] img = board.getImgFile().getBytes();
			boardService.addBoard(board, img);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "redirect:/boardform";
	}
	
	@GetMapping
	public String list(ModelMap map) {
		
		List<Board> boards = boardService.getBoards();
		map.addAttribute("boards", boards);
		
		return "boardlist";
	}
	
}
