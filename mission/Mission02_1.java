package kosa.mission;

import java.util.Scanner;

public class Mission02_1 {

	public static double avr(double total) {
		double result = total / 3;
		return result;
	}

	public static void push(double arr[], double score, int i) {
		
			arr[i] = score;
	}

	public static void main(String[] args) {
		// 국어, 영어, 수학 => 키보드로 입력 배열로 구현해보기
		//평균도 배열로 =>메서드 정의 구현
		Scanner sc = new Scanner(System.in);
		int i = 0;
		double arr[] = new double [4];
		
//		{국어, 영어, }
		System.out.print("국어: ");
		double kor = sc.nextInt();
		push(arr, kor, i++);
//		i++;
		System.out.println(arr[0]);
		
		System.out.print("영어: ");
		double eng = sc.nextInt();	
		push(arr, eng, i++);
		System.out.println(arr[1]);
		System.out.print("수학: ");
		double mat = sc.nextInt();	
		push(arr, mat, i++);
		double total = kor + eng + mat;
		System.out.println(avr(total));
		double result = avr(total);
		push(arr, result, i);
		
//		push(arr)
//		arr[0] = ;
//		arr[1] = "eng";
//		arr[2] = "mat";
//		arr[3] = "avrg";
		
		System.out.print("{");
		int k = 0;
		for (k = 0; k<arr.length; k++) {
			System.out.print(arr[k]);
			if(k < arr.length-1) {
				System.out.print(", ");
			  }
		}
		
		System.out.print("}");
	}

}
