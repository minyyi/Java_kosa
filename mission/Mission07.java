package kosa.mission;

import java.util.Scanner;

public class Mission07 {

	public static void main(String[] args) {
		//updown 게임구현
		/*
		 난수생성(1~100) 1개
		 키보드로부터 정수 입력 / 200=>다시입력
		 입력한 숫자 = 난수 ? "축하합니다. n번만에 성공" : up or down 출력		 
		 */
		Scanner sc = new Scanner(System.in);
		int n = (int)(Math.random() * 100) +1;
		
		int count = 0;
		
		while (true) {
			System.out.print("번호입력(1~100): ");
			int num = sc.nextInt();
			count++;
			if (n>num) {
				System.out.println("Up!");
			}else if (n < num) {
				System.out.println("Down!");
			}else {
				System.out.println("축하합니다!" + count + "번만에 성공!");
			}
		}
		
	}

	
	
}
