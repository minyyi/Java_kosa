package kosa.mission;

import java.util.Scanner;

public class Mission02 {
//	총점을 구하는 메서드
	public static double add(double kor, double eng, double mat) {
		double result = kor +eng +mat;
				return result;
	}
//	평균을 구하는 메서드
	public static double avrg(double kor, double eng, double mat) {
		double result = (kor +eng +mat) /3;
				return result;
	}
	
	public static void main(String[] args) {
		/*
		 * 성적관리 구현 국어, 영어, 수학 점수를 키보드로 입력받고 총점과 평균을 출력하세요. (단, 평균은 실수형)
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수: ");
		double kor = Integer.parseInt(sc.nextLine());
		
		System.out.print("영어점수: ");
		double eng = Integer.parseInt(sc.nextLine());
		
		System.out.print("수학점수: ");
		double math = Integer.parseInt(sc.nextLine());
		
//		int sum = kor + eng + math;
//		double avr = (kor + eng + math) / 3;
//		
//			System.out.println("총점: " + sum);
//			System.out.println("평균: " + avr);
		double sum = add(kor, eng, math);
		double averge = avrg(kor, eng, math);
		 System.out.println("총점: " + sum);
//		 System.out.println("평균: " + averge);
		 System.out.printf("평균: %.2f%n", averge);
//		int kor, eng, mat;
//		int total;
//		double aver;
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("국어: ");
//		kor = sc.nextInt();
//		System.out.print("영어: ");
//		eng = sc.nextInt();
//		System.out.print("수학: ");
//		mat = sc.nextInt();s

//		total = kor + eng + mat;
//		aver = total / 3; // 둘 중 하나를 double로 바꾸면 됨!
//		aver = (int) (total / 3); // 결과값을 int로 바꾸면 됨!


//		System.out.println("총점: " + total);
//		System.out.println("평균: " + aver);

//	90점 이상 => A, 80점 이상=> B, 70점 이상 => C, 60점 이상 => D, 60점 이하 =>F

//		if (aver >= 90) {
//			System.out.println("A");
//		} else if (aver >= 80) {
//			System.out.println("B");
//		} else if (aver >= 70) {
//			System.out.println("C");
//		} else if (aver >= 60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
	}
}
