package kosa.api;

import java.util.Arrays;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC";
		String str2 = "ABC";
		String str3 = new String("ABC");

		if (str == str2 || str == str3) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

		String str4 = str.concat("def");
//		str.concat("def"); //ABC
		System.out.println(str4); // ABCdef
		// 불변성 =>StringBuffer/StringBuilder (가변성)
		StringBuffer sb = new StringBuffer("ABC");
		sb.append("def");
		System.out.println(sb);

		// 연산자로 가능
		String sql = "select * from board ";
		int num = 10;

		if (num == 10) {
			sql += "where num = 10";
		}
		System.out.println(sql);

		// 해당 문자열의 위치를 파악 => indexOf("문자열") => 있으면 :인덱스 없으면 :-1
		System.out.println(sql.indexOf("from"));
		// 길이
		System.out.println(sql.length());

//		for(int i =0;i<sql.length();i++) {
//			System.out.println(sql.charAt(i));
//		}
		System.out.println();

		// substring(5), substring(5, 10) //
		// sql변수 "board" 문자열만 출력
		System.out.println(sql.indexOf("board"));
		System.out.println(sql.substring(14, 20));
//		sql.subString(5);

		//
		String fileName = "kosa.jpg";
		String head = "";
		String pattern = "";
		head += fileName.substring(0, fileName.indexOf("."));
		pattern += fileName.substring(fileName.indexOf(".") + 1);
		System.out.println(head + " : " + pattern);

		String id = "kosa";
		String m_id = "Kosa";
		m_id = m_id.toLowerCase();

		if (id.equalsIgnoreCase(m_id)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

		// 문자열 => String[] 변환
		String fruits = "사과, 포도, 수박,배";
		String arr[] = fruits.split(",");
		System.out.println(Arrays.toString(arr));

		// => char[]
		String str5 = "abcdef";
		char arr2[] = str5.toCharArray();
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));

		// 문자열 => byte[]변환
		String str6 = "abcdef";
		byte arr3[] = str6.getBytes();
		System.out.println(Arrays.toString(arr3)); // 아스키코드값

		// => 정수형
		String str7 = "100";
		int num2 = Integer.parseInt(str7);
		System.out.println(num2);

		// 정수형 => 문자열
		int num3 = 10;
		String str8 = String.valueOf(num3);
		String str9 = 10 + "";

		if (fileName.endsWith("jpg")) {
			System.out.println("이미지파일");
		}
		
		
	}
}
