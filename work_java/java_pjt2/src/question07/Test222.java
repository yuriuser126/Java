package question07;


public class Test222 {
	public static void main(String[] args) {
		
		int sum =0;
		int n[][] = new int[3][4];
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j]=(int)(Math.random()*10);
				System.out.print(n[i][j]+"\t");
				sum += n[i][j];
			}
			System.out.println();
		}
		System.out.println("합은"+sum);
		
	}
}

