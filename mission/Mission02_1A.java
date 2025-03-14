package kosa.mission;

import java.util.Scanner;

public class Mission02_1A {
	public static void average(int arr[]) {
		arr[4] = arr[3] /3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String subject[] = {"국어", "영어", "수학"};
		int arr[] = new int [5];
		
		for (int i = 0; i < 3; i++) {
			System.out.print(subject[i] + "입력: ");
			arr[i] = sc.nextInt();
			arr[3] += arr[i];
//			arr[4] = arr[3] /3;
		}
//		System.out.println(arr[4]);
		average(arr);
//		System.out.println(arr[4]);
		System.out.println("국어\t영어\t수학\t총점\t평균");
		for (int n : arr) {
			System.out.print(n + "\t");
		}
	}

}
