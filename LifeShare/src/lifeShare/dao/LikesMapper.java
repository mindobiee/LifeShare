package lifeShare.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LikesMapper {
	public int addLike(String uid,int bid);
	public int deleteLike(String uid, int bid);
	public int findLike(String uid, int bid);
	
}
