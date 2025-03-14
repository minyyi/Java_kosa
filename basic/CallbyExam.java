package kosa.basic;

public class CallbyExam {
// call by value/reference 
	
//	public static void change(int num) {
//		num +=10;
//	}
	public static int change(int num) {
		num +=10;
		return num;
	}
	public static void change2(int arr[]) {
		arr[0] = 200;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num = 10;
////		change(num);
////		num = change(num);
//		int result = change(num);
//		System.out.println(result); //10 출력
		
		//
		int arr[] = {100};
		change2(arr);
		System.out.println(arr[0]); 
		//200 return 안해도 주소값 참조하고 있어서 같은 값을 사용할 수 있음. 
		
	}

}
