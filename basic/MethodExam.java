package kosa.basic;

public class MethodExam {
	
	public static void printChar(char ch, int num){ //메서드의 시그니쳐 ,두개 다 넣어야함. 데이터도 일치
		for (int i=1; i<= num; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static void main(String[] args) {
		// Method
//		접근제어자, (static), return 형(!= void) , 메서드 이름(parameter 전달)
//      parameter = 쌀, return 값 = 떡
//		printChar('#',10);
//		printChar('?',10);
//		printChar('$',10);
	 	int result = add(2,3); //리턴값이 있어서 변수에 할당 가능
		System.out.println("결과: " + result);
		System.out.println("결과: " + add(10,20));
		
	}

}
