package lifeShare.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

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
	public String uploadBoard(MultipartHttpServletRequest request) {
		
		if(request.getParameter("uid")==null)
			return "redirect:/board";
		Board board = new Board();
		board.setUid(request.getParameter("uid"));
		board.setTitle(request.getParameter("title"));
		board.setCategory(request.getParameter("category"));
		board.setBtype(request.getParameter("btype"));
		board.setContent(request.getParameter("content"));
		board.setLoc(request.getParameter("loc"));
		board.setLoc2(request.getParameter("loc2"));
	
		System.out.println(board);
		MultipartFile mf = request.getFile("image");
		
		String path=request.getRealPath("images");
		String fileName = mf.getOriginalFilename();
		File uploadFile = new File(path+"//"+fileName);
		
		try {
			mf.transferTo(uploadFile);
		}catch(IllegalStateException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
			
		board.setFileName(fileName);
		boardService.uploadBoard(board);
		
		return "redirect:/board";
	}
	
	
	
}
