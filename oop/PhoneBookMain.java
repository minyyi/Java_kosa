package kosa.oop;

import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {
		//
		PhoneBook[] phoneBooks = new PhoneBook[10];
        int count = 0; // 실제 저장된 항목 수
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n===== 전화번호부 =====");
            System.out.println("1.추가 2.전체출력 3.검색 4.종료");
            System.out.print("메뉴: ");
            String menu = sc.nextLine();
            
            switch (menu) {
                case "1": 
                    if (count < phoneBooks.length) {
                        System.out.print("이름: ");
                        String name = sc.nextLine();
                        System.out.print("전화번호: ");
                        String phoneNum = sc.nextLine();
                        System.out.print("생년월일: ");
                        String birth = sc.nextLine();
                        
                        // 새 전화번호부 객체 생성 및 배열에 저장
                        phoneBooks[count] = new PhoneBook(name, phoneNum, birth);
                        System.out.println("전화번호가 등록 되었습니다.");
                        count++; // 항목 수 증가
                    } else {
                        System.out.println("더 이상 항목을 등록할 수 없습니다. 최대 항목은 10개입니다.");
                    }
                    break;
                    
                case "2": // 전체출력
                    if (count == 0) {
                        System.out.println("등록된 전화번호가 없습니다.");
                    } else {
                        System.out.println("\n===== 전체 전화번호 목록 =====");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i+1) + ". " + phoneBooks[i]);
                        }
                    }
                    break;
                    
                case "3": // 검색
                    if (count == 0) {
                        System.out.println("등록된 전화번호가 없습니다.");
                    } else {
                        System.out.print("검색할 이름: ");
                        String searchName = sc.nextLine();
                        boolean found = false;
                        
                        for (int i = 0; i < count; i++) {
                            if (phoneBooks[i].getName().equals(searchName)) {
                                System.out.println("\n===== 검색 결과 =====");
                                System.out.println(phoneBooks[i]);
                                found = true;
                                break; // 첫 번째 일치하는 항목을 찾으면 루프 종료
                            }
                        }
                        
                        if (!found) {
                            System.out.println("일치하는 이름이 없습니다.");
                        }
                    }
                    break;
                    
                case "4": // 종료
                    System.out.println("프로그램 종료");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 선택해주세요.");
            }
        }
	}

}
