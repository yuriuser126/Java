package chapter07;

//T=Tv, M=String
public class Product <T , M>{
	//필드 두개에
	private T kind;//3.new  Tv()
	private M model; //3.model = "스마트 TV"
	
	//T=Tv가 메소드의 리턴타입
 public T getKind() {
	return kind;
}
 //
 //T=Tv가 매개변수의 타입
 //1.Tv kind =new Tv()
 public void setKind(T kind) {
	this.kind = kind;//2.new  Tv()
}
 //M=String이 메소드의 리턴타입
 public M getModel() {
	return model;
}
 //M=String이 매개변수의 리턴타입
 //String model = "스마트 TV"
 public void setModel(M model) {
	 this.model = model;//2.model = "스마트 TV"
 }


}
