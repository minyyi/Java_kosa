package kosa.data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<String> list = new ArrayList<String>();
//		list.add("포도");
//		list.add("딸기");
//		list.add("복숭아");
//		int size = list.size();
//		for (int i = 0; i < size; i++) {
//			String str = list.get(i);
//			System.out.println(str);
//		}
		
		Random r  = new Random();
		
//		int arr[] = new int[6];
//		
//		for (int i = 0;i < arr.length; i++) {
//			arr[i] = r.nextInt(45) + 1;
//			for(int j = 0; j < i; j++ ) {
//				if(arr[i]==arr[j]) {
//					i = i - 1;
//				}
//			}
//			
//		}
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		
		//2. List 구현
		List <Integer>list = new ArrayList<Integer>();

		while(true) {
			int n = r.nextInt(45) + 1;
			if(list.contains(n)) {
				continue;
			}else {				
				list.add(n);		
			}
			if(list.size()==6) break;
		}
		Collections.sort(list);
		Iterator<Integer>iter = list.iterator(); //list 정수 6개가 들어가있음. 
		
		while (iter.hasNext()) {
			System.out.println(iter.next()+ ", ");
		} //데이터값이 다 할 때 까지 순회
//		System.out.println(list);
		
		//3. Set 구현 (TreeSet) => 중복허용안됨
//		Set<Integer> set = new TreeSet<Integer>();
//		
//		for (int i = 0; set.size()<6; i++) {
//			set.add(r.nextInt(45) + 1);
//		}
//		System.out.println(set);
		
	
		
		
		
		
		
		
		
	}

}
