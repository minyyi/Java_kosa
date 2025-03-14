package kosa.phone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import kosa.io.Member;

//전화번호 목록을 관리하는 기능 (추가, 출력, 검색 등)

public class Manager {

	private List<PhoneInfo> list; // 주소값만 할당 ==> List 자료구조로 변경
	private int count;
	private Scanner sc;
	List<Universe> uni = new ArrayList<Universe>();
	List<Company> com = new ArrayList<Company>();
	Object s;

	public Manager() {
		list = new ArrayList<PhoneInfo>();
		sc = new Scanner(System.in);
	}

	public void addPhoneInfo(int num) {
		// 1.일반, 2. 동창, 3. 직장
		System.out.print("이름: ");
		String name = sc.nextLine();
//		System.out.println();
		System.out.print("전화번호: ");
		String phoneNo = sc.nextLine();
		System.out.print("생년월일: ");
		String birth = sc.nextLine();
		if (num == 1) {
//			list = new ArrayList<PhoneInfo>();
			list.add(new PhoneInfo(name, phoneNo, birth));
		} else if (num == 2) {
			System.out.print("전공: ");
			String major = sc.nextLine();
			System.out.print("학번: ");
			String year = sc.nextLine();
//			List<Universe> list = new ArrayList<Universe>();
//			uni = new ArrayList<Universe>();
			uni.add(new Universe(name, phoneNo, birth, major, year));
		} else if (num == 3) {
			System.out.print("부서: ");
			String dept = sc.nextLine();
			System.out.print("직책: ");
			String position = sc.nextLine();
//			List<Company> list = new ArrayList<Company>();
//			com = new ArrayList<Company>();
			com.add(new Company(name, phoneNo, birth, dept, position));
		} else {
			System.out.println("번호를 다시 입력해주세요.");
		}

		System.out.println("전화번호가 등록 되었습니다.");

	}

	public void listPhoneInfo() {
		// 1.전체, 2. 동창, 3. 직장
		System.out.println("1.일반, 2. 동창, 3. 직장");
		System.out.print("번호입력: ");
		int menu = DataInput.sc.nextInt();
		switch (menu) {
		case 1:
			System.out.println("** 전체목록**");
//			for (int i = 0; i < count; i++) {
//				list[i].show();
//			}
			Iterator<PhoneInfo> itr = list.iterator();
			while (itr.hasNext()) {
				itr.next().show();
//				System.out.println(itr.next().show());
			}
			break;
		case 2:
			System.out.println("**동창목록**");
			for (int i = 0; i < list.size(); i++) {
				PhoneInfo info = list.get(i);
				if (info instanceof Universe) {
					info.show();
				}
			}
//			Iterator<Universe> itrU = uni.iterator();
//			while (itrU.hasNext()) {
//				System.out.println(itrU.next());
//			} 
			break;
		case 3:
			System.out.println("**직장목록**");
			for (int i = 0; i < list.size(); i++) {
				PhoneInfo info = list.get(i);
				if (info instanceof Company) {
					info.show();
				}
			}
			Iterator<Company> itrC = com.iterator();
			while (itrC.hasNext()) {
				System.out.println(itrC.next());
			}
			break;
		}
	}

	public void listSearch() {
		// 검색하고자하는 이름으로 1개의 PhoneInfo 객체의 내용을 출력
		System.out.print("이름: ");
		String name = sc.nextLine();
		int idx = -1;
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getName().equals(name)) {
//				// get메서드로 이름 가져오기 private 해서 .name할 수 없음
//				list.get(i).show();
//				idx = i;
//			}
//		}
		for (int i = 0; i < list.size(); i++) {
			PhoneInfo info = list.get(i);
			if (name.equals(info.getName())) {
				info.show();
				idx = i;
			}
		}
//		if(list.contains(name)) {
//			list.get(list.indexOf(name));
//		}
		if (idx == -1) {
			System.out.println("존재하지 않습니다.");
		}
	}

	public void updatePhoneInfo() {
		// 이름입력 => 해당 PhoneInfo검색 => 수정 전화번호 입력 => 전화번호 수정이 완료
		System.out.println("이름 입력: ");
		String name = DataInput.sc.nextLine();
		int idx = -1;

//		for (int i = 0; i < count; i++) {
//			if (name.equals(list.get(i).getName())) {
//				System.out.println("수정 전화번호: ");
//				String phoneNo = DataInput.sc.nextLine();
//				list.get(i).setPhoneNo(phoneNo);
//				idx = i;
//			}
//		}
		for (int i = 0; i < list.size(); i++) {
			PhoneInfo info = list.get(i);
			if (name.equals(info.getName())) {
				System.out.println("수정전화번호: ");
				String phoneNo = DataInput.sc.nextLine();
				info.setPhoneNo(phoneNo);
				idx = i;
			}
		}

		if (idx == -1) {
			System.out.println("존재하지 않습니다.");
		}

	}

	public void deletePhoneInfo() {
		// 이름입력 => 해당 PhoneInfo 객체검색 => 인덱스 찾기 => 전화번호 삭제 완료
		System.out.print("이름 입력: ");
		String name = DataInput.sc.nextLine();
		int idx = -1;
//			System.out.println(list.next()+ ", ");
//		}
//		for (int i = 0; i < count; i++) {
//			Iterator<PhoneInfo> iter = list.iterator();
//			while (iter.hasNext()) {
//				System.out.println(iter.next() + ", ");
//			}
//
//			if (name.equals(list.get(i).getName())) {
//				idx = i; // 인덱스 찾기
//			}
		for (int i = 0; i < list.size(); i++) {
			PhoneInfo info = list.get(i);
			if (name.equals(info.getName())) {
				list.remove(info);
				idx = i;
			}
		}
		if (idx == -1) {
			System.out.println("존재하지 않습니다.");
		}
//		}else {
//			while (list.get(i).hasNext()) {
//				System.out.println(list.next()+ ", ");
//			}
//			for(int i = idx; i < count; i++) {
//				if(i == list.get(i) -1) { 	//배열의 마지막 요소일 때
//					list.get(i) = null;
//				}else {
//					list[i] = list[i +1];		//배열의 중간에 빈 공간을 두지 않기 위해서
//				}
//		count--;
//	}
	}

	public void save() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("phonInfo.ser"));
			oos.writeObject(list);
//			System.out.println(list.get(0).getName());
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				oos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

	public void show() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("phonInfo.ser"));
			list = ((List<PhoneInfo>) ois.readObject());
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
