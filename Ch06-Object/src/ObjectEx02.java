import java.util.Scanner;

/*
 	��Ģ������ �ϴ� ��ü�� �����
 	��Ģ���� ��ü�� ����ϴ� ���α׷��� �ۼ�
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
		
		System.out.print("ù ��° ���� �Է�: ");
		op.num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է�: ");
		op.num2 = sc.nextInt();
		
		op.plus(op.num1, op.num2);
		op.minus(op.num1, op.num2);
		op.multiply(op.num1, op.num2);
		op.division(op.num1, op.num2);
		
	}

}
