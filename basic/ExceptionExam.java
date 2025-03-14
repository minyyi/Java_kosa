package kosa.basic;

public class ExceptionExam {

	public static void noEquals(int a, int b) throws Exception { 
		//무조건 예외가 발생될 여지가 있는 메소드 => 무조건 에러뜸!
		if (a == b) {
			throw new Exception("같은 값 안돼!");
		}
	}
	
	public static void main(String[] args) {
		// 예외처리
		
		try {
			System.out.println("1");
//			noEquals(10, 10); //1, 3,  "같은 값 안돼!", 4, 5
			noEquals(10, 20); //1, 2, 4, 5
			System.out.println("2"); //X
		} catch (Exception e) {
			System.out.println("3"); 
			e.printStackTrace();
		}finally {
			System.out.println("4");
		}
		System.out.println("5");
	} 

}
