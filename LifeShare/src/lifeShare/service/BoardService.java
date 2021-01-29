package lifeShare.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lifeShare.dao.BoardMapper;
import lifeShare.dto.Board;

@Service
public class BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
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
	
}
