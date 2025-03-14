package kosa.video;

public class SpecialMember extends GeneralMember {
 private int point;
 
 public SpecialMember() {}

public SpecialMember(String id, String name, String address, int point) { 
	super(id, name, address);
	this.point = point;
}

public void printSpecialMember() {
	System.out.println("아이디: " + getId());
	System.out.println("이름: " + getName());
	System.out.println("주소: " + getAddress());
	getVideos().videoInfo();
}

public int getPoint() {
	return point;
}

public void setPoint(int point) {
	this.point += point;
}
 
 
}
