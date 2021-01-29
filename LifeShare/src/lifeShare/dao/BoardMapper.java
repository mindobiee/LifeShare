package lifeShare.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import lifeShare.dto.Board;

@Mapper
public interface BoardMapper {
	
	public Board getBoard(int i); 		//아이디의 게시글 찾아오기
	public void addBoard(Board board); 	//게시글 추가하기
	public List<Board> getBoards(); 	//게시글 모두 가져오기
	public void updateBoard(Board board);//게시글 업데이트 
	public void deleteBoard(Board board);//게시글 삭제하기

}
