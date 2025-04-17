package chapter08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class AA{}
public class HashSetExample {//구슬주머니
	public static void main(String[] args) {
		//String : 타입
		//Set 인터페이스 컬렉션 타입으로 HashSet 클래스 객체생성
		Set<String> set= new HashSet<String>();//upcasting
//		Set<AA> set= new HashSet<>();
//		Set<Object> set= new HashSet<>(); // 조상클래스라 다 받아줌
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");//set 컬렉션 중복 객체수가 불가
		AA a= new AA(); //객체생성
//	The method add(String) in the type Set<String> is not applicable for the arguments (AA)
//		set.add(a);//<Object> 타입으로 사용가능
		set.add("iBatis");
		
		int size = set.size();
		System.out.println("총 객체수 : "+size);
		
		//객체생성안되서 메소드로 객체생성
		//set 컬렉션은 iterator 메소드 호출해서 Iterator 인터페이스 타입으로 값을 반응
		Iterator<String> iterator=set.iterator();
		//구슬하나는 자바다.
		while (iterator.hasNext()) {//iterator 객체 값이 있으면
			String element = (String) iterator.next();
			//탭키로 정렬
			System.out.println("\t"+element);
			
		}
		set.remove("JDBC");//객체 삭제
		//그냥 size 하면 고정되서 4개나옴
//		System.out.println("총 객체수 : "+size);
		System.out.println("총 객체수 : "+set.size());
		/*
		Iterator<String> iterator2=set.iterator();
		while (iterator2.hasNext()) {//iterator2 객체 값이 있으면 jdbc 날린값나옴
			String element = (String) iterator2.next();
			System.out.println("\t"+element);
		}
		*/
		for (String element : set) { //for each 사용 위에것 대신.
			System.out.println("\t"+element);
		}
		
		if (set.isEmpty()) {//객체가 하나라도 있는지 확인
			System.out.println("비어 있음");
		} else {
			System.out.println("객체 있음");
		}
		
		set.clear(); // 객체 모두삭제
		if (set.isEmpty()) {//객체가 하나라도 있는지 확인
			System.out.println("비어 있음");
		} else {
			System.out.println("객체 있음");
		}
		
	}
}
