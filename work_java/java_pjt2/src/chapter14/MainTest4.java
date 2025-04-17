package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MainTest4 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
//		mapToInt : 기본현 int 타입으로 변환
//		리스트를 스트림으로 생성하고int로 변환해서 합계를 구함
		// list-> stream -> int 합계
		int sum1 =list.stream().mapToInt(n->n).sum();
		//1부터 5까지의 합계 15
		//IntStream.of : 정수를 스트림으로 생성
		int sum2 = IntStream.of(20,10,30).sum();
		
		System.out.println(sum1);
		System.out.println(sum2);
	}
}
