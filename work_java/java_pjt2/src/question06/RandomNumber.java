package question06;

import java.util.Random;

/*
 * 난수를 발생 Math(클래스), Random(클래스)
 */

public class RandomNumber {
	public static void main(String[] args) {
		int rNumber; //난수
		Random generator = new Random();
		
		/*
		generator.nextInt(); //난수 발생(번위:int타입 범위->2의 31승~2의 31승 -1)
		generator.nextInt(10); // 난수발생(0~9의 정수)
//		int a = generator.nextInt(10)+1; // 난수발생(1~10의 정수) //변수안받으면 오류
//	double 범위.args .nextFloat()float 범위 .nextLong();long타입범위 .nextBoolean();참거짓
		generator.nextDouble(); 
		*/
	
	

//		switch (a) {
//		case 7: break;
//		default: System.out.println(a);
//		}
		
		while (true) {
			rNumber = generator.nextInt(10)+1;// 난수발생(1~10의 정수) 을 안에 넣는다
			//밖에 있으면 숫자 하나만 돈다
			System.out.println(rNumber);
			
			if (rNumber == 7) {
				break;
			}
		}

		
		
//		while (true) {
//			if (a==7) {
//				break;
//			}else {
//				System.out.println(a);
//			}
//			
//		}
	}
}
