package kosa.oop4;

import kosa.oop3.MyThread;

public class Main {

	public static void main(String[] args) {
		// MyType=>익명클래스 구현

//		MyType mt = new MyType() {
//			@Override
//			public void hello() {
//				
//				System.out.println("익명클래스 구현중");
//			}
//		};  //   추상클래스/인터페이스 만 가능한 형태
//		mt.hello();
		/*
  람다식(함수형 프로그램) 으로 구현
  인터페이스 안에 추상매서드가 1개일 때만 사용가능
		 */
//		MyType mt2 = () ->{
//			System.out.println("람다식");
//		};
//		MyType mt3 = () -> System.out.println("람다 더 간단히");
//		mt2.hello();
//		mt3.hello();
//		
//		
//		YourType y = (String str) -> System.out.println(str);
//		y.talk("나는 매개변수가 있지");
//		YourType y1 = str -> System.out.println(str); //매개변수 하나일 때는 그 괄호와 타입 생략 가능
//		y1.talk("나는 더 간단");
		
//		MyNumber max = (int num1, int num2) ->{
//			return (num1 - num2) > 0 ? num1 : num2;
//		};
		
//		System.out.println(max.getMax(10, 2));
//		max.getMax(3, 1);
		
		Runnable run = () -> {
			System.out.println("메인동작");
			 for(int i = 0;i<=10;i++) {
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						
					}
					System.out.println(i +"나는 for문");
				}
		};
//		Thread t = new Thread(run);
//		t.start();
		run.run();
//		MyThread myt= () -> {
//			System.out.println("메인동작");
//			 for(int i = 0;i<=3;i++) {
//					try {
//						Thread.sleep(1000);
//					} catch (Exception e) {
//						
//					}
//					System.out.println(i +"나는 for문");
//				}
//		};
//		
//		public static void main(String[] args) {
//			MyThread my = new MyThread();
//			Thread t = new Thread(my);
//			t.start();
//			System.out.println("메인동작");
//
//		}
		
		
		
	}
}
