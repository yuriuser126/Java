package chapter08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		//Map 컬렉션 : 구조가 키, 값으로 구성
		//Map 인터페이스 타입으로 HashMap  클래스 객체 생성(키: 문자열, 값: 정수형 Wrapper 클래스) 
		//upcasting
		Map<String, Integer> map= new HashMap<>();
		map.put("임영웅", 31);
		map.put("영탁", 38);
		map.put("이찬원", 25);
//		map.put("임영웅", 30);//키는 중복이 안됨 30이 나옴
		map.put("김호중", 31);//값은 중복 허용 - 새로 나옴
		map.put("정동원", 14);
		
		//Map.Entry 구조로 키/값 구성
		System.out.println("총 Entry 수 : "+map.size());
		System.out.println("총 Entry 수 : "+map.get("임영웅"));//키에 해당하는 값 출력
		System.out.println();
		
		
		//map 컬렉션의 모든 키들을 Set 컬렉션으로 받음 타입이 Set 
		Set<String> keySet =  map.keySet();
		Iterator<String> keyIterator =  keySet.iterator();
		
		//Map 컬렉션 키/값을 가져오는 1번째 방식
		while (keyIterator.hasNext()) {//컬렉션 객체가 있으면 참
			// 컬렉션 객체를 가져옴 next메소드로
			String key = (String) keyIterator.next();
			Integer value = map.get(key);//get() 메소드로 Map 컬렉션의 키를 가지고 값을 가져옴
			
			//출력 순서는 랜덤으로 발생됨 - 인덱스 개념이 없다.
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		map.remove("임영웅");
		
		System.out.println("총 Entry 수 : "+map.size());
		
		//Map.Entry : 구조로 키/값으로 객체를 받음
		Set<Map.Entry<String, Integer>> entrySet =  map.entrySet();
		//반복할때
		//ㄴSet 컬렉션 방식으로 객체 처리(키, 값을 가져옴)
		Iterator<Map.Entry<String, Integer>> entryIterator =  entrySet.iterator();

		
		//Map 컬렉션 키/값을 가져오는 2번째 방식
		while (entryIterator.hasNext()) {//컬렉션 객체가 있으면 참
			// 컬렉션 객체를 가져옴 next메소드로
			//entry 객체안에 키랑 값이 있다.
			Map.Entry<String, Integer> entry =  entryIterator.next();
			String key = entry.getKey();//키를 가져옴
			Integer value = entry.getValue();//값을 가져옴
			System.out.println("\t"+key+":"+value);
			
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 Entry 수 : "+map.size());
	}
}
