package kosa.video;

import kosa.video.GeneralMember;

public class Video {
//번호, 제목, 배우
	private String videoNo;
	private String videoTitle;
	private String videoAct;

	public Video() {
	}

	public Video(String videoNo, String videoTitle, String videoAct) {
		super();
		this.videoNo = videoNo;
		this.videoTitle = videoTitle;
		this.videoAct = videoAct;
	}

	public void videoInfo() {

		System.out.println("빌린 비디오번호: " + videoNo);
		System.out.println("제목: " + videoTitle);
		System.out.println("주인공: " + videoAct);
	}
//	public void addMember(Student student) {
//		.add(student);
//		
//	}

	public String getVideoNo() {
		return videoNo;
	}

	public void setVideoNo(String videoNo) {
		this.videoNo = videoNo;
	}

	public String getVideoTitle() {
		return videoTitle;
	}

	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}

	public String getVideoAct() {
		return videoAct;
	}

	public void setVideoAct(String videoAct) {
		this.videoAct = videoAct;
	}

}
