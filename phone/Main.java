package kosa.phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//회원정보 추가, 삭제,
		

		Scanner sc = new Scanner(System.in);
		Manager m = new Manager(); //11줄 -> 생성자호출 ->메모리 생성
	
		while (true) {
			System.out.println("1.추가 2.전체출력 3.검색 4.수정 5.삭제 6.저장 7.불러오기 8.종료");
			System.out.print("메뉴입력: ");
			String menu = sc.nextLine();
			
			switch(menu) { 
			
			case "1": //addPhoneInfo
				System.out.println("1.일반, 2. 동창, 3. 직장");
				System.out.print("번호입력: ");
				int num = sc.nextInt();
				m.addPhoneInfo(num);
				break;
			case "2": //listPhoneInfo
				m.listPhoneInfo();
				break;
			case "3":
				m.listSearch();
				break;
			case "4": 
				m.updatePhoneInfo();
				break;
			case "5": 
				m.deletePhoneInfo();
				break;
			case "6": 
				m.save();
				break;
			case "7": 
				m.show();
				break;
			case "8":
				System.out.println("프로그램 종료");
				return;
			}
			
		}
	}

}
