package kosa.baseball;

import java.util.Scanner;

public class Main_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseBall b = new BaseBall();
		Scanner sc = new Scanner(System.in);
		
		int strike = 0;
		int ball = 0;
		int count = 0;
		int input[] = new int[3];
		
		do {
			System.out.println("게임 도전");
			System.out.println("숫자(3자리) 입력");
			for (int i = 0; i < 3; i++) {
				input[i] = sc.nextInt();
				System.out.println(input[i] + ", ");
				}
			strike = b.countStrike(input);
			ball = b.countBall(input);
			System.out.println(strike + "S" + ball + "B");
			count++;
		}while(strike != 3);
		System.out.println(count + "번째 성공했습니다.");
	}

}
