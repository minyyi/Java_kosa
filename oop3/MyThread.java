package kosa.oop3;

public class MyThread implements Runnable { //고유한 기능을 구현하기 위한 자바인터페이스

	@Override
	public void run() { //Runnable의 추상매서드
		//멀티스레드 작업내용작성
		for(int i = 0;i<=3;i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
			System.out.println(i +"나는 for문");
		}
	}

	public static void main(String[] args) {
		MyThread my = new MyThread();
		Thread t = new Thread(my);
		t.start();
		System.out.println("메인동작");

	}
	
	
	 

}
