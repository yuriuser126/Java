package chapter07;

public class Product2<T2, M2> {
	private T2 kind;
	private M2 model;
	
	public T2 getKind() {
		return kind;
	}
	public void setKind(T2 kind) {
		this.kind = kind;
	}
	public M2 getModel() {
		return model;
	}
	public void setModel(M2 model) {
		this.model = model;
	}
	
	//단축키 alt shift s -> generate getter and setters 누르기
	//alt + a-> alt+r

}
