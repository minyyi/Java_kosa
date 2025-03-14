package kosa.basic;

public class LoopExam02 {

	public static void main(String[] args) {
		// 중첩for문
//		for (int i = 1; i <= 9; i++) {
//			System.out.println("2 * " + i + "=" + (i * 2));
//		}
//		for (int i = 1; i <= 9; i++) {
//			System.out.println("3 * " + i + "=" + (i * 3));
//		}
		//구구단 출력
//		for (int i = 2; i <= 9; i++) { //각각의 단(2단, 3단) (내부 for문을 몇번 반복할지 이 for문으로 
//			for(int j = 1; j <= 9; j++) { //각 단의 내용 출력 (2단 내용 쭉)
//				System.out.println(i + " * " + j + "=" + (i * j));
//			}
//			System.out.println();
//		}
		
//		for (int i = 1; i <= 3; i++) { //각각의 단 (내부 for문을 몇번 반복할지 이 for문으로 
//			for(int j = 1; j <= 2; j++) { //각 단의 내용 출력
//				System.out.println("i: " +i + ", j: " +  j);
//			}
//			System.out.println();
//		}
		
		
//		4x + 5y = 60 => x, y를 구하자 (모두)
		for (int x = 0; x <=60; x++) { //각각의 단 (내부 for문을 몇번 반복할지 이 for문으로 
			for(int y = 0; y <= 60; y++) { //각 단의 내용 출력
				int result = 4 * x + 5 * y; 
				 if(result== 60) {
					 System.out.println("x: " +x + ", y: " +  y);
				 }
			}
		}
		System.out.println();
		
//			for (int x = 0; x <=15; x++) { //각각의 단 (내부 for문을 몇번 반복할지 이 for문으로 
//			for(int y = 0; y <= 12; y++) { //각 단의 내용 출력
////				int result = 4 * x + 5 * y;
//				 if((4 * x) + (5 * y) == 60) {
//					 System.out.println("x: " +x + ", y: " +  y);
//				 }
//			}
//		}
		
	}
}
