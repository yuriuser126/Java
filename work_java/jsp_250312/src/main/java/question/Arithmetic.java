package question;

public class Arithmetic {
	// src 폴더에 question 패키지로 Arithmetic 클래스를 생성
	// 2개의 정수와 연산자를입력받아계산을하는process() 메소드작성
	// 입력받은 숫자와 연산자를이용한getter, sertter 메소드 작성

	// 연산자는+,-,*,/, 네가지 중에 다른 문자가 오면“사칙연산이아닙니다.” 를출력
	// 0으로나누기시“0으로나눌수없습니다.” 를출력

	private int a;
	private String op;
	private int b;

	
	public String process(int i, String op, int j) {
		String result="";
		int res=0;
		
		switch(op)
		{
		case "+": res = i+j ; break;
		case "-": res = i-j ; break;
		case "*": res = i*j ; break;
		case "/": 
		if(j ==0) {
			return result="0으로 나눌 수 없습니다.";
		} res = i/j; break;
		default:
			return result="사칙연산이 아닙니다.";
		}
		result=i+op+j+"의 계산결과는"+res;
		return result;
	}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

		public String getOp() {
			return op;
		}

		public void setOp(String op) {
			this.op = op;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}

		
	}
	



