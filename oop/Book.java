package kosa.oop;

public class Book {
//요구분석 공통된 데이터 구조 => 필드
	String bookName;
	int price;
	int dc_price;
//	int originPrice;
//	int disPrice;
//	int total;

	public Book() {}

	public Book(String bookName, int price) {
		super();
		this.bookName = bookName;
		this.price = price;
//		this.discount = discount;
	};
//	public Book(String bookName, int originPrice) {
//		super();
//		this.originPrice = originPrice;
//		this.bookName = bookName;
////		this.discount = discount;
//	};

//공통된 기능 => 메서드

	public void discount() {

		if (price >= 30000) {
			dc_price = (int) (price * 0.75);
		} else if (price >= 20000) {
			dc_price = (int) (price * 0.80);
		} else if (price >= 15000) {
			dc_price = (int) (price * 0.85);
		} else {
			dc_price = price;
		}
	}
//	public int discount(int originPrice) {
//
//		if (originPrice >= 30000) {
//			disPrice = (int) (originPrice * 0.75);
//		} else if (originPrice >= 20000) {
//			disPrice = (int) (originPrice * 0.8);
//		} else if (originPrice >= 15000) {
//			disPrice = (int) (originPrice * 0.85);
//		} else {
//			disPrice = originPrice;
//		}
////		this.total +=disPrice;
//		return disPrice;
//	}

//	public void printTotal() {
////		this.disPrice += disPrice;
//		System.out.println("총 금액: " + this.total + "원 입니다.");
//	}
	
	public void printBook() {
		System.out.println(bookName + " 교재의 정가는 " + price + "원, 할인된 가격은 " + dc_price + "원 입니다.");
	}
//	public void printDisprice() {
//		System.out.println(this.bookName + " 교재의 정가는 " + this.originPrice + "원, 할인된 가격은 " + this.disPrice + "원 입니다.");
//	}

}
