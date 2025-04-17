package question06;

import java.util.Random;

public class RandomTen {
	public static void main(String[] args) {
		
		int rNumber; //난수
		Random generator = new Random();
//		
//		Scanner scanner = Scanner(System.in);
//		int rNumber = scanner.nextInt();
//		rNumber = generator.nextInt(10)+1;// 난수발생(1~10의 정수) 을 안에 넣는다
		
		int n[] = new int[10];
		int sum=0;
		
		for (int i = 0; i < n.length; i++) {
		rNumber = generator.nextInt(10)+1;// 난수발생(1~10의 정수) 을 안에 넣는다
		n[i] = rNumber ;
			System.out.print(n[i]);
			sum+=n[i];
		}
		
		System.out.print("랜덤한 정수들 :");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}
//		System.out.println();
		System.out.println("\n평균은 "+(double)sum/n.length);
		
		


	}
}

//
////int rNumber; //난수
////Random generator = new Random();
////
////Scanner scanner = Scanner(System.in);
////int rNumber = scanner.nextInt();
////rNumber = generator.nextInt(10)+1;// 난수발생(1~10의 정수) 을 안에 넣는다
//
//int n[] = new int[10];
//int sum=0;
//
//for (int i = 0; i < n.length; i++) {
////	rNumber = n[i];
//	int r= (int)(Math.random()*10)+1; // 1~10->?
//	n[i]=r;
////	System.out.print(n[i]);
//	sum+=n[i];
//}
//
//System.out.print("랜덤한 정수들 :");
//for (int i = 0; i < n.length; i++) {
//	System.out.print(n[i]+" ");
//}
////System.out.println();
//System.out.println("\n평균은 "+(double)sum/n.length);
//
////scanner.close();
//
//
//
//}
//}

