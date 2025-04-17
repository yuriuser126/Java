package chapter10;

public class TimerThread extends Thread {
	int n=0;
	@Override //어노테이션 시스템 주석
	public void run() {//run 메소드
		while (true) {//무한루프
			System.out.println(n);
			n++;
			try {
				sleep(1000); // 예외처리 하지않으면 오류
			} catch (InterruptedException e) { //e가 변수로 받음
//				예외 발생할때 e 로 catch 해서
				e.printStackTrace(); //예외가 발생했을때 기본메세지 출력하겠다.
				//printStackTrace 메소드로 예외처리기본 메세지를 출력
			}//파라미터 밀리세컨드/1초마다실행
		}
	}
	

}
