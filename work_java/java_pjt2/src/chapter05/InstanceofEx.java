package chapter05;


/*
 * instanceof 연산자 사용(상속)
 */

//ctrl+c -> ctrl+k -> ctrl+v 순으로 해야 넘어감

class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}
public class InstanceofEx {
	//Person p = new Student() ->업캐스팅
	static void print(Person p) {
		if (p instanceof Person) {//p객체가 person클래스 타입인지
			System.out.print("Person ");//참이면 출력
		}
		if (p instanceof Student) {//p객체가 Student클래스 타입인지
			System.out.print("Student ");//참이면 출력
		}
		if (p instanceof Researcher) {//p객체가 Researcher클래스 타입인지
			System.out.print("Researcher ");//참이면 출력
		}
		if (p instanceof Professor) {//p객체가 Professor클래스 타입인지
			System.out.print("Professor ");//참이면 출력
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student()-> \t"); print(new Student());//Person Student 
		System.out.print("new Student()-> \t"); print(new Researcher());//Person Researcher 
		System.out.print("new Student()-> \t"); print(new Professor());//Person Researcher Professor 
	}
}
