package question06;

public class BabySum {
	public static void main(String[] args) {
		int n[][] = new int[120][5];
		int sum=0;

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j]=(i+1)*100+(j+1);
//				System.out.print(n[i][j]+" ");
				sum+=  n[i][j];
			}
//			System.out.println();
		}
		
	System.out.println("10년간 5개 나라의 총 신생아 수는"+(sum));}
}