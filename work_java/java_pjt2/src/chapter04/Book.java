package chapter04;

public class Book {
//	4.멤버저장
	String title;	//멤버변수(=필드) 어린왕자
	String author;	//멤버변수(=필드) 생텍쥐베리
	//멤버변수(=필드) 2개
	
	//생성자
//	2."어린왕자","생텍쥐베리"  매개변수2개 받음
	public Book (String t, String a) {				
//		3.매개변수를 멤버로 저장
		title=t; //매개변수를 멤버변수에 넣음
		author=a; //매개변수를 멤버변수에 넣음
	}
	//생성자
//	2.춘향전 매개변수로 받는다
	public Book (String t) {				
//		3.매개변수를 멤버로 저장
		title=t;  //"춘향전"
		author="작자미상";
	}
	
//	littlePrince : 참조변수
	public static void main(String[] args) {
		//기본생성자를 자동으로 만들어서 호출(컴파일러)
//		new Book(); //객체 생성 // 생성자가 하나라도 존재하면 자동으로 기본생성자를 만들지 못해서 오류
//		1.매개변수 가지고 생성자 호출
		Book littlePrince = new Book("어린왕자","생텍쥐베리"); //문자열 2개 매개변수2개 받음
//		1.매개변수 가지고 생성자 호출
		Book loveStory = new Book("춘향전"); //매개변수 1개짜리 생성자가 없음
		
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);
	}
}
