package kosa.relation;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Course> courses; // 학생이 수강신청한 과목들

	public Student () {}
	
	public Student(String name) {
		super();
		this.name = name;
		courses = new ArrayList<Course>();
	}
	
	public void register(Course course) {
		courses.add(course);
		course.addStudent(this); //this : register 매서드를 호출하는 student 객체 
	}
	
	public void printMember() {
		System.out.println("학생이름: " + name);
		for(Course course : courses) {
			System.out.println("수강과목: " + course.getCourseName());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
