package lifeShare.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import lifeShare.dto.Board;

@Mapper
public interface BoardMapper_m {

	public Board getBoard(int i); // 아이디의 게시글 찾아오기

	public List<Board> getBoards(); // 게시글 모두 가져오기

	public void deleteBoard(Board board);// 게시글 삭제하기

	public void addBoard(@Param("board") Board board, @Param("img") byte[] img); // 게시글 추가하기

	public void updateBoard(@Param("board") Board board, @Param("img") byte[] img);// 게시글 업데이트

	
	//  이미지 관련 추가 
	public void saveBoard(Board board);
	
	public void saveImage(@Param("img")Map<String,Object> hmap, @Param("id")int id);
	/*
	 * public Map<String,Object> getByteImage(); //이미지 가져오기
	 */}
