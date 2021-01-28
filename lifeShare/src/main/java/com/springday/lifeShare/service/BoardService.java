package com.springday.lifeShare.service;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springday.lifeShare.dao.BoardMapper;
import com.springday.lifeShare.vo.Board;

@Service
public class BoardService {

	//CRUD(게시판)
	@Autowired
	private BoardMapper boardMapper;
	
	public void addBoard(Board board) {	
		boardMapper.addBoard(board);
	}
	
	public List<Board> getBoards(){
		return boardMapper.getBoards();
	}
	
	public Board getBoard(int id) {
		return boardMapper.getBoard(id);
	}
	
	public void updateBoard(Board board) {
		boardMapper.updateBoard(board);
	}
	
	//이미지 업로드 -> 이미지를 byte[]로 변환 !
//	public byte[] imageToByteArray(String filePath) throws Exception{
//		byte[] returnValue=null;
//		
//		ByteArrayOutputStream baos = null;
//		FileInputStream fis = null;
//		
//		try {
//			baos=new ByteArrayOutputStream();
//			fis=new FileInputStream(filePath);
//			
//			byte[] buf=new byte[1024];
//			int read=0;
//			
//			while((read=fis.read(buf,0,buf.length))!=-1) {
//				baos.write(buf,0,read);
//			}
//			returnValue=baos.toByteArray(); //이부분 !! 
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			if(baos!=null) baos.close();
//			if(fis!=null) fis.close();
//		}
//		return returnValue;
//	}
	
}
