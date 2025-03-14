package kosa.oop;

public class AccountMain {

	public static void main(String[] args) {
		// 모든 클래스 이름은 데이터 타입이 될 수 있다!!
		Account account; // Account 데이터타입? 참조형(클래스) 데이터타입
		account = new Account();  // 객체생성(메모리 할당), 인스턴스화, 인스턴스변수
//		account = new Account("111-111", "홍길동", 10000);
//		Account account2 = new Account("222-222", "박길동", 20000); // 메모리가 새로 할당
//		Account account3 = new Account("222-222", "박길동"); // 객체 생성 방식은 생성자 내용에 따라서 결정됨. 
		
		// 객체를 초기화 (필드에 값을 넣는 것)
// 		account.accountNo = "111-111";
//		account.ownerName = "홍길동";
//		account.balance = 10000;

//		account2.accountNo = "222-222";
		account.setAccount("222-222");
		
//		account2.ownerName = "박길동";
//		account2.balance = 20000;

		account.deposit(5000);

		try {
			account.withdraw(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
//				System.out.println("계좌번호: " + account.accountNo);
//				System.out.println("계좌주: " + account.ownerName);
//				System.out.println("잔액: " + account.balance);
		System.out.println(account.getAccount()); 
		System.out.println("========================");
//		account2.printAccount();

//				System.out.println("계좌번호: " + account2.accountNo);
//				System.out.println("계좌주: " + account2.ownerName);
//				System.out.println("잔액: " + account2.balance);
	}

}
