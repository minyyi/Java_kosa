package kosa.mission;

import java.util.Scanner;

public class Mission04 {
	public static void main(String[] args) {
//		메뉴를 선택해서 해당 메뉴에 대한 명령문을 실행해보자
//		4번 선택 할 때까지 계속해서 반복
		//1. 추가, 2. 출력, 3. 검색, 4.종료(return;)
		Scanner sc = new Scanner(System.in);
		
//		System.out.println(" ");
		
//		int menu =0;
//		
//		while(menu <=4) {
//			System.out.println("1. 추가, 2. 출력, 3. 검색, 4.종료 ");
//			System.out.print("메뉴 번호를 입력해주세요: ");
//			int num = sc.nextInt();
//			switch(num) {
//			case 1:
//				System.out.println("1번 메뉴를 선택하셨습니다. ");
//				break;
//			case 2:
//				System.out.println("2번 메뉴를 선택하셨습니다. ");
//				break;
//			case 3:
//				System.out.println("3번 메뉴를 선택하셨습니다. ");
//				break;
//			case 4:
//				System.out.println("프로그램 종료");
//				return;
//			default:
//				System.out.println("1. 추가, 2. 출력, 3. 검색, 4.종료 ");
//				System.out.print("메뉴 번호를 입력해주세요: ");
//				break;
			
		//교수님
		while (true) {
			System.out.println("1. 추가, 2. 출력, 3. 검색, 4.종료 ");
			System.out.print("입력: ");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				System.out.println("추가메뉴");
				break;
			case "2":
				System.out.println("출력");
				break;
			case "3":
				System.out.println("검색");
				break;
			case "4":
				System.out.println("종료");
				return;
			}
		}
//		return;
//			System.out.println("4. 종료");
	}
}
