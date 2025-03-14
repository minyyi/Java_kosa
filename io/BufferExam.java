package kosa.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferExam {

	public static void main(String[] args) {
		// Scanner => 키보드로 입력
		// System.in => InputStream : byte읽어들이는 스트림 
		// => InputStreamReader : 자동으로 문자로 변환 
		//=> BufferedReader : 한줄씩 읽어들이기
		
//		InputStream in  = System.in;
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br = new BufferedReader(isr);
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt"));
			
			System.out.print("입력: ");
			String str = "";
			while((str = br.readLine()) != null) {
				str += "\n";
				bw.write(str);
			}
			System.out.println("쓰기완료");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				bw.close();
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		

	}

}
