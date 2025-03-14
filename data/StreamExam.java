package kosa.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExam {

	public static void main(String[] args) {
		// 배열 => 리스트
//		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		List<Integer> numbers = IntStream.rangeClosed(10, 20) //범위로
//				.filter(n ->  n % 2 == 0) //요소들 중에서 원하는 것만 뽑기
//				.map(n -> n * n) //각각의 요소들에게 반복된 작업 수행할 때
//				.boxed()
//				.collect(Collectors.toList());
		//짝수만 필터링 => 제곱 => 리스트로 변환
//		List<Integer> squares = numbers.stream()
//				.filter(n ->  n % 2 == 0) //요소들 중에서 원하는 것만 뽑기
//				.map(n -> n * n) //각각의 요소들에게 반복된 작업 수행할 때
//				.collect(Collectors.toList());
		
		
	
//		System.out.println(numbers);
//		System.out.println(squares);

		List<Student>list = Arrays.asList(
				new Student("홍길동", 90),
				new Student("홍길", 70),
				new Student("김길동", 50)
				);
//		list.stream().mapToInt(s -> s.getScore()) //s = Student 객체 하나하나
//			.forEach(score -> System.out.println(score));
//		list.stream().map(Student::getName) //Student::getName == s.getname()
//			.forEach(name -> System.out.println(name));
		
		//스트림을 이용해서 " 홍씨만 출력 => filter
//		list.stream().filter(s -> s.getName().contains("홍")).forEach(s -> System.out.println(s.getName()));
//		list.stream().filter(s -> s.getName().startsWith("홍")).forEach(s -> System.out.println(s.getName()));
		// regex
//		list.stream().filter(s -> s.getName().matches("홍[가-힣]+")).forEach(s -> System.out.println(s.getName()));
		
		String arr[] = {"BB", "CC", "AA"};
//		List<String> list2 = Arrays.asList(arr);
//		list2.stream().sorted().forEach(System.out::println);
		
		Arrays.stream(arr).sorted().forEach(System.out::println);
		
		//	Arrays.stream(arr) == stream
		
		
		
	}

}
