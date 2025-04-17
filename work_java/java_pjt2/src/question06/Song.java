package question06;

public class Song{ //필드 작성
	String title;
	String artist;
	int year;
	String contry;
	public Song() {} // 기본 생성자 
	
	public Song(int year,String contry, String artist,String title) {//단축키 사용
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.contry = contry;
	
}

public void show() {
//	System.out.println(year+"년 "+contry+"국적의 "+artist+"가 부른 "+title);
	System.out.print(year+"년  ");
	System.out.print(contry+"국적의 ");
	System.out.print(artist+"가 부른 ");
	System.out.print(title);
}


	public static void main(String[] args) {
		Song mySong = new Song(1978,"스웨덴","ABBA","Dancing Queen");
		mySong.show();
	}
}







	
