package chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java","Stream","Library");
		System.out.println("입력데이터="+words);
		//스트림생성
//		;+backspace -> 안에 들어감
		List<Integer> result = words.stream()
//				메소드 참조로 문자열 길이 구함
		.map(String::length)
		.collect(Collectors.toList());
	System.out.println("실행결과="+result);
//	실행결과=[4, 6, 7]
	}
}
