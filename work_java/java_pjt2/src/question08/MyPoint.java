package question08;

/*class MyPoint{
	
}*/
//문제좀 읽자.. 메인안에 작성..

public class MyPoint {
	
	private int x,y;
	
	public MyPoint(int x, int y) { // 생성자
		this.x = x;
		this.y = y;
	}
	
	//to 치고 ctrl space
	@Override
	public String toString() {
		 return "Point("+x+","+y+")"; 
	}
	
	/*
	 * public String toString() { return "Point("+x+","+y+")"; }
	 */
	
	public static void main(String[] args) {
		MyPoint p = new  MyPoint(3,50);
		MyPoint q = new  MyPoint(4,50);
		
		System.out.println(p);
		
		if (p.equals(q)) { System.out.println("같은 점");
		} else { System.out.println("다른 점");
		}
	}
}
