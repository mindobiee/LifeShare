package lifeShare.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lifeShare.dao.BoardMapper;
import lifeShare.dao.BoardMapperTemp;
import lifeShare.dto.Board;
import lifeShare.dto.Pagination;

@Service
public class BoardServiceTemp {

	@Autowired
	private BoardMapperTemp boardMapper;
	
	public void addBoard(Board board, byte[] hmap) {	
		boardMapper.addBoard(board, hmap);
	}
	
	public Board getBoard(int id) {
		return boardMapper.getBoard(id);
	}
	
	public Map<String,Object> getImage(int id) { //그 번호에 해당하는 이미지 ??
		return boardMapper.getImage(id);
	}
	
}
