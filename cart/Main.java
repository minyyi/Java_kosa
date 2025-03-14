package kosa.cart;

import kosa.oop3.Person;
import kosa.oop3.Role;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		NoteBook n[] = new NoteBook[5];
		Product n1 = new NoteBook("맥북", 100000);
//		Product
//		Product n2 = new NoteBook("2", "애플", 400000, 10);
//
////		Phone p[] = new Phone[5];
//		Product p1 = new Phone("11", "애플", 50000, 5);
		Product phone = new Phone("갤럭시", 30000, "삼성");
		
		Cart cart = new Cart();
		cart.addProduct(n1);
		cart.addProduct(phone);
		
		cart.listProduct();
		//		show();
//		for(int i = 0; i < 5; i++) {
//			
//		n[i].show();
//		p[i].show();
//		}
	}

}
