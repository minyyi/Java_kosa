package kosa.oop;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		
		Book arr[] = {
				new Book("Java", 30000), 
				new Book("Jsp", 20000),
				new Book("Oracle", 15000)
		};
		for (Book b : arr) {
			b.discount();
			b.printBook();
			total += b.dc_price;
		}
		System.out.println("총 금액: " + total + "원 입니다.");
		
		
//		Book b1 = new Book("Java", 30000);
//		Book b2 = new Book("Jsp", 20000);
//		Book b3 = new Book("Oracle", 15000);
//		
//		b1.discount();
//		b2.discount();
//		b3.discount();
//
//		b1.printBook();
//		b2.printBook();
//		b3.printBook();
		
		
//		 int sum = 0;
//		Book book = new Book();
//		Book Java = new Book("java", 30000);
//		Book Jsp = new Book("Jsp", 20000);
//		Book Oracle = new Book("Oracle", 15000);

//		Java.printDisprice("java", 30000, Java.discount(30000))
//		sum += Java.discount(30000);
//		sum += Jsp.discount(20000);
//		sum += Oracle.discount(15000);
//		
//		int total = sum;
//		Java.printDisprice();
//		Jsp.printDisprice();
//		Oracle.printDisprice();

//		int disPrice = Java.discount(30000);
//		Java.discount(30000);
//		Java.printTotal();
//		Jsp.discount(30000);
//		Jsp.printTotal();

//		System.out.println("총 금액: " + total + "원 입니다.");

	}

}
