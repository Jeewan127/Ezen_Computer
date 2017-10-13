import java.util.Scanner;

public class FunctionEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	1. 아래와 같은 함수를 정의하세요
		 	- 정수형 파라미터를 받고
		 	- 1~파라미터로 받은 값까지의 합을 구하는 함수를 정의
		 	2. 그 함수를 호출하여 결과 값을 출력하는 프로그램을 작성 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		int result;
		result = sum(num);
		
		System.out.println(result);
	}
	
	public static int sum(int number) {
		int sum=0;
		
		for(int i=1; i<(number+1); i++) {
			sum = sum + i;
		}
		
		return sum;
	}

}
