package kosa.mission;

import java.util.Scanner;

public class Mission02_2 {

	public static void main(String[] args) {
		// 성적관리프로그램에서 여러명의 성적관리를 구현해보자.
		// 1명 => int arr[] =new int[5]
		// 여러명 => int arr[][] =new int[10][5]
		/*
		 * 번호 국어 영어 수학 총점 평균 
		  	1    90 80 80 250 85 
		    =================== 
		    총점(과목 평균 별)
		 */
//		Scanner sc = new Scanner(System.in);
		int score[][] = { { 90, 80, 70 }, { 50, 40, 30 } };// [2][3]\
//						       [0][0],  [0][],  [1][0]
		// 과목별 총점
		int korTotal = 0;
		int engTotal = 0;
		int matTotal = 0;
		System.out.println("번호   국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			int avg = 0;
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			matTotal += score[i][2];
			
			System.out.print((i + 1) + "\t");
			for (int j = 0; j < score[i].length; j++) { // 과목별 점수

				sum += score[i][j];
//				if (j == 0) {
//					korTotal += score[i][j];
//				}
//				if (j == 1) {
//					engTotal += score[i][j];
//				}
//				if (j == 2) {
//					matTotal += score[i][j];
//				}
				System.out.print(score[i][j] + "\t");
			}
			avg = sum / score[i].length;
			System.out.print(sum + "\t");
			System.out.print(avg);
			System.out.println();
		} // end outer for
		System.out.println("====================");
//		System.out.print("총점  ");
		System.out.print("\t" + korTotal);
		System.out.print("\t" +engTotal);
		System.out.print("\t" +matTotal);
		System.out.println();
		System.out.print("\t" + korTotal / score.length);
		System.out.print("\t" + engTotal / score.length);
		System.out.print("\t" + matTotal / score.length);
		

//		int korTotal = score[0][0] + score[1][0];
//		int engTotal = score[0][1] + score[1][1];
//		int korTotal = score[0][2] + score[1][2];

//		for()

	}

}
