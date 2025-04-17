package question;

public class TwoArray {
	//question 패키지로 TwoArray 클래스를 생성
	//10 이하 정수를입력받아
	//입력받은정수갯수만큼2차원배열가로,세로갯수
	//는process() 메소드 작성
	//입력받은 정수를 이용한 getter, sertter 메소드
	
	private int num;

	
	public String process() {
		StringBuffer strBuf = new StringBuffer();
		int n[][] = new int [num][num];
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j] =(int)(Math.random()*10+1);
				//&nbsp -이걸로 띄운다.
				strBuf.append(n[i][j]+"&nbsp;&nbsp;&nbsp");
				
			}
			strBuf.append("<br>");
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
