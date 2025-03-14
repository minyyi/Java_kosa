package kosa.oop;

public class StaticExam {

	 int total; //필드 => 메모리 : 객체생성, 필드의 초기값 
	 static int grandTotal; //정적변수, static변수, 클래스 변수 => 클래스로딩 =>공용변수 클래스이름.변수 로 호출
	 
	 public void add() {
		 total += 10;
		 grandTotal += 10;
	 }
	 public static void add2() {
		 //total += 10;//static 메서드 안에는 static변수만 사용 가능 (생성 시점이 다르기 때문)
		 grandTotal += 10;
//		 System.out.println("static");
	 }
	   
	 public static void main(String[] args) {
		 
		 add2();
//		 StaticExam se = new StaticExam();
//		 StaticExam se2 = new StaticExam();
//		 se.add();
//		 se2.add();
//		 System.out.println("total: "+ se.total );
//		 System.out.println("grandTotal: "+ StaticExam.grandTotal );
//		 System.out.println("total: "+ se2.total );
//		 System.out.println("grandTotal: "+ StaticExam.grandTotal );
		 
	 }

}
