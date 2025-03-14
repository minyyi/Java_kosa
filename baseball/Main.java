package kosa.baseball;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Random :랜덤 클래스
//		int r;
		int answer[] = new int[3];

		for (int i = 0; i < 3; i++) {

			answer[i] = (int) (Math.random() * 9) + 1;
			do {
				answer[1] = (int) (Math.random() * 9) + 1;
				answer[2] = (int) (Math.random() * 9) + 1;
//				b = (int)(Math.random() * 9) +1;
//				c = (int)(Math.random() * 9) +1;
//				
			} while (answer[0] == answer[1] || answer[0] == answer[2] || answer[1] == answer[2]);
			System.out.print(answer[i]);
		} // 중복 빼기
		System.out.println();
		int my[] = new int[3];
//		System.out.println(re);
		int n = 0;
		int count = 0;

		while (true) {

			do {
				System.out.print("세자리 정수입력: ");
				n = sc.nextInt();
				my[0] = (int) (n / 100);
				my[1] = (int) (n / 10) % 10;
				my[2] = (int) (n % 10);

			} while (n > 999 || n < 100);
			int strike = 0;
			int ball = 0;
			count++;
			for (int k = 0; k < 3; k++) {
				for (int j = 0; j < 3; j++) {
					if (answer[k] == my[j]) {
						if (k == j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			if (strike == 3) {
				System.out.println(strike + "strike!!" + count + "번째 성공했습니다!");
				return;
			}
			System.out.println(strike + "s" + ball + "b");

		}

	}

}
