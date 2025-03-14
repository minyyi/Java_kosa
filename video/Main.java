package kosa.video;

public class Main {

	public static void main(String[] args) {
		Video v1 = new Video("1", "파묘", "최민식");
		Video v2 = new Video("2", "쿵더펜더2", "지성민");

//		GeneralMember m1 = new GeneralMember("aaa", "홍길동", "동탄");
//		GeneralMember m2 = new GeneralMember("bbb", "김철수", "서울");
		
//		SpecialMember s1 = new SpecialMember("bbb", "김철수", "서울");
		SpecialMember s1 = new SpecialMember("bbb", "김철수", "서울", 100);
		

//        v1.videoInfo();
//		m1.rental(v1);
//		m1.printsm(10);
//		m1.printMember();
//		System.out.println("=============");
//		m2.rental(v2);
//		m2.printMember();
//		s1.printSm();
//		v1.videoInfo();
		s1.rental(v2);
		s1.printSpecialMember();
//		s1.setPoint(10);
//		s1.printSm();
	}

}
