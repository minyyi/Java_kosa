package kosa.oop4;

interface A {
	void abc();
}

class B {
	void bcd() {
		System.out.println("B메서드 호출");
	}
}

interface AA{
	BB abc(String name);
}

class BB{
	BB(String name){
		System.out.println("BB생성자: " + name);
	}
}

public class Main2 { // 메인 메서드를 가지고 있는 클래스만 public 사용 가능

	public static void main(String[] args) {
		
		
		/*
		 * 1. 익명클래스를 이용해서 abc()오버라이딩 ->B를 생성해서 bcd()호출
		 */

//		A a = new A() {
//			//익명클래스
//			@Override
//			public void abc() {
//				// TODO Auto-generated method stub
//				B b = new B();
//				b.bcd();
//			}
//
//		};
//
//		a.abc();
		
		//2. 해당내용 동일하게 람다식으로 구현
//		A a = () -> {
//			B b = new B();
//			b.bcd();
//		};
//		a.abc();
		//더 짧게
		//3. 인스턴스 참조 구현 - 매서드 하나일때만 가능
		
		B b = new B();
		A a3 = b::bcd;
		a3.abc();
		
		//2-1. 익명내부클래스
		AA a1 = new AA() {
			
			@Override
			public BB abc(String name) {
				// TODO Auto-generated method stub
				return new BB(name);
			}
		};
		a1.abc("asdf");
		
		//2-2. 람다식
		AA a2 = (name) -> new BB(name);
		a2.abc("111");
		
		//2-3. 참조
		AA aa = BB::new;
		aa.abc("그냥");
		//
	}
}
