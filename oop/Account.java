package kosa.oop;

public class Account {
	/*
	 * Account 클래스로부터 Account객체 생성 객체로부터 공통된 데이터 구조와 기능을 추출해서 클래스 생성 상태(필드) : 계좌번호,
	 * 계좌주, 잔액 기능(메서드) : 입금하다. 출급하다.
	 */
	// 필드 - 객체가 생성됐을 때 메모리 올라옴

//	String accountNo;
//	String ownerName;
//	int balance;

	public void Account() { // 같은 이름의 매소드가 내포되어 있는 것임.
	}

	/*
	 * 생성자(constructor) - 객체 초기화 용도 public voidX 리턴 X 클래스이름() {}
	 * 객체를 생성할 수  존재하지 
	 */
	public Account() { //디폴트 생성자
	}

	/*
	 접근제어자
	 - private : 해당 클래스 안에서만 접근 가능 //private String accountNo
	 - default : 해당 패키지 안에서만 접근 가능 //String accountNo
	 - protected(default +부모클래스)
	 - public : 모두 접근 가능 (다른 패키지안에서도 접근 가능)
	 
	 =>필드(멤버변수)는 기본적으로 private로 선언됨. 
	 =>필드 => private => set/get메서드 접근 => 정보은닉(캡슐화)
	 */
	private String accountNo;
	private String ownerName;
	private int balance;
	
	
 public void setAccount(String accountNo)  { 
	 this.accountNo = accountNo; 
 }
 public String getAccount()  { 
	 return this.accountNo; 
 }
// public Account(String accountNo, String ownerName, int balance)  { //매개변수는 지역변수의 특징과 같다.
//	 this.accountNo = accountNo; //코드 컨벤션으로 this붙이는것이 일반적
//	 this.ownerName = ownerName;
//	 this.balance = balance;
// }

	//자동생성 가능
	public Account(String accountNo, String ownerName, int balance) {
		super(); // 상속 지금은 있어도 없어도 상관없음
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
//	
//	
//	
//	public Account(String accountNo, String ownerName) {
//		super();
//		this.accountNo = accountNo;
//		this.ownerName = ownerName;
//	}

	public String getAccountNo() {
	return accountNo;
}

public void setAccountNo(String accountNo) {
	this.accountNo = accountNo;
}

public String getOwnerName() {
	return ownerName;
}

public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}

	// 입금
	public void deposit(int amount) {
		balance += amount;
	}


	// 출금
	public int withdraw(int amount) throws Exception {
		if (balance < amount) { // 내가 가진 돈보다 큰 금액은 인출 불가!
			throw new Exception("잔액부족");
		}
		balance -= amount;
		return amount;
	}
	
	public void printAccount() {
		System.out.println("계좌번호: " + accountNo);
		System.out.println("계좌주: " + ownerName);
		System.out.println("잔액: " + balance);
	}
	

}
