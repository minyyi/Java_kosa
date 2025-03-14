package kosa.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class StackMission {

	public static void main(String[] args) {
		// 키보드로부터 수학 수식을 입력
		// ((2 + 3) + 10)=> 괄호일치 / 불일치 판단

		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
//		ArrayList<String>list = new ArrayList<String>();
		System.out.print("수식을 입력해주세요: ");
		String str = sc.nextLine();
//		stack.push(ex);
		try {
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				
				if(ch == '(') {
					stack.push(ch + "");
				}else if( ch == ')') {
					stack.pop();   //부족 => 예외발생시킴
				}
			}
			if(stack.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			}else {
				System.out.println("괄호가 불일치합니다.");
			}
		} catch (Exception e) {
//			System.out.println("괄호가 부족합니다.");
		}

//		System.out.println("---stack---");
//		for (int i = 0; i < ex.length(); i++) {
//			if (ex.charAt(i) == '(') {
//				stack.push(ex.charAt(i) + "");
//			} else if (ex.charAt(i) == ')') {
//				if (stack.isEmpty()) {
//					System.out.println("불일치");
//					return;
//				}else {
//					stack.pop();
////					System.out.println("일치");
//				}
////				stack.pop();
//			}
//		}
//		if(!stack.isEmpty()) {
//			System.out.println("불일치");
//		}else {
//			
//			System.out.println("일치");
//		}

	}

}
