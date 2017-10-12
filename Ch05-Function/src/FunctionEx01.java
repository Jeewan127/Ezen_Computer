import java.util.Scanner;

import javax.swing.text.StyledEditorKit.StyledTextAction;

import org.omg.CORBA.PUBLIC_MEMBER;

public class FunctionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	사칙연산 함수 4가지
		 	1. 더하기 기능 -> 숫자 2개를 파라미터로 받고 2개를 더한 다음 2로 나눈 결과 값을 반환
		 	2. 빼기 기능 -> 숫자 2개를 파라미터로 받고 큰수에서 작은수를 빼도록
		 	3. 곱하기 기능 -> 숫자 2개를 파라미터로 받고 단순 곱하기
		 	4. 나누기 기능 -> 나누어지는 수가 0인 경우 1을 반환하도록
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 parameter: ");
		int parameter1 = sc.nextInt();
		System.out.print("두번째 parameter: ");
		int parameter2 = sc.nextInt();
		
		sum(parameter1, parameter2);
		minus(parameter1, parameter2);
		multiply(parameter1, parameter2);
		division(parameter1, parameter2);
		
	}
	
	public static void sum(int sumParameter1, int sumParameter2) {
		int sumresult = sumParameter1 + sumParameter2;
		float sumDivisionresult = (float)sumresult/2;
		
		System.out.println("sum연산의 결과: " + sumDivisionresult);
	}
	
	public static void minus(int minusParameter1, int minusParameter2) {
		int minusresult;
		if(minusParameter1>minusParameter2) {
			minusresult = minusParameter1 - minusParameter2;
			System.out.println("minus연산의 결과: " + minusresult);
		} else if(minusParameter2>minusParameter1) {
			minusresult = minusParameter2 - minusParameter1;
			System.out.println("minus연산의 결과: " + minusresult);
		} else {
			System.out.println("숫자가 같으므로 0입니다.");
		}
	}
	
	public static void multiply(int multiplyParameter1, int multiplyParameter2) {
		int multiplyresult = multiplyParameter1 * multiplyParameter2;
		System.out.println("multiply연산의 결과: " + multiplyresult);
	}

	public static void division(int divisionParameter1, int divisionParameter2) {
		int divisionresult;
	
		divisionresult = divisionParameter1 / divisionParameter2;
		if(divisionresult == 0) {
			System.out.println("몫이 0이므로 1을 반환");
		} else {
			System.out.println("division연산의 결과: " + divisionresult);
		}	
	}
}
