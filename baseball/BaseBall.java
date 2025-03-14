package kosa.baseball;

import java.util.Arrays;

public class BaseBall {
//난수 생성(중복X)
	private int hidden[];
	
	public BaseBall() {
		hidden = new int[3];
		hidden[0]= (int)(Math.random() *9) +1;
		do {
			hidden[1]= (int)(Math.random() *9) +1;
		}while(hidden[0] == hidden[1]);
		do {
			hidden[2]= (int)(Math.random() *9) +1;
		}while(hidden[0] == hidden[2] || hidden[1] == hidden[2]);
		System.out.println("정답: " + Arrays.toString(hidden));
	}
	
	//스트라이크 체크
	public int countStrike(int input[]) {
		int strike = 0;
		for (int i = 0; i < 3; i++) {
			if(hidden[i] == input[i]) {
				strike++;
			}
		}
		return strike;
	}
	//볼 체크
	public int countBall(int input[]) {
		int ball = 0;
		for (int i = 0; i < 3; i++) {
			if(hidden[i] == input[(i+1)%3]) {
				ball++;
			}
			if(hidden[i] == input[(i+2)%3]) {
				ball++;
			}
		}
		return ball;
	}
	
}
