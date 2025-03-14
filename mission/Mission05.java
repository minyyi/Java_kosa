package kosa.mission;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// 문자열 비교 메소드 : string.equals("문자열")
//		String a = "aaa";
//		String b= "aaa";
//		
//		if (a.equals(b)) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
//		두 정수와 연산자 문자열을 입력 받습니다. 
//		사칙연산 계산기 만들어보자.
//		ex. 정수 1: 50, 정수 2: 20, 연산자: +,결과: 70
		
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("정수 1: ");
	 double num1 = Integer.parseInt(sc.nextLine()); //암묵적 형변환
	 System.out.print("정수 2: ");
	 double num2 = Integer.parseInt(sc.nextLine());
	 System.out.print("연산자: ");
	 String cal = sc.nextLine();
	 double result = 0;
//	 
//	 
//	 if ("+".equals(cal)) {
//		 System.out.println(num1 + num2);
//	 } else if("*".equals(cal)) {
//		 System.out.println(num1 * num2);
//	 } else if("-".equals(cal)) {
//		 System.out.println(num1 - num2);
//	 } else if("/".equals(cal)) {
//		System.out.println(num1 / num2);
//	 } else {
////		System.out.println("입력을 다시 확인해주세요.");
//	 }
	 
//	switch (cal) {
//	case "+":
//		result = num1 + num2;
//		break;
//	case "-":
//		result = num1 - num2;
//		break;
//	case "*":
//		result = num1 * num2;
//		break;
//	case "/":
//		result = num1 / num2;
//		break;
//
//	default:
//		break;
//	}
	 
	 if(cal.equals("+")) {
		 result = num1 + num2;
	 }else if(cal.equals("-")) {
		 result = num1 - num2;
	 }else if(cal.equals("*")) {
		 result = num1 * num2;
	 }	 else if(cal.equals("/")) {
			 result = num1 / (double)num2;
	 }
//	 System.out.printf("결과: %.3f%n", result);
	 DecimalFormat df = new DecimalFormat("#.##");
	 System.out.println("결과: " + df.format(result));
	}

}
