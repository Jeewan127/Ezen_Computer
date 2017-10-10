
public class OperatorEx02 {

	public static void main(String[] args) {
		/*
		 ex) 값을 받아와 십의 자리와 일의자리를 없애서 출력하기
	 		 523 -> 500, 1323 -> 1300
	 		 (나머지 연산, 단항 연산자를 이용) 
	 	*/
		
		int a = 1523;
		
		a -= a%100;
		
		System.out.println(a);
	}

}
