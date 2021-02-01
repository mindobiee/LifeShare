package lifeShare.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import lifeShare.dto.Board;

@Mapper
public interface BoardMapper {

	public Board getBoard(int i); // 아이디의 게시글 찾아오기

	public List<Board> getBoards(); // 게시글 모두 가져오기

	public void deleteBoard(Board board);// 게시글 삭제하기

	public void addBoard(@Param("board") Board board, @Param("img") byte[] img); // 게시글 추가하기

	public void updateBoard(@Param("board") Board board, @Param("img") byte[] img);// 게시글 업데이트

	/*
	 * public Map<String,Object> getByteImage(); //이미지 가져오기
	 */
	
	public List<Board> getBoardsLikes(); 
	public List<Board> getBoardsViews(); 
	public List<Board> myBoard(String id);


}
