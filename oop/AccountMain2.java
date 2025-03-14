package kosa.oop;

public class AccountMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//부모로 형변화(자식 ->부모) 묵시적 형변환
//		Account ca = 
//				new Account("111-111", "김길동", 10000);
//				new CheckingAccount();
//				new CheckingAccount("222-111", "홍길동", 5000, "222-222");
//		if(ca instanceof CheckingAccount) {
//			CheckingAccount ca2 = (CheckingAccount)ca;
//			try {
//				
//				ca2.pay("222-222", 3000);
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//		ca2.printAccount();
		
//		Account	arr =
//				new Account("111-111", "김길동", 10000);
//		CheckingAccount arr = (CheckingAccount)ca;
		
	Account	arr[] = {
				new Account("111-111", "김길동", 10000),
				new CheckingAccount("222-111", "홍길동", 5000, "222-222"),
				new MinusAccount("333-111", "박길동", 5000, 10000),
		};
 		
	for (int i = 0; i < arr.length; i++) {
		if(arr[i] instanceof MinusAccount) {
			MinusAccount ca = (MinusAccount)arr[i];
			try {
//				((CheckingAccount)arr[i]).pay("222-222, 3000);
				ca.withdraw(3000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		arr[i].printAccount();
		System.out.println("============");
	}
		
//		MinusAccount ma = new MinusAccount("111-111", "박길동", 5000, 10000);
//
//		try {
//			ma.withdraw(7000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		ma.printAccount();
		
//		CheckingAccount ca = 
//				new CheckingAccount("111-111", "홍길동", 5000, "222-222"); //직불카드도 사용할 수 있는 계좌 생성
//		
//		
//		try {
//			ca.pay("222-222", 1000);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		ca.printAccount();
	}

}
