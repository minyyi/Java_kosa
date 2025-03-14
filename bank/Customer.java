package kosa.bank;

public class Customer {
	private String id;
	private String name;
	private Account account;
	
	public Customer () {
		this.account = new Account();
		System.out.println("string");
	}

	public Customer(String id, String name, Account account) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
		//account.getBalance() = account.balance;
	}
	public Customer(String id, String name, long balance) {
		super();
		this.id = id;
		this.name = name;
		this.account = new Account(id, balance);
//		System.out.println(account.getId());
	}
	
	public String getId() {
		return this.id;
	}

//	public void setId(String id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	

}
