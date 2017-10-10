
public class SatementEx22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		중복 for문 구구단
		
		for(int i=2; i<10; i++) {
			System.out.println(i + "단 입니다.");
			for(int k=1; k<10; k++) {
				System.out.println(i + "x" + k + " = " + (i*k));
			}
		}
	}

}
