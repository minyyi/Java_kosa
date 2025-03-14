package kosa.basic;

public class VariableExam01 {

	public static void main(String[] args) {
		//메소드 안에 있는 변수는 로컬변수
		//변수는 데이터를 담는 그릇, 데이터 종류는 다양( ex. 홍길동, 100, 3.14, boolean...)
		/*기본형 데이터타입(primitive type)
		 byte, short, int, long =>정수형
		 float, double=>실수형
		 char=>문자형(문자1개)
		 boolean=>논리형
		 + String =>문자형 (ObjectType이지만 기본형만큼 많이 사용)
		 */
		int num; //변수 선언 =>메모리 할당
		int arr[]; // 배열 선언 : ObjectType 레퍼런스형/참조형(카드처럼) - 주소값참조
		
		num = 100; // 변수 초기화
		
		int num2 ;//지역변수는 반드시 초기화 후 사용
//		System.out.println(num2); // error: The local variable num2 may not have been initialized

		int num3 = 200; //변수 선언과 초기화 동시에 =>로직에 따라 
		System.out.println("숫자:" + num3); //이렇게 출력하면 String 형으로 출력됨.
		
		/* 변수 선언시 유의사항
		 1. 특수문자 X
		 2. 숫자로 시작 X
		 3. 예약어 X
		 4. 소문자로 표현 (카멜표기법)
		 */
		
		/*
		 * 기본리터럴 ("", true, 10, 3.14(double) ...)
		  -기본으로 가지고 있는 데이터타입
		  -
		 */
		
		//float num4 = 3.14; // double num5 = 3.14;
		float num4 = 3.14f; // 플로트는 f붙이면 캐스팅되어서 형변환 가능
		/*
		 *casting(형변환) 기준
		  byte(1byte) < short(2) < int(4) < long(8) < float(4) < double(8) < String
		  +int <==>char
		 */
		
		double b =3.14;
		int c = (int)b; //강제 형변환
		System.out.println(c);// 3 -> 데이터 손실 발생
		
		double e = c; //암묵적 형변환
		System.out.println(e);
		
		long num5 = 100; //int ->long 
		//long num5 = 100L; //long ->long
		
		int num6 = 010; //8진수로 인식 0으로 시작하는 숫자
	}

}
