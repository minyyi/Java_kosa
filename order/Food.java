package kosa.order;

public class Food {
	private String foodName; 
	private int price;
	private int amount;
	private int total;
	
	public Food () {}

	public Food(String foodName, int price) {
		super();
		this.foodName = foodName;
		this.price = price;
		
	}
	
	
	
	public Food(String foodName, int price, int amount) {
		super();
		this.foodName = foodName;
		this.price = price;
		this.amount = amount;
		this.total = price* amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void show () {
		System.out.println("메뉴이름: " + foodName);
		System.out.println("가격: " + price);
		System.out.println("주문수량: " + amount);
		System.out.println("============");
		System.out.println("총 금액: " + total);
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}
