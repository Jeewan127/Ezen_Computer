import java.util.Scanner;

public class FunctionEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	실수를 파라미터를 받고 이 실수를
		 	소수점 2번째 자리까지만 계산하여 반환하는 함수
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수 입력: ");
		double num = sc.nextDouble();
		
		sosujum(num);
	}

	public static void sosujum(double sosu) {
		int jum;
		double result;
		
		jum = (int) (sosu/0.01);
		result = jum * 0.01;
		System.out.println(result);
	}
}
