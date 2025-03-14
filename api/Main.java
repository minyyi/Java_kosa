package kosa.api;

public class Main {

	public static void main(String[] args) {

		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		if(p1.equals(p2)) { //Object - equals => 주소값비교
			System.out.println("같다");
		}else {
			System.out.println("다름");
		}
		
		
		
//		System.out.println(p1); //Object - toString 호출 => overrid해야 원하는 값이 나옴
//		String str = new String("abc");
//		System.out.println(str.toString()); // String - toString 호출
//		System.out.println(str); //System.out.println는 toString매서드 자동호출
//		
	}

}
