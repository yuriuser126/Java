package question07;

//import java.util.Random;

public class twoDArray {
	public static void main(String[] args) {
		
//		int rNumber; //난수
//		Random generator = new Random();
		
		int n[][] = new int[4][4];
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j]=(int)(Math.random()*10+1);
				System.out.print(n[i][j]+"\t");
//				rNumber = generator.nextInt(10)+1;// 난수발생(1~10의 정수) 을 안에 넣는다
//				n[i][j] = rNumber ;
//				System.out.print(n[i][j]+" ");//n[i][j] < [j]하나 안붙였다고ㅜ 출력 엉망이였음
			}
			System.out.println();

		}
		
	}
}
