package area;

public class Circle2 {
//	src 폴더에 area 패키지로 Circle2 클래스를 생성  O
//	 원의 넓이를 계산하는process() 메소드 작성 O
//	 반지름을 이용한 getter, sertter 메소드 작성 O
	
	private int radius;
	
	
	
//	public int getCircler() {
//		return radius;
//	}
//
//	public void setCircler(int radius) {
//		this.radius = radius;
//	}



	public int getRadius() {
		return radius;
	}



	public void setRadius(int radius) {
		this.radius = radius;
	}



	public double process (int  r) {
		return  radius*radius*3.14;
		
		
	}

	
}
