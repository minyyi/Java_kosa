package kosa.video;

import java.util.ArrayList;
import java.util.List;

import kosa.video.Video;

public class GeneralMember {
	// 아이디, 이름, 주소, 빌린비디오정보(번호, 제목, 배우)

	private String id;
	private String name;
	private String address;
	private Video retalvideos;
//	private List <Video> videos;

	public GeneralMember() {}

//	public GeneralMember(String id, String name, String address, Video videos) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.address = address;
//		this.videos = videos;
//	}
	public GeneralMember(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
//		courses = new ArrayList<Course>();
//		this.videos = videos;
	}
	public void printMember () {
		System.out.println("아이디: " + id);
		System.out.println("이름: " + name);
		System.out.println("주소: " + address);
		retalvideos.videoInfo();
//		System.out.println("대여한 비디오: " + );
	}
	public void rental(Video video) {
		this.retalvideos = video;
//		System.out.println(retalvideos);
//		videos =new ArrayList<Video>();
//	videos.addStudent(this); //this : register 매서드를 호출하는 student 객체 
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Video getVideos() {
		return retalvideos;
	}

	public void setVideos(Video retalvideos) {
		this.retalvideos = retalvideos;
	}

}
