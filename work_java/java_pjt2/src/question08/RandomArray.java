package question08;

import java.util.Scanner;

public class RandomArray {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("정수 몇개?");
			int a = scanner.nextInt();
//			int b=0;
//			int c=0;
//			
//			a = b+c;
			
			int n[][] = new int[3][];
				
			for (int i = 0; i < n.length; i++) {
				if (n[i].length <10) {
				
//				n[i].length = 10;
				for (int j = 0; j < n[i].length; j++) {
					n[i][j]=(int)(Math.random()*100+1);
					System.out.print(n[i][j]+"\t");
				}
				}
			
			
		}

}
}

