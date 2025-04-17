package question04;


public class CoronaSum {
	public static void main(String[] args) {
		
		
//		int n [][] = {{11,12,13}
//							,{21,22,23}
//							,{31,32,33}
//							,{41,42,43}
//							,{51,52,53}
//							,{51,52,53}
//							,{61,62,63}
//							,{71,72,73}
//							,{81,82,83}
//							,{91,92,93}
//							,{101,102,103}
//							,{111,112,113}
//							,{121,122,123}};
		
		int n[][] = new int[12][3];
		int sum=0;
		//행 기준(1~12월), corona.length = n.length : 12이다.
		//i : month -> city-> j
		//열 기준(3개의 도시),corona[month].length : 3 , i[j] : 3이다.
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				//최종반복 : 행*열 = 12*3 = 36(11~123 반복)
				n[i][j]=(i+1)*10+(j+1);
				sum+=  n[i][j];
			}
		}
		
	System.out.println("1년 코로나 환자수는"+sum);}
}
	
