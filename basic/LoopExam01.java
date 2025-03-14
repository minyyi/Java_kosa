package kosa.basic;

import java.util.Scanner;

public class LoopExam01 {

	public static void main(String[] args) {
		// while : 초기식 - 조건식 - 명령문 - 증감식 -> 수직방향으로 기술
		// 1~10까지의 합

//		int sum = 0;
//		int i = 1;
//		
//		while (i <= 10) {
//			sum += i;
//			i++;
//		}
//		
//		System.out.println("1~10까지의 합: " + sum);
//				

		// 구구단 7단 출력
//		int seven = 7;
//		int i = 1;
//		
//		while ( i < 10) {
////			seven =  7 * i;
//			System.out.println("7 * " + i + "=" + seven*i);
//			i++;
//			
//		}

//		int init = 7;
//		int i = 1;
//		int end = 9;
//		while (i == end) {
////			result  = init * i;
//			System.out.printf("%d * %d = %d %n", init, i, init*i );
//			i++;

		/*
		 * for: 초기식 - 조건식 - 명령문 - 증감식 : 수평방향
		 */
		// 1~10합
//		int sum = 0;
//		for (int i = 1; i <=10; i++) {
//			sum += i;
//		}
//		System.out.println("합: " + sum);
//		
//		}
		// 1~100까지 숫자 중 2의 배수와 3의 배수가 아닌 숫자만 출력하시오.

//		for (int i = 1; 1<=100; i++)
//			if (!(i %2 == 0|| i%3 == 0)) {
//				//continue;
//				System.out.print(i + ",");
//				
//			}
//			
//		}

		// do-while
		// 키보드로부터 숫자를 입력, 음수입력 받으면 새로 입력 받도록 조치

		Scanner sc = new Scanner(System.in);

//		int n = 0;
//		do {
//			System.out.print("입력: ");
//			n = sc.nextInt();
//		} while (n < 0);
//		
//		System.out.println("입력결과: " + n);

		/*
		 * 퀴즈> 임의의 난수 3개를 받아서 서로 중첩되지 않도록 출력하기
		 */

		int n = (int) (Math.random() * 45) + 1;
//		System.out.println(n);
//		int a, b, c;
//		
//		for (int i = 0;i<10;i++) {
//			
//			a = (int)(Math.random() * 9) +1;
//		do {
//			b = (int)(Math.random() * 9) +1;
//			c = (int)(Math.random() * 9) +1;
//			
//		} while (a == b || a ==c || b == c);
//		
//		System.out.println("a: " +a +", b: " +b + ", c: " +c);
//			
//			
//			
//			System.out.println("a: " +a +", b: " +b + ", c: " +c);
//		}
//		System.out.println(n+", "+n+ );
	}
}
//}
