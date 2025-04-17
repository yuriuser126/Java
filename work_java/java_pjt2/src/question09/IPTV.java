package question09;


class TV2 {
//	private int size, color;
	private int size;

	public TV2(int size) {
		this.size = size;
//		this.color = color;
	}
	//alt g -> alt r = getter 생성
	  public int getSize() { return size; }
//	  public int getColor() { return color; }
//	  public void setSize(int size, int color) { this.size = size; this.color = color; }
}

 class ColorTV2 extends TV2{
	private int nColors;
	
		public ColorTV2(int size, int nColors) {
		super(size);
		this.nColors = nColors;
	}
	
	//출력 메소드
	public void printProperty() {
		System.out.println(getSize()+"인치"+nColors+"컬러");
	}
	
	
	  public static void main(String[] args) { ColorTV myTV = new ColorTV(32 ,
	  1024); myTV.printProperty(); }
	 
}

public class IPTV extends ColorTV2{
	private String ipAddr;
	
	public IPTV(String ipAddr, int size, int nColors) {
		super(size, nColors);
		this.ipAddr = ipAddr;
	}
	
	@Override
	public void printProperty() {
		System.out.print("나의 IPTV는"+ipAddr+" 주소의");
		super.printProperty();
	}

	public static void main(String[] args) {
		 IPTV iptv = new IPTV("192.1.1.2", 32, 2048); 
		  iptv.printProperty();
		
	}
}
	

