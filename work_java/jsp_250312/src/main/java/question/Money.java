package question;

public class Money {
	// question 패키지로 Money 클래스를 
	//돈의 액수를 입력받아서오만원권, 만원권, 천원권, 
	//500원짜리 동전, 100원짜리 동전, 50원짜리동전, 10원짜리 동전, 1원짜리 동전 각 몇 개로출력
	//process() 메소드작성,
	//입력받은돈의금액을이용한getter, sertter 메소드 작성
	
	private int num;

	public String process() {

		int [] unit = {50000, 10000, 1000, 500, 100,50, 10,1};
		StringBuffer strBuf = new StringBuffer();
		
		for (int i = 0; i < unit.length; i++) {
			int res = num/unit[i];
			
			if (res>0) {
				strBuf.append(unit[i]+"원 짜리 :"+res+"개<br>");
				num=num%unit[i];
			}
		}
		return strBuf.toString();
	}
	
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
}
