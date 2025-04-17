package chapter07;


//get ctrl+space-> 단축키 두번째 , set도 마찬가지
//object : 참조변수
public class Box {
	private Object object;//홍길동,777,애플객체
	
	public Object get() {
		return object;
	}
	//Object object ="홍길동" //upcasting
	//Object object =777 //upcasting
	//Object object =new Apple() //upcasting
	public void set(Object object) {
		this.object = object;
	}
}
