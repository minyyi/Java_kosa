package kosa.mission;

import java.util.Scanner;

public class Mission06_A {

//	public static void noId(String m_id, String id) throws Exception {
//		if (!m_id.equals(id)) {
//			throw new Exception("해당 아이디가 존재하지 않습니다.");
//		} 
//	}
//
//	public static void noPass(String m_pass, String pass) throws Exception {
//		if (!m_pass.equals(pass)) {
//			throw new Exception("해당 비밀번호가 존재하지 않습니다.");
//		}
//	}

	public static void main(String[] args) {
		// 로그인 예제 구현
		/*
		 * id, password 키보드로 입력 기존 m_id, m_pass와 일지하면 =>로그인 성공 id불일치: 해당 아이디가 존재하지 않습니다.
		 * pass불일치: 해당 비밀번호가 존재하지 않습니다.
		 */
		Scanner sc = new Scanner(System.in);
		String m_id = "kosa";
		String m_pass = "1234";

		System.out.print("id: ");
		String id = sc.nextLine();
		System.out.print("pass: ");
		String pass = sc.nextLine();

		//trim : 앞뒤 공백 제거 (중간에 있는 공백은 해당 없음)
		if(id.trim().equals(m_id) && pass.trim().equals(m_pass)){
			System.out.println("로그인 성공");
		}else {
			if (!id.equals(m_id)) {
				System.out.println("해당아이디가 존재하지 않습니다.");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}
	
}

}
