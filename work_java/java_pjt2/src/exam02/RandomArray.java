package exam02;

public class RandomArray {
	public static void main(String[] args) {
		int intArray[][]= new int [3][4];
		int sum=0;
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length; j++) {
				intArray[i][j] = (int)(Math.random()*10);
				sum += intArray[i][j];
				System.out.print(intArray[i][j]+"\t");
				
			}
			System.out.println();
		}
		System.out.println("합은"+sum);
	}
}
