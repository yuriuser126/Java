package chapter12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayTest2 {
		public static void main(String[] args) {
		String[] a= {"a","b","c","d"};
		//[Ljava.lang.String;@36baf30c : 객체니까 객체 주석 해시코드값이랑 같이나옴
		int[] b = {1,5,5,7,3,3,42,6,8,45323,4,63,2,1};
		
		System.out.println(a);//배열 객체 출력이 된다.
		//[a, b, c, d] 출력됨
		System.out.println(Arrays.asList(a) );// 배열이 똑바로 출력된다.-> 리스트로 변환
		List<String> list = Arrays.asList(a);
		//@# list.get(0)-> a 출력이 된다.
		System.out.println("@# list.get(0)-> "+list.get(0));
		
		//[1, 5, 5, 7, 1, 2, 3, 3, 4, 6, 8, 42, 63, 45323] : 출력됨
		//정렬을 인덱스정렬(4~13)
		Arrays.sort(b, 4, 14);
		System.out.println(Arrays.toString(b));//string으로
		//[1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 42, 63, 45323] :출력됨
		//오름차순 정렬이다.
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));//string으로
		
		Arrays.sort(a, Collections.reverseOrder());
		//[d, c, b, a] :출력
		//내림차순 정렬이다. 문자열 배열을 내림차순
		System.out.println(Arrays.toString(a));//string으로

		Arrays.sort(a);
		//[a, b, c, d] : 출력
		//오름차순 정렬이다. 문자열배열을 오름차순
		System.out.println(Arrays.toString(a));//string으로
		
		Arrays.sort(a,2,4,Collections.reverseOrder());
		//[a, b, d, c]
		//인덱스 2에서 4전까지 2~3까지 출력
		System.out.println(Arrays.toString(a));//string으로
		
		String[] cc = {"11","12","13","23","53","223","145","53"};
		//배열은cc가 된다.
		Arrays.sort(cc,Collections.reverseOrder());
		//[53, 53, 23, 223, 145, 13, 12, 11] : 스트링이라서 53이 제일먼저나온다.
		//출력화면 ^
		System.out.println(Arrays.toString(cc));//string으로
		
		//b배열 b배열크기만큼
		//배열객체를 통채로 복사한다. 개념이 다르다 .!!!
		//c로 받는다
		int[] c = Arrays.copyOf(b, b.length); 
		//[1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 42, 63, 45323] : 출력화면
		//b를 가지고와서 c를 출력했다.
		System.out.println(Arrays.toString(c));//string으로
		
		String[] d = Arrays.copyOf(a, 3); // a배열 객체를 크기 3인 배열로 복사
		//a배열은 String 타입
		System.out.println(Arrays.toString(d));//string으로
		//[a, b, d] :통으로 가지고와서 복사함 - 3의크기로 복사했다 /제일끝이 빠짐 / 앞에서 크기3
		System.out.println(Arrays.toString(a));//string으로
		//[a, b, d, c]
		
		}
}
