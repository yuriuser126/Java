package question07;
/*
 * 
 * 
 */
import java.util.ArrayList;


public class ArrayParameterEx {
	
	static void printStringArray(String a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	static void replaceBe(String a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("be")) {
				a[i]="eat";
				
			}
		}
	}

	
	
		public static void main(String[] args) {
			
			String s[] = {"to"," ","be"," ","or"," ","not"," ","to"," ","be"};
			printStringArray(s);
			replaceBe(s);
			printStringArray(s);
			

		}

}
