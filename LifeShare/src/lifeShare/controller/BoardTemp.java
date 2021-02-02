package lifeShare.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import lifeShare.dto.Board;
import lifeShare.dto.Pagination;
import lifeShare.dto.Users;
import lifeShare.service.BoardService;
import lifeShare.service.BoardServiceTemp;

@Controller
@RequestMapping(path = "/board")
public class BoardTemp {

	@Autowired
	private BoardServiceTemp boardService;

	// 게시물 업로드하기
	@RequestMapping(value = "/uploads")
	public String uploadBoard(@ModelAttribute Board board, MultipartHttpServletRequest req, HttpServletRequest request) {

		MultipartFile file = board.getImgFile();
		HttpSession session = request.getSession();
		Users user = (Users)session.getAttribute("loginOK");
		String uid= user.getId();
		if(uid==null)
			return "redirect:/board";
		else
			board.setUid(uid); //uid 넣기 
		System.out.println(board);
		byte[] img=null;
		if (!file.getOriginalFilename().isEmpty()) {
			try {
				img = board.getImgFile().getBytes();
				board.setImg(img);//이미지 넣기 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		boardService.addBoard(board);
		return "redirect:/board";
	}

	// bid를 받으면 해당 리스트가 뿌려질 수 있게 !
//	@RequestMapping(value = "/show/img/{num}")
//	public void ImageView(HttpServletRequest req, HttpServletResponse res, @PathVariable("num") int num)
//			throws IOException {
//		res.setContentType("image/jpeg");
//		Map<String,Object> map = boardService.getImage(num);
//		byte[] imagefile = (byte[]) map.get("IMG");
//		InputStream in1 = new ByteArrayInputStream(imagefile);
//		IOUtils.copy(in1, res.getOutputStream());
//	}
	@RequestMapping(value = "/show/img/{num}")
	public ResponseEntity<byte[]> ImageView(@PathVariable("num") int num)
	{
		Map<String,Object> map = boardService.getImage(num);
		byte[] imagefile = (byte[]) map.get("IMG");
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.IMAGE_PNG);
		return new ResponseEntity<byte[]>(imagefile, headers,HttpStatus.OK);
	}

	@GetMapping(value = "/show/{num}")
	public String getUser(@PathVariable("num") int num, ModelMap model) {
		Board board = boardService.getBoard(num);
		model.addAttribute("boards", board);
		return "boardshow";
	}

}
