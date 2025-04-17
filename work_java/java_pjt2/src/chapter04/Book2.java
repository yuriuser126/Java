package chapter04;

public class Book2 {
	String title;	
	String author;
	
	//두번째 title이 매개변수 위쪽 title임 . 3번째 title String title 매개변수랑 이어짐
	public Book2 (String title, String a) {			
		System.out.println("생성자1 호출됨");
//		매개변수 를 this 자기자신의 객체 멤버로 저장
		this.title=title;
		author=a;
	}

	public Book2 (String title) {				
		this(title,"작자미상");  //바로 생성자 1호출됨 으로 갔다가 밑으로 생성자 2호출 되는걸로감
		//this 마우스커서+Ctrl 밑줄생김 클릭하면 이동경로보임
		System.out.println("생성자2 호출됨");
//		this.title=title;  
	}
	
	public Book2 () {		//기본 매개변수 없는 생성자 - 비어있음		
		// this 생성자 호출 하기위해 별도로만든 자기자신 매개변수들어있는 객체
		this("","");  //바로 생성자 1호출됨 으로 갔다가 밑으로 생성자 2호출 되는걸로감
		//-매개변수 2개니까
		System.out.println("생성자3 호출됨");
	}
	
	//생성자2개만듬                                                                              
	//생성자에서 생성자 호출을 해보자.
//	show : 메소드
	
	void show() {
		System.out.println(title+" "+author);//멤버변수 2개출력
	}
	
	//Book -> Book2로 바꾸기
	public static void main(String[] args) {
		Book2 littlePrince = new Book2("어린왕자","생텍쥐베리"); 
		Book2 loveStory = new Book2("춘향전"); 
		Book2 emptyBook= new Book2(); //기본생성자가 없다-오류 // 매개변수 없는애로
		
//		System.out.println(littlePrince.title+" "+littlePrince.author);
		littlePrince.show(); //한번 호출 한번출력
		loveStory.show(); //한번 호출 한번출력
		emptyBook.show(); //한번 호출 한번출력
		
	}
}
