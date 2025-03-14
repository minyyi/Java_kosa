package kosa.oop;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 최대 10명의 회원을 저장할 배열 생성
        Member[] members = new Member[10];
        int count = 0; // 실제 저장된 회원 수
        
        while (true) {
            System.out.println("1. 회원 등록");
            System.out.println("2. 전체 회원 목록 보기");
            System.out.println("3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기
            
            switch (choice) {
                case 1: // 회원 등록
                    if (count < members.length) {
                        System.out.print("이름: ");
                        String name = scanner.nextLine();
                        
                        System.out.print("나이: ");
                        String age = scanner.nextLine();
                        
                        // 새 회원 객체 생성 및 배열에 저장
                        members[count] = new Member(name, age);
                        count++; // 회원 수 증가
                        
                        System.out.println("회원 등록이 완료되었습니다.");
                    } else {
                        System.out.println("더 이상 회원을 등록할 수 없습니다. 최대 인원은 10명입니다.");
                    }
                    break;
                    
                case 2: // 전체 회원 목록 보기
                    if (count == 0) {
                        System.out.println("등록된 회원이 없습니다.");
                    } else {
                    	
                        for (int i = 0; i < count; i++) {
                            System.out.println((i+1) + ". " + members[i]);
                        }
                    }
                    break;
                    
                case 3: // 종료
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }
    }
}