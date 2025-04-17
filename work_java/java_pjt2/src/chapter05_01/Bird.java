package chapter05_01;

//생명 1개(객체 생성자 멤버 4개)
//추상클래스에 추상메소드가 없어도됨(객체생성안됨)
abstract public class Bird extends  Animal {
	public int wing=2;
public void walk() {
	System.out.println("walk");
}
public void eat() {
	System.out.println("eat");
}
}
