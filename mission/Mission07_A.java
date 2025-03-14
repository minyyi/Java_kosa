package kosa.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission07_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//Random :랜덤 클래스
		Random r = new Random();
		int re = r.nextInt(100) + 1;
		System.out.println(re);
		int n = 0;
		int count = 0;
		
		while(true) {
			
			do {
				System.out.print("1~100 정수입력: ");
				n = sc.nextInt();
			}while(n > 100 || n < 1);
			count++;
			if(re == n) {
				System.out.println(count + "번째 성공했습니다!");
				break;
			}else if (re < n) {
				System.out.println("Down");
				
			}else if (re > n) {
				System.out.println("Up");
			}
		}
	}

}
