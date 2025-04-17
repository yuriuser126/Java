package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	//필드 3개
	int id;
	String name;
	int price;

	//필드 만들기 - constructor using field
	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}
public class StreamTest {
	public static void main(String[] args) {
		//upcasting 으로 ArrayList 객체 생성
		List<Product> list=new ArrayList<>();
		//리스트추가
		list.add(new Product(1, "NoteBook", 100)); 
		list.add(new Product(2, "TV", 320)); 
		list.add(new Product(3, "Washing Machine", 250)); 
		list.add(new Product(4, "Air Conditioner", 500));
		
		List<String> result = list.stream()
		//가격이 300 초과한 제품을 추출
		.filter(p->p.price > 300)
//		추출한 제품이름
		.map(p->p.name)
//		스트림 객체를 리스트로 변환(최종연산)
		.collect(Collectors.toList());
		
		System.out.println(result);
	}
}
