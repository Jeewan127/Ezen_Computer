
public class OperatorEx01 {

	public static void main(String[] args) {
		/*
		 ex) 값을 받아와 십의 자리와 일의자리를 없애서 출력하기
		 523 -> 500, 1323 -> 1300 
		*/
		
		int n = 1253;
		int a = (n/100) * 100;
		
		System.out.println("a의 값은: " + a + "입니다.");
	}

}
