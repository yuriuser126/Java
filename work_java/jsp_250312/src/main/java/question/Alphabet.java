package question;

public class Alphabet {
	//question 패키지로 Alphabet 클래스를 생성
	//a~z까지의 소문자알파벳을입력받아서
	//문자열을출력하는process() 메소드
	//입력받은알파벳을이용한getter, sertter 메소드 작성
	
	
//	private char alphabet;
	private String str;
	
	

	public String process() {
	StringBuffer strBuf = new StringBuffer();
	char c='a';
	char c2 = str.charAt(0);
	
	
	do {
		strBuf.append(c);
		c =(char)(c+1);
	} while (c <=c2);
	return strBuf.toString();
	
}
	
	
	public String getStr() {
		return str;
	}
	
	
	public void setStr(String str) {
		this.str = str;
	}


//	public String process(char alphabet) {
//		String str = "";
//		return str;
//		
//	}

//	public char getAlphabet() {
//		return alphabet;
//	}
//
//	public void setAlphabet(char alphabet) {
//		this.alphabet = alphabet;
//	}
	
	

}
