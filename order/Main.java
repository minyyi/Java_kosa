package kosa.order;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int totalSales = 0;
	
	//주문요청
	public static void addOrder (LinkedList<Order> list) {
		System.out.print("요리명: ");
		String foodName = sc.nextLine();
		System.out.print("가격: ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("수량: ");
		int amount = Integer.parseInt(sc.nextLine());
		
//		Food food = new Food(foodName, price);
//		Order order = new Order(food, amount);
//		list.offer(order);
//		 ==
//		list.offer(new Order(new Food(foodName, price), amount));
	}
	
	//주문처리
	public static void orderService(LinkedList<Order> list) {
		if(!list.isEmpty()) {
			Order order = list.poll();
			order.show();
			totalSales += order.getTotal();
		}
	}
	
	public static void main(String[] args) {
		
		LinkedList<Order> list = new LinkedList<Order>();   //queue 자료구조 
		
		while(true) {
			System.out.println("1. 주문요청  2. 주문처리 3. 매출액 총액 4. 종료");
			System.out.print("메뉴: ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1":
				addOrder(list);   // 주소값을 호출
				break;
			case "2":
				orderService(list);
				break;
			case "3":
				System.out.println("전체매출액: " + totalSales);
				break;
				
			}
		}

	}

}
