package question;

public class ThreeSixNine {
	//src 폴더에question 패키지로 ThreeSixNine 클래스를 생성하
	//10~99까지의정수를입력받고
	//정수에3,6,9 중 하나가있는경우는“박수짝” 을출력하고
	//두개있는경우는“박수짝짝” 을출력 process() 메소드 작성
	//입력받은 숫자를 이용한getter, sertter 메소드 작성
	
	//입력된수가13인경우“박수짝”을, 36인경우“박수짝짝”을출력하면된다
	//입력된수가25인경우“박수없음”을출력하면된다
	
	private int num;
	
	

	
	public int getNum() {
		return num;
	}




	public void setNum(int num) {
		this.num = num;
	}




	public String process(int num) {
		
		String result="";
		int count = 0;
		//카운트 추가
		int ten= num/10;
		int one= num%10;
		
		if (ten%3 ==0 ) {
			count++;
		}
		if (one%3 ==0 && one!=0 ) {
			count++;
		}
		if (count == 2 ) {
			result = "박수짝짝";
		}else if(count == 1 ){
			//else if 추가
			result = "박수짝";
		}else {
			result = "박수 없음";
		}
			
		return result;
		
	}
	
//	public int getA() {
//		return num;
//	}
//	
//	public void setA(int num) {
//		this.num = num;
//	}
	
	
}
