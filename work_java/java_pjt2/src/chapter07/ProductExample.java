package chapter07;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트 TV");
		
		Tv tv = product1.getKind(); //리턴값이 객체 new Tv()
//		chapter07.Tv@5ca881b5(패키지.클래스@해시코드)
		System.out.println(tv);
		
		String tvModel =  product1.getModel();//스마트TV
		System.out.println(tvModel);
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car()); //T가 car로 다 셋팅됨
		product2.setModel("디젤");
		
		Car car =  product2.getKind();//new Car()
//		chapter07.Car@4517d9a3 (패키지.클래스@해시코드)
		System.out.println(car);//자동차 객체값이나옴
		
		String carModel = product2.getModel();
		System.out.println(carModel);
	}
}
