import java.util.Scanner;

public class FunctionEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	사용자에게 3개의 입력을 받는다
		 	첫번째는 숫자, 두번째는 사칙연산, 세번째는 숫자
		 */
		Scanner sc = new Scanner(System.in);
		Scanner a = new Scanner(System.in);
		
		
		System.out.print("첫 번째 숫자 입력: ");
		int num1 = sc.nextInt();
	
		System.out.print("두 번째 숫자 입력: ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자 입력: ");
		String operator = a.nextLine();
		
		int result = operation(num1, num2, operator);
		
		System.out.println("결과는: " + result + "입니다.");
		
	}
	
	public static int operation(int num1, int num2, String operator) {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(operator);
		
		int result=0;
		if(operator.equals("+")) {
			result = num1 + num2;
		} else if(operator.equals("-")) {
			result = num1 -num2;
		} else if(operator.equals("*")) {
			result = num1*num2;
		} else if(operator.equals("/")) {
			if(num1 > num2) {
				result = num1 / num2;
			} else {
				result = num2 / num1;
			}
		}
		return result;
	}
}
