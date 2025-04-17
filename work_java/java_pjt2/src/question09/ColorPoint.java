package question09;

class Point{
	private int x, y;

	public Point(int x, int y) {this.x = x;this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x;this.y = y;}


}


public class ColorPoint extends Point  {//상속 받고
	private String color; //필드를 만들고
	
//	public  ColorPoint(int x, int y,String string) {
		public  ColorPoint(int x, int y,String color) {
		super(x, y);
		this.color = color;
	}
		private void setXY(int x, int y) {//메소드 안쪽에
			move(x, y); //
		}
		private void setColor(String color) {//메소드 안쪽에
			this.color = color;
		}
	@Override public String toString() {
//		return"Color"+"색의"+" ("+x+","+y+")의 점";  
		return color+"색의"+" ("+getX()+","+getY()+")의 점";  //?????
		//get X() , getY() 요거 사용
		}

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");
		//메소드 만드는거까진 알겟음
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + " 입니다.");
		
	}




}
