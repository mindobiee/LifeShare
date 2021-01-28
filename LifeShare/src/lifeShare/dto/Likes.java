package lifeShare.dto;

public class Likes {
	private int lid;
	private int bid;
	private int uid;
	private int islike;
	public Likes() {
		
	}
	public Likes(int lid, int bid, int uid, int islike) {
		super();
		this.lid = lid;
		this.bid = bid;
		this.uid = uid;
		this.islike = islike;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getIslike() {
		return islike;
	}
	public void setIslike(int islike) {
		this.islike = islike;
	}
	@Override
	public String toString() {
		return "Likes [lid=" + lid + ", bid=" + bid + ", uid=" + uid + ", islike=" + islike + "]";
	}
	
	
}
