package chapter08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) {
		//List 컬렉션에서 ArrayList 클래스로 객체생성(제네릭 타입파라미터를 String)
		//upcasting
		List<String> list=new ArrayList<>();//List 에 커서 위치하고 ctrl+t
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
//		list.add("Database");
		//2번째 인덱스 : Database
		list.add(2, "Database"); //2번째 인덱스에 삽입되어서2번이 밀려남->3: Servlet/JSP
		list.add("Spring"); 
		
		int size = list.size();
		System.out.println("총 list 갯수 "+size);
		
		String skill =  list.get(2);
		//2번째 인덱스 : Servlet/JSP
		//2번째 인덱스 : Database
		System.out.println("2번째 인덱스 : "+skill);
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			/*
			 * 0: Java
			 * 1: JDBC
			 * 2: Database
			 * 3: Servlet/JSP
			 * 4: Spring
			 */
			System.out.println(i+": "+str);
		}
	
		System.out.println();
		
		list.remove(2);//인덱스로 객체 삭제
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
		System.out.println();
		

		list.remove("Spring");
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
	}
}
