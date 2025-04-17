package question09;

class PointTwo{
public PointTwo() {
	// TODO Auto-generated constructor stub
}
	private int x, y;
	public PointTwo(int x, int y) {this.x = x;this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x;this.y = y;}
}



public class ColorPointTwo extends PointTwo  {//상속 받고
	private String color; //필드를 만들고
	//생성자 두개랑 수퍼 하나 사용하는거
	//수퍼는 컬러
	//생성자 두개는 이해완료 설정하는게 어려웠음
	
	public  ColorPointTwo() {
//		this(0,0);
		move(0, 0);
//		this.color = "BLACK"; // 기억하기 !!!!!!!!!!!!
	}

//	public  ColorPoint(int x, int y,String string) {
		public  ColorPointTwo(int x, int y) {
		super(x, y);
		this.color = "BLACK"; // 기억하기 !!!!!!!!!!!!
	}
		private void setXY(int x, int y) {//메소드 안쪽에
			move(x, y); //
		}
		private void setColor(String color) {//메소드 안쪽에
			this.color = color;
		}
	@Override public String toString() {
		return color+"색의"+" ("+getX()+","+getY()+")의 점";  
		//get X() , getY() 요거 사용
		}
	
		
//		  public String zeroPoint() {//요게 문제 // cp.setXY(0,0); this(0, 0); color =
//		  "BLACK"; // cp.setColor("BLACK"); return color; }
		 
	
	public static void main(String[] args) {
		ColorPointTwo zeroPoint = new ColorPointTwo();
		//Black 색에 (0,0)위치 점
		System.out.println(zeroPoint.toString() + " 입니다.");
		
		ColorPointTwo cp = new ColorPointTwo(10,10);
		cp.setXY(5,5);
		cp.setColor("RED");
		System.out.println(cp.toString() + " 입니다.");
		
	}




}
