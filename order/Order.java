package kosa.order;

import java.util.LinkedList;
import java.util.List;

public class Order {
	private  LinkedList<Food> food;
//	private  Food food;
	private int total; //생성자 X; 계산결과 받아오기
//	private int orderTotal; //생성자 X; 계산결과 받아오기
	private int amount;
//	private int orderAmount;

	public Order() {}

	public Order(LinkedList<Food> food, int orderAmount) {
		super();
		this.food = food;
//		this.orderAmount = orderAmount;
//		this.orderTotal += food.getTotal() ;
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void show () {
//		food.show();
		System.out.println("주문수량: " + amount);
		System.out.println("주문금액: " + total);
	}

//	public Food getMenu() {
//		return food;
//	}
//
//	public void setMenu(Food menu) {
//		this.food = menu;
//	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	
}
