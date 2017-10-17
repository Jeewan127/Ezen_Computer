import java.util.Scanner;

/*
 	사칙연산을 하는 객체를 만들고
 	사칙연산 객체를 사용하는 프로그램을 작성
 */
class Operation {
	int num1, num2;
	String operator;
	int result;
	
	public void plus(int num1, int num2) {
		System.out.println("plus: " + (num1+num2));
	}
	
	public void minus(int num1, int num2) {
		if(num1>num2) {
			System.out.println("minus: " + (num1-num2));
		} else {
			System.out.println("minus: " + (num2-num1));
		}
	}
	
	public void multiply(int num1, int num2) {
		System.out.println("multiply: " + (num1*num2));
	}
	
	public void division(int num1, int num2) {
		if(num1>num2) {
			System.out.println("division: " + (num1/num2));
		} else {
			System.out.println("division: " + (num2/num1));
		}
	}
}
public class ObjectEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation op = new Operation();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력: ");
		op.num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력: ");
		op.num2 = sc.nextInt();
		
		op.plus(op.num1, op.num2);
		op.minus(op.num1, op.num2);
		op.multiply(op.num1, op.num2);
		op.division(op.num1, op.num2);
		
	}

}
