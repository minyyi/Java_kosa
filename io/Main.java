package kosa.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Main {
	Member m;
	/*
	 * 객체 직렬화 (객체 => 파일)
	 **/

	public void insert() {
		m = new Member("홍길동");
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
			oos.writeObject(m);

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				oos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	// 객체를 역직렬화
	public void show() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("object.ser"));
			m = (Member) ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main mm = new Main();
		mm.insert();
		mm.m = null;
		mm.show(); // 역직렬화
		System.out.println(mm.m);
	}

}
