package kosa.mission;

import java.util.Scanner;

public class Mission03 {
	public static void main(String[] args) {
		//임의의 정수값에 대해서 전체 자리수 중 짝수, 홀수의 개수를 구하자
		//5자리수 ex.12345 짝수개수 : 2개 홀수개수: 3개
		Scanner sc = new Scanner(System.in);
		
		System.out.print("5자리숫자: ");
		int num = Integer.parseInt(sc.nextLine()); //sc.nextInt()
		int even = 0;
		int odd = 0;
		
		even += (num / 10000) % 2 == 0 ? 1 : 0;
		even += (num / 1000)%10 % 2 == 0 ? 1 : 0;
		even += (num / 100) % 10% 2 == 0 ? 1 : 0;
		even += (num / 10) %10% 2 == 0 ? 1 : 0;
		even += num % 2 == 0 ? 1 : 0;
		odd = 5 - even;
		
		System.out.println("짝수의 개수: " + even);
		System.out.println("홀수의 개수: " + odd);
	
		
//		int a = (num / 10000) % 2 == 0 ? even : odd; 
//		int b = (num / 1000) % 2 == 0 ? even : odd; 
//		int c = (num / 100) % 2 == 0 ? even : odd; 
//		int d = (num / 10) % 2 == 0 ? even : odd; 
//		int e = num  % 2 == 0 ? even : odd; 
////		
//		int result = a + b + c + d + e; 
//		 
//		System.out.println("짝수의 갯수: " + (5 - result));
//		System.out.println("홀수의 갯수: " + result);
//		System.out.print(a);
//		System.out.print(b);
//		System.out.print(c);
//		System.out.print(d);
//		System.out.print(e);
		
		
		 
	}
}
