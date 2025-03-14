package kosa.mission;

import java.util.Scanner;

public class Mission06 {

	public static void noId(String m_id, String id) throws Exception {
		if (!m_id.equals(id)) {
			throw new Exception("해당 아이디가 존재하지 않습니다.");
		} 
	}

	public static void noPass(String m_pass, String pass) throws Exception {
		if (!m_pass.equals(pass)) {
			throw new Exception("해당 비밀번호가 존재하지 않습니다.");
		}
	}

	public static void main(String[] args) {
		// 로그인 예제 구현
		/*
		 * id, password 키보드로 입력 기존 m_id, m_pass와 일지하면 =>로그인 성공 id불일치: 해당 아이디가 존재하지 않습니다.
		 * pass불일치: 해당 비밀번호가 존재하지 않습니다.
		 */
		Scanner sc = new Scanner(System.in);
		String m_id = "kosa";
		String m_pass = "1234";



		while(true) {
			try {
				System.out.print("id: ");
				String id = sc.nextLine();
				noId(m_id, id);
				break;
			} catch (Exception e) {
//			System.out.println("해당 아이디가 존재하지 않습니다."); 
				e.printStackTrace();
			}
		}
		
		while(true) {
			try {
				System.out.print("pass: ");
				String pass = sc.nextLine();
				noPass(m_pass, pass);
				break;
			} catch (Exception e) {
//			System.out.println("해당 아이디가 존재하지 않습니다."); 
				e.printStackTrace();
			}
//			
		}
		System.out.println("로그인 성공!");
	
}

}
