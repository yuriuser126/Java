package chapter10;

//implements 인터페이스 사용
//Runnable 인터페이스 상속받앗 스레드구현
//추상메서드 구현해야함
public class TimerRunnable implements Runnable{
	int n=0;
	@Override
	public void run() {
	
			while (true) {//무한루프
				System.out.println(n);
				n++;
				try {
					//Thread. -> 붙여줘야함 스레드 상속받은거라서!!!
					Thread.sleep(1000); // 예외처리 하지않으면 오류
				} catch (InterruptedException e) { //e가 변수로 받음
//					예외 발생할때 e 로 catch 해서
					e.printStackTrace(); //예외가 발생했을때 기본메세지 출력하겠다.
					//printStackTrace 메소드로 예외처리기본 메세지를 출력
				}//파라미터 밀리세컨드/1초마다실행
			}

		
	}


}
