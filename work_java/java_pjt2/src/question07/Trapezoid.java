package question07;
/*
 * 사다리꼴 면적=0.5*(아랫변+윗변)*높이
 * 필드 : 아랫변 윗변 높이
 * 아랫변, 윗변, 높이 입력받아서 객체에 필드로 접근해서 입력
 * 
 */
import java.util.Scanner;

public class Trapezoid{
//	 int down; // 이름이 같은 참조변수 : 필드
//	 int up;
//	 int height;
//	 
	 private int down;
	 private int up;
	 private int height;
	 
	 //Tra-> 자동완성 기본 생성자
	 public Trapezoid() {
	}

//	 
//
//	public Trapezoid(int down, int up, int height) {
//		this.down = down;
//		this.up = up;
//		this.height = height;
//	}

	//계산 메소드
	public double getArea() {//int가 아니라 double
		return 0.5*(down+up)*height;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println( ">>");
		Trapezoid tra = new Trapezoid();
		
		tra.down = scanner.nextInt();
		tra.up = scanner.nextInt();
		tra.height = scanner.nextInt();
//		int down = scanner.nextInt();
//		int up = scanner.nextInt();
//		int height = scanner.nextInt();
//		Trapezoid tra = new Trapezoid(down,up,height);
		
		System.out.println("사다리꼴의 면적은 >>"+ tra.getArea());
		
		scanner.close();
	}
}
	

