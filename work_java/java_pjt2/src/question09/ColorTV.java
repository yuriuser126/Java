package question09;


class TV {
//	private int size, color;
	private int size;

	public TV(int size) {
		this.size = size;
//		this.color = color;
	}
	//alt g -> alt r = getter 생성
	  public int getSize() { return size; }
//	  public int getColor() { return color; }
//	  public void setSize(int size, int color) { this.size = size; this.color = color; }
}

//public class ColorTV {
	public class ColorTV extends TV{
	private int nColors;
	
	
//	public ColorTV(int nClolrs) {
	public ColorTV(int size, int nColors) {
//		super();
		super(size);
		this.nColors = nColors;
	}
	
	//출력 메소드
	public void printProperty() {
		System.out.println(getSize()+"인치"+nColors+"컬러");
	}
	
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32 , 1024);
		myTV.printProperty();
	}
}
