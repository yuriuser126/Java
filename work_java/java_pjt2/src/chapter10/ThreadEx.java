package chapter10;


class ThreadEx1 extends Thread{
	@Override
	//랜덤하게 돌아갈거에요 가끔 일정하게 돌아가기도함.
	public void run() {//스레드구현-동기식이 아니라 비동기식 for문 무한반복 상속스타일
		for (int i = 0; i <5; i++) {
			System.out.println("i : "+i);
		}
		
	}
}

class ThreadEx2 implements Runnable{//임플리먼트식으로 for문 무한반복
	@Override
	public void run() {
		for (int j = 10; j < 15; j++) {
			System.out.println("j : "+j);
			
		}
		
	}
	
}
public class ThreadEx {
	public static void main(String[] args) {
//		스레드 객체생성
		ThreadEx1 t1=new ThreadEx1();//객체생성
//		1번방식
//		ThreadEx2 t2= new Thread(new ThreadEx2());
//		2번방식
		Runnable r = new ThreadEx2();
		Thread  t2=new Thread (r);
		t1.start();
		t2.start();
	}
}
