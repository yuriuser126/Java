package question08;

import java.util.Scanner;

public class RandomArray2 {
	//난수의 중복체크하는 메소드
	//a[]:array, to:0 r:23
	//a[]:array, to:1 r:33
	
	public static boolean exists(int a[], int to , int r) {
		//0:반복안함
		//0<1
		for (int i = 0; i < to; i++) {
//			a[0 ]:23 r:33
//			a[0 ]:23 r:33 a[1]:33 r:33
			if (a[i] == r) {
				return true; //중복되었다.
			}
		}
		return false; //끝까지 반복되는 숫자가 없으면 false 나타냄
	}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("정수 몇개?");
			int n = scanner.nextInt();
			int array[]=new int[n]; 
			
				
			for (int i = 0; i < array.length; i++) {
				int r = (int)(Math.random()*100+1);
				//난수 발생시킴
				// i=0 r=23 i=1 r=33 i=2 r=33
				if(exists(array, i, r)) {
					i--;
					continue;
				}
//				array[0]=23
//				array[1]=33
				//담기기전에 i값을 줄여서 리셋해버림
				
				array[i] = r;
				if (i == 0) {//첫번째는 엔터 안친다
					System.out.print(array[i]+" ");
					
				} else {
					if (i%10 == 0) {
						System.out.println();
					}
					System.out.print(array[i]+" ");

				}
				
				
				}
			
			
		}

}

