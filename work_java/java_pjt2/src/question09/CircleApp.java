package question09;

class Circle{
	private int x, y, radius;

	public Circle(int x, int y, int radius) {//생성자
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		 return "Circle("+x+","+y+")"+"반지름"+radius; 
	}
	
	@Override
	public boolean equals(Object obj) {
		Circle b = (Circle) obj;
		if (x == b.x && y== b.y) {
			return true;
		} else {
			return false;
		}
	}
	
/*	  public boolean equals (Circle a) {
	  
	  if (a.x = b.x && a.y = b.y) {
	  
	  return true; } else { return false; }
	  
	  }*/
	 
	
}

public class CircleApp {
	
	
		public static void main(String[] args) {
			 Circle a = new Circle(2,3,5); //객체생성 . 파라미터 세개짜리
			 Circle b = new Circle(2,3,30);
			 System.out.println("원 a : " + a);
			 System.out.println("원 b : " + b);
			 if (a.equals(b)) {
				System.out.println("같은 원");
			} else {
				System.out.println("서로 다른 원");

			}
		}

}
