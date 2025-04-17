package chapter06;


class Point3{
	private int x,y;

	//필드이용 알트 쉬프트 에스
	public Point3(int x, int y) { this.x = x; this.y = y; }

	
	//equals 오버라이딩해서 객체의 값을 비교
	@Override
//	Object obj : 이걸 b로 바꾸면 업캐스팅임 public boolean ()여기안에
//	boolean : 리턴타입
	public boolean equals(Object obj) {
		Point3 p = (Point3) obj; //다운캐스팅 형식
//		c참또는 거짓 비교해야하니까
		if (x == p.x && y == p.y ) {//a.equals(b) 비교 a객체의 값b
			return true;
		} else {
			return false;
		}
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		//생성자 호출 되겠죠-멤버변수
		Point3 a=new Point3(2, 3); 
		Point3 b=new Point3(2, 3); 
		Point3 c=new Point3(3, 4);
		
		
//		a!=b -다르다고 출력됨
		if (a==b) {//객체비교
			System.out.println("a==b");
		} else {
			System.out.println("a!=b");
		}
		
//		equals : 기본은 객체 비교 - 오버라이딩 안함 - 문자안에있는내용
//		a is equal not to b
//		a is equal not to b(객체의 값을 비교)
		if (a.equals(b)) {
			System.out.println("a is equal to b");
		} else {
			System.out.println("a is equal not to b");
		}
		
//		a is equal not to c
		if (a.equals(c)) {
			System.out.println("a is equal to c");
		} else {
			System.out.println("a is equal not to c");
		}
		
		
	}
}
