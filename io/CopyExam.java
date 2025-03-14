package kosa.io;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyExam {

	public static void main(String[] args) {
		//poem2.txt => poem3.txt : 복사를 구현 
		
		FileReader reader = null;
		FileWriter writer = null;
//		char arr[] = new char[1000];
		
		try {
			reader = new FileReader("poem2.txt");
			writer = new FileWriter("poem3.txt");  // 파일이 없으면 알아서 파일 생성해줌. 있으면 덮어씀
			while(true) {
//				int data = reader.read(arr);
				int data = reader.read();
				System.out.println(data);
				if(data == -1) {
					return;
				}
//				writer.write(arr.toString());
				writer.write((char)data);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				reader.close();
				writer.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
