package question;

import java.util.Scanner;

public class DivAndRemains {
	// src 폴더에 question 패키지로 DivAndRemains 클래스를 생성
	// 10의 자리와1의자리의숫자가같은지를판단하는process() 메소드 작성,
	//입력받은숫자를이용한getter, sertter 메소드 작성
	private int num;
	
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String process(int i) {
		
//		Scanner.
		String result="";
//		int ten=i/10;
//		int one=i%10;
		
		int ten=0;
		int one=0;
		ten=i/10;
		one=i%10;
		
		
		
		if(ten == one) {
			  result = "10의자리와 1의자리와 같습니다.";
		}else {
			result =   "10의자리와 1의자리와 다릅니다.";
		
		}
		return  result;		
		
	}
	

}
