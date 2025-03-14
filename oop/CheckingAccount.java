package kosa.oop;

public class CheckingAccount extends Account {

	private String cardNo;
	
	public CheckingAccount() {}
	
	
	public int pay(String cardNo, int amount) throws Exception {
		if(!this.cardNo.equals(cardNo) || getBalance() < amount ) {
			throw new Exception("결제불능");
		}
		return withdraw(amount);
	}

	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}


	@Override
	public void printAccount() {
		super.printAccount();
		System.out.println("카드번호: " + cardNo);
	}
	
	
	
}
