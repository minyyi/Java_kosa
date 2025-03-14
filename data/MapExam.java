package kosa.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		// Map : key: value => HashMAp
//		Map<String, String> map = new HashMap<String, String>();
//		
//		map.put("1", "KIA");
//		map.put("2", "Samsung");
//		map.put("3", "LG");
//		
//		System.out.println("요소의 사이즈: " +map.size());
//		
//		if(map.containsValue("LG")) {
//			map.remove("3");
//		}
//		System.out.println("요소의 사이즈: " +map.size());
//		System.out.println("2위팀: " +map.get("2"));

		// 시험성적

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("김자바", 50);
		map.put("박자바", 90);
		map.put("이자바", 60);
		map.put("조자바", 30);
		map.put("정자바", 80);
		map.put("한자바", 70);

//		System.out.println("요소의 사이즈: " +map.size());

		// key만 추출
		Set<String> set = map.keySet(); // key 값만 리턴해주는 매서드 그래서 Set사용
		System.out.println("응시자 명단: " + set);
		// 응시자 명단: [김자바, 박자바, 한자바, 이자바, 조자바, 정자바] : set은 순서가 없어서 입력 순서와 출력순서 다름
		// value값만

		Collection<Integer> values = map.values();// Collection 크래스 Collections 아님주의!
		Iterator<Integer> iter = values.iterator();
		int total = 0;
		while (iter.hasNext()) {
			total += iter.next();
		}
		System.out.println("총점: " + total);
		System.out.println("평균: " + total/map.size());
		System.out.println("최고점수: " + Collections.max(values));
		System.out.println("최저점수: " + Collections.min(values));

	}

}
