package question;

public class Array3 {
// question 패키지로 Array3 클래스를 생성
	//100 이하 정수를입력받아서 입력받은정수갯수만큼(100이하랜덤정수) 로출력
	//process() 메소드 작성,
	
	//입력받은 정수를 이용한 getter, sertter 메소드 작성
	
	
	private int num;
	
	
	public String process () {
		StringBuffer strBuf = new StringBuffer();
//		int array[] = new int[strBuf];
		int array[] = new int[num];
		
		
		for (int j = 0; j < array.length; j++) {
			int r = (int)(Math.random()*100+1);
			array[j] = r;
			
			if (j == 0) {
				strBuf.append(array[j]+" ");
			} else {
				if(j%10 == 0) {
					strBuf.append("<br>");
				}
				strBuf.append(array[j]+" ");
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
