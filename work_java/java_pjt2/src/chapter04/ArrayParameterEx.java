package chapter04;

public class ArrayParameterEx {
//	공백을 쉼표로 바꾸는 메소드
	//replaceSpace : 메소드
	static void replaceSpace(char a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i]== ' ') {
				a[i]=',';
				
			}
		}
	}
	
//	파라미터로 받은 배열원소를 출력
		static void printCharArray(char a[]) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
			System.out.println();
	}
	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}
}
