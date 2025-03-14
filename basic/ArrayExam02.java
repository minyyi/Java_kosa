package kosa.basic;

public class ArrayExam02 {

	public static void main(String[] args) {
		/*
		 * 2차 array 1. 2차원 배열의 크기가 결정 (대부분) int arr[][]; arr = new int[3][2];
		 * 
		 * 2. 2차원 배열의 크기가 다를 때 int arr[][] = new int[3][]; arr[0] = new int[2]; arr[1] =
		 * new int[3]; arr[2] = new int[4];
		 * 
		 * 3. 2차원 배열도 선언, 생성, 초기화 한번에 int arr[][] = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}} //
		 * [3][]
		 * 
		 */

		// int arr[][] = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}} 배열 전체 출력해보세요

		int arr3[][] = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };
		System.out.print("{");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print("{");
			
			for (int j = 0; j < arr3[i].length; j++) {
//				System.out.println(i + " , " + j);
				System.out.print(arr3[i][j]);
				
				if( j < arr3[i].length - 1) {
					System.out.print(", ");
				}
			}
			System.out.print("}");
			if (i < arr3.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("}");

	}

}
