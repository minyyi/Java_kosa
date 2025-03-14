package kosa.basic;

import java.util.Scanner;

public class VariableExam02 {

	public static void main(String[] args) {

//		System.out.println("첫번째줄");
//		System.out.println("두번째줄"); //개행이 일어남
//		
//		System.out.print("1,");
//		System.out.print("2,"); //개행 X 나열
//		System.out.println();
//		System.out.print("3,");
		
		// 키보드로부터 데이터 입력
		//Scanner sc = new Scanner(System.in) //error :Scanner cannot be resolved to a type = lang패키지에 찾을 수 없어!
		Scanner sc = new Scanner(System.in);
				
		System.out.print("정수입력: ");
		 int num = Integer.parseInt(sc.nextLine());// 문자열=>정수형 sc.nextLine(): 한줄 전체 문자로 받음.
		/*버그해결방법
		1. int num = sc.nextInt();
		   sc.nextLine(); //문자열
		2. int num = Integer.parseInt(sc.nextLine());// 문자열=>정수형 sc.nextLine(): 한줄 전체 문자로 받음.
		 */
		System.out.print("문자입력: ");
		String str = sc.nextLine();
		
				System.out.println(num);
				System.out.println(str);

	}

}
