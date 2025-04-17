package chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		System.out.println("입력데이터="+numbers);
		List<Integer> result = numbers.stream()//스트림생성
		//filter 메소드로 짝수만 추출(2,4,6,8)
		.filter(n->{return n%2==0;})//함수형 인터페이스 :filter (람다식)
//		map 메소드로 제곱
//		;+backspace -> 안에 들어감
		.map(n->{return n*n;})
//		스트림 객체를 리스트로 변환(최종연산)
		.collect(Collectors.toList());
	System.out.println("실행결과="+result);
//	실행결과=[4, 16, 36, 64]
	}
}
