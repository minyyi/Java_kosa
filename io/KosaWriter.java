package kosa.io;

import java.io.FileWriter;
import java.util.Scanner;

public class KosaWriter {

	public static void main(String[] args) {
		// 키보드로부터 문자열을 입력받아 파일에 쓰는 예제 구현
		//q입력하기 전까지 문자열을 파일에 쓰도록
		
		Scanner sc = new Scanner(System.in);
		
		FileWriter writer = null;
		String str = "";
		String poem = "";
		System.out.print("입력: ");
//		str = sc.nextLine();
		
		while(!(str = sc.nextLine()).equals("q")) {
			poem += str;
			poem += "\n";	
		}
		try {
			writer = new FileWriter("poem2.txt");  // 파일이 없으면 알아서 파일 생성해줌. 있으면 덮어씀
			writer.write(poem);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close(); //반드시!!! 해야만 쓰기모드가 가능함!!
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		

	}

}
