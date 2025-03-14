package kosa.basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		// Array
		/*
		 * 배열생성방법
		   1. 배열 선언, 생성 분리
		    ex. int arr[]; //배열 선언(배열변수 : 주소값)
		    arr = new int[5];//배열생성(메모리할당) arr에 주소값 할당
		   2. 배열 선언, 생성 함께
		   int arr2[] = new int[5]; 
		   3. 배열 선언, 생성, 초기화 함께
		   int arr3[] = {1, 2, 3, 4, 5};
		    
		 * */
//		  int arr[]; //배열 선언(배열변수 : 주소값)
//		    arr = new int[5];//배열생성(메모리할당) arr에 주소값 할당
//		    System.out.println(arr); //주소값 출력됨.[I@7d6f77cc
//		    int arr2[] = new int[5]; 
//		    arr2[0] = 10;
//		    arr2[1] = 20;
//		    System.out.println(arr2[0] + ", " + arr2[1]); //10, 20
//		    int arr3[] = {7, 2, 5, 4, 6};
//		    
		    /*배열출력방법 2가지*/
		    //배열에 있는 내용 출력 => for 문 초기식: i=0,범위: 배열크기 -1
//		    for (int i = 0; i < arr3.length; i++) { //
//		    	for (int i = 0; i < 6; i++) { //error: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//		    	at kosa.basic.ArrayExam01.main(ArrayExam01.java:29)
//		    	System.out.println("arr3["+i+"]=" + arr3[i]);
// 
//		    }
//		    	향상된 for 문: 전체 다 돌고 싶을 때
//		    for (int n : arr3) { //n: 배열의 값. 인덱스 아님. 
//		    	System.out.print(n + ", ");
//		    }
//		    	 System.out.println();
		    
//		    for (int i = 0; i < arr3.length; i++) { //n: 배열의 값. 인덱스 아님. 
//		    	System.out.print(arr3[i]);
//		    	if(i < arr3.length - 1) {
//		    		System.out.print(", ");
//		    	}
//		    	if(i < arr3.length -1 ) {
//		    		System.out.print(arr3[i] + ", ");		    		
//		    	} else {
//		    		System.out.print(arr3[i]);		    		
//		    		
//		    	}
		    	
		    	/*
		    	 * 배열사용방법
		    	  1. 배열에 사용도리 데이터 타입을 결정한다
		    	  2. 배열의 크기를 결정한다. 
		    	  3. 배열 생성 방법 선택 3가지중 선택 
		    	  4. 배열을 어떻게 초기화 (위 에서 3번방법으로 하면 필요 없음)
		    	  		=>1. 인덱스 직접 접근, 2. for문 3.방법({값, 값, ...})
		    	  5. 배열의 데이터 어떻게 출력? => 1.직접 인덱스접근, 2.for문, 3.향상된 for문		
		    	  */
		    	
		    	
//		    	키보드로부터 문자열을 입력받아 배열에 추가한 후 전체를 출력하자
//		    	"q"를 입력할때까지 계속해서 입력받아 배열에 추가하도록 한다. 
		    	/*
		    	 ex)입력: 홍길동
		    	 	  입력: 김길동 
		    	 	  ....
		    	 	  입력: q
		    	 	  출력> 홍길동, 김길동, ...
		    	 * */
		    	System.out.println();
		    	Scanner sc = new Scanner(System.in);
		    
		    	String name[] = new String[10]; 
//		    	String[] //이렇게도 할 수 있음 name= new String[10]; 
//		    	
//		    	int j = 0;
//		    	
//		    	while(true) {
//		    		System.out.print("입력: ");
//		    		String value = sc.nextLine();
//		    		if(value.equals("q")) {
//		    			
//		    			for(int i=0; i<name.length;i++) {
//		    				System.out.print(name[i] +", ");
//		    			}
//		    			break;
//		    		}
//		    		
//		    		name[j] =  value;
//		    		System.out.println(name[j]);
//		    		j++;
//		    	
//		    	System.out.print(name[j]);
		    	String sArr[] = new String[10]; 
		    	int count = 0; //중요!!!!!
		    	 
		    	while(true) {
		    		System.out.print("입력: ");
		    		String str = sc.nextLine()	;
		    		
		    		if (str.equals("q")||str.equals("")) break;
//		    		sArr[0] = str; // [0]자리에만 계속 들어가서 덮어쓰기됨.
		    		sArr[count++] = str; 
		    		
		    	}
		    	
//		    	for(int i = 0; i < sArr.length; i++) {// 이렇게 하면 값이 없어도 다 출력됨
		    	for(int i = 0; i < count; i++) {// 입력한 값까지만 나오도록
		    		System.out.print(sArr[i]);
		    		if(i<count -1) {
		    			System.out.print(", ");
		    		}
		    	}
		    	
		    }
	}

//}
