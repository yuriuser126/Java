package hello;

//jsp에서는 빈으로 객체 생성해서 값 저장 읽기
public class HelloBean {
	
	//자바의 필드가  빈에서 프로퍼티 용어사용
	//필드 = 프로퍼티
	private String name = "홍길동";
	private int age=20;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
