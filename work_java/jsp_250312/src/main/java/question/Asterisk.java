package question;

public class Asterisk {
	// question 패키지로 Asterisk 클래스를 생성
	// 양의 정수를 입력받아서별표를출력하는process() 메소드
	//입력받은 양의 정수를 이용한getter, sertter 메소드 작성
	
	private int num;

	
	


	public String process() {
		StringBuffer strBuf = new StringBuffer();
		//위에거 추가
		//int i = num : 시작점
		for (int i = num ; i >0 ; i--) {
			
			for (int j = 0; j < i; j++) {
				strBuf.append('*');
			}
			strBuf.append("<br>");
		}
		return strBuf.toString();
		//위에 리턴 추가
	}
	
	

	
	public int getNum() {
		return num;
	}
	
	
	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	
	
	

}
