package kosa.oop;

public class MinusAccount extends Account {
	
	
	private int creditLine; //마이너스 한도
	
	public MinusAccount() {}

	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}

	/*오버라이딩
	 1. 상속관계
	 2. 매서드의 시그니처(접근제어자, 리턴형, 메서드 이름, 파라미터 타입/개수)일치
	 	- 하나만 달라도 다른 매서드
	 3. 메서드의 내용 불일치 (재정의)
	 */
	
	
	public int getCreditLine() {
		return creditLine;
	}

	@Override //anotation 
	public int withdraw(int amount) throws Exception {
		if(getBalance() + creditLine < amount) {
			throw new Exception("잔액부족");
		}
		int balance = getBalance();
		setBalance(balance - amount);
		return amount;
//		return super.withdraw(amount); // 이 super는 메서드 부모 매서드 호출하기 위한 용도 필요없으면 안써도 됨
	}

	public void setCreditLine(int creditLine) {
		this.creditLine = creditLine;
	}
	
	@Override
	public void printAccount() {
		super.printAccount();
		System.out.println("마이너스 한도: " + creditLine);
	}

	
}
