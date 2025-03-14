package kosa.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListMission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * List 바료 구조를 활용하여 키보드로 부터 문자열을 입력 받아 처리하자. 1. 데이터 추가 2. 데이터 삭제 3. 데이터 출력(for,
		 * Iterator) 4. 종료
		 */

		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		while (true) {
			System.out.println("1. 데이터 추가 2. 데이터 삭제 3. 데이터 출력 4. 종료 ");
			System.out.print("번호 입력: ");
			String menu = sc.nextLine();
			int idx = -1;
//			System.out.println();

			switch (menu) {
			case "1":
				System.out.print("추가할 데이터 입력: ");
				String data = sc.nextLine();
				list.add(data);
				System.out.println("1111");
				break;
			case "2":
//				list.removeAll(list);
//				System.out.println("데이터가 삭제되었습니다.");
				idx = list.indexOf(sc.nextLine());
				if(idx!=-1) {
					list.remove(idx);
				}else {
					System.out.println("존재하지 않습니다.");
				}
				break;
			case "3":
//				for(int i =0; i <list.size();i++) {
//					System.out.println(list.get(i) + ", ");
//				}
				//or
				Iterator<String> iter = list.iterator();
				if(list.size() == 0) {
					System.out.println("출력할 데이터가 없습니다.");
					break;
				}
				while (iter.hasNext()) {
					System.out.println(iter.next()+ ", ");
				}
				break;
			case "4":
				System.out.println("프로그램 종료");
				return;

			default:
//				System.out.println("번호를 다시 확인해주세요. ");
//				System.out.println("1. 데이터 추가 2. 데이터 삭제 3. 데이터 출력 4. 종료 ");
//				System.out.print("번호 입력: ");
				break;
			}
		}

	}

}
