package kosa.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar gc = Calendar.getInstance();
		gc.add(Calendar.DATE, 100);
//		System.out.println(gc);

		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd");
		String str = sdf.format(gc.getTime());
		System.out.println(str);

		Date now = new Date();
		String str2 = now.toString();
		System.out.println(str2);

		
		//키보드 => 날짜입력 2025/03/10 (문자열) =>Date객체로 변환
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Scanner sc = new Scanner(System.in);
		Date date = null;
		try {
			System.out.println("날짜 입력: ");
			String str3 = sc.nextLine();
			date = df.parse(str3); //문자열 =>Date
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		String str4 = sdf.format(date); //Date=>문자열
		System.out.println(str4);
		
		
		
		
	}

}
