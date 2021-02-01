package lifeShare.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.cj.Query;

import lifeShare.dao.BoardMapper;
import lifeShare.dao.BoardMapper_m;
import lifeShare.dto.Board;

@Service
public class BoardService_m {

	@Autowired
	private BoardMapper_m boardMapper;
	
	public void addBoard(Board board, byte[] hmap) {	
		boardMapper.addBoard(board, hmap);
	}
	
	public List<Board> getBoards(){
		return boardMapper.getBoards();
	}
	
	public Board getBoard(int id) {
		return boardMapper.getBoard(id);
	}
	 
	public void updateBoard(Board board,byte[] hmap) {
		boardMapper.updateBoard(board,hmap);
	}
	//이미지 관련 수정
	public void uploadBoard(Board board) {	
		boardMapper.saveBoard(board);
	}
	public void uploadImage(Map<String,Object> hmap, int id){
		boardMapper.saveImage(hmap,id);
	}
	
	
}
