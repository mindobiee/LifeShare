package lifeShare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lifeShare.dao.BoardMapper;
import lifeShare.dto.Board;
import lifeShare.dto.Pagination;

@Service
public class BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	public void addBoard(Board board, byte[] hmap) {	
		boardMapper.addBoard(board, hmap);
	}
	
	public List<Board> getBoards(Pagination pagination){
		return boardMapper.getBoards(pagination);
	}
	public List<Board> getBoardsMain(){
		return boardMapper.getBoardsMain();
	}
	
	public Board getBoard(int id) {
		return boardMapper.getBoard(id);
	}
	
	public void updateBoard(Board board,byte[] hmap) {
		boardMapper.updateBoard(board,hmap);
	}
	
	public List<Board> getBoardsLikes(Pagination pagination){
		return boardMapper.getBoardsLikes(pagination);
	}
	public List<Board> getBoardsLikesMain(){
		return boardMapper.getBoardsLikesMain();
	}
	
	public List<Board> getBoardsViews(Pagination pagination){
		return boardMapper.getBoardsViews(pagination);
	}
	
	public int getBoardListCnt() {
		return boardMapper.getBoardListCnt();
	}
	public List<Board> myBoard(String id) {
		return boardMapper.myBoard(id);
	}
	
	public List<Board> getsearchBoard(Board board) {
		return boardMapper.getsearchBoard(board);
	}
	
	public List<Board> getBoardsCategory(String category){
		return boardMapper.getBoardsCategory(category);
	}
}
