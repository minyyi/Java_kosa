package kosa.io;

import java.io.FileReader;

public class KosaReader {
 public static void main(String args[]) {
	 //poem.txt 에서 문자열 데이터 읽어오기
	 FileReader reader = null;  //밖에 선언해야 close까지 가능??
	 char arr[] = new char[256];
	 
	 try {
		//FileReader 생성
		 reader = new FileReader("poem.txt");
		 
		 while(true) {
//			 int data = reader.read(); // int data : 아스키코드값 or -1 읽기 때문 
			 int data = reader.read(arr);
			 if(data == -1) {
				 break;
			 }
//			 System.out.print((char)data);
			 System.out.print(arr);
		 }
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			reader.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	 
 }
}
