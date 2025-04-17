package chapter02;

public class RandomNumber {
	public static void main(String[] args) {
		int n = rollDie();
		System.out.println("주사위의 눈 : "+n);
		
		
	}
	//매개변수가 없는 메소드다. 파라미터 없다= 매개변수없다
	public static int rollDie() { //rollDie 빨가면 return 안해놔서 그런거임 int 타입.
//		random() : 0이상 1미만 난수발생(실수)		
//		Math.random();
//		random() : 0이상 6미만 난수발생(실수)		
	double x = 6*  Math.random(); //0이상 6미만 6을 곱해서
//		0에서 5의 난수 / 0 1 2 3 4 5
	int temp = (int)x; //double로 받아서 x 를 int 강제변환
	
//		1에서 6의 난수 / 1 2 3 4 5 6
	return  temp+1; // 1 2 3 4 5 6 (주사위)
		
	}
}
