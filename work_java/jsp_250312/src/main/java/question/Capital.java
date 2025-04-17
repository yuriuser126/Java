package question;

import java.util.Iterator;

public class Capital {
// question 패키지로 Capital 클래스를 생성
	//A~Z까지의 대문자알파벳을입력받아서
	//문자열을출력하는process() 메소드 작성
	//입력받은알파벳을이용한getter, sertter 메소드 작성
	
	private String str;

	
	//이거랑 별이랑 합쳐지는데에
	public String process ( ) {
		StringBuffer strBuf = new StringBuffer();
//		char c='a'; 대문자아앙
		char c='A';
		
		char c2 = str.charAt(0);
		
		//for문 수정필요했다.
//			for (char i = c;  i >= 'A'; c--) {
		//i 랑 'A'=c인거 알아둬야함
			for (char i = c2;  i >= c; i--) {
//				for (char j = 'A'; j <= i ; j++) {
					for (char j = c; j <= i ; j++) {
					strBuf.append(j);
				}
				strBuf.append("<br>");
			}
			return strBuf.toString();
			}
		
		

	
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	
	
	
}
