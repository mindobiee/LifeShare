package lifeShare.dao;

import org.apache.ibatis.annotations.Mapper;

import lifeShare.dto.Likes;

@Mapper
public interface LikesMapper {
	public int addLike(String uid,int bid);
	public int deleteLike(String uid, int bid);
	public int findLike(String uid,int bid);
	
}
