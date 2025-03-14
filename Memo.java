package kosa;

import java.util.Scanner;

public class Memo {
	public static void noId(String m_id, String id) throws Exception {
		Scanner sc = new Scanner(System.in);

		if (m_id != id) {
			throw new Exception("해당 아이디가 존재하지 않습니다.");
		} else {
			System.out.print("password: ");
			String pass = sc.nextLine();
		}
	}

	public static void noPass(String m_pass, String pass) throws Exception {
		// 무조건 예외가 발생될 여지가 있는 메소드 => 무조건 에러뜸!
		if (m_pass != pass) {
			throw new Exception("해당 비밀번호가 존재하지 않습니다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int n = 20;
		int k = 1;
		for (i = 1; i <= n; i++) {
			System.out.print(i + " ");
			if(i == 5 * k) {
				System.out.println();
				k++;
			}
		}
		
//		int init = 7;
//		int i = 1;
//		int end = 9;
//		while (i <= end ) {
////			result  = init * i;
//			System.out.printf("%d * %d = %d %n", init, i, init*i );
//			i++;
//	}

//		for (int i = 1; i <=100; i++) {
//			String result = (!(i % 2 == 0 || i % 3 == 0))  ? i + " " : ""; 
//			System.out.print(result);
//			
//		}
//		System.out.print("입력: ");
//		String str = sc.nextLine();
//		while (true) {
////			System.out.print("입력: ");
//			if (str == "") {
//				System.out.println("끝");
//				break;

			}
//		}
//}
	}
//}
