package question08;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RandomArray3 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("정수 몇개?");
			int n = scanner.nextInt();
			int array[]=new int[n]; 
			
			for (int i = 0; i < array.length; i++) {
				int r = (int)(Math.random()*100+1);
				array[i] = r;
				
				if (i == 0) {
					System.out.print(array[i]+" ");
				} else {

//					if (array[i ] != r) {
					if (i%10 == 0) {
							
							System.out.println();
							if (array[i] == r ) {
//								Set<String> linkedHashSetStrList = new  LinkedHashSet<>(Arrays.asList(array));
//								Set<String> linkedHashSetStrList = new LinkedHashSet<>(array);
								System.out.println("String[] 중복 제거(순서 보장X) :: ");
							}
								
							}
					
						
					System.out.print(array[i]+" ");

				}
				}
		}
}


