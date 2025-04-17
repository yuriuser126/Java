package question07;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		//ArrayList 클래스 타입으로 ArrayList 클래스로 객체생성(제네릭 타입파라미터를 String)
		ArrayList <String> array =new  ArrayList<>();
		boolean aaa =  array.add("oracle");//추가가 됬으니까 참
		System.out.println(aaa); 
		boolean bbb =  array.add("mysql");//추가가 됬으니까 참
		System.out.println(bbb); 
		boolean ccc =  array.add("oracle");//중복된 객체를 추가해도 문제없음.
		System.out.println(ccc); 
		
		for (int i = 0; i < array.size(); i++) {
			String str = array.get(i);
			System.out.println(i + ": "+str );
		}

		

	}
}
