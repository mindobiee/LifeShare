package lifeShare.controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import lifeShare.dto.Board;
import lifeShare.dto.Image;
import lifeShare.service.BoardService;
import lifeShare.service.BoardService_m;

@Controller 
@RequestMapping(path = "/board" )
public class BoardController_m {

	@Autowired
	private BoardService_m boardService;
	
	
	@RequestMapping(value="/uploads")
	public String uploadBoard(@ModelAttribute Board board, Image image) {
		
		if(board.getUid()==null)
			return "redirect:/board";
		
		try {
			boardService.uploadBoard(board);
			System.out.println(board);
			System.out.println(image);
			Map<String,Object> hmap = new HashMap<String,Object>();
			hmap.put("img",image.getImage().getBytes());
			int id=board.getBid();
			boardService.uploadImage(hmap, id);
			//이미지 저장은 따로 하기 
//			try {
//				Map<String,Object> hmap = new HashMap<String,Object>();
//				hmap.put("img",board.getImgFile().getBytes());
//				int id=board.getBid();
//				boardService.uploadImage(hmap,id);
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "redirect:/board";
	}
	
	
	
}
