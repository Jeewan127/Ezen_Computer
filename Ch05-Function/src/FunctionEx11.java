import java.util.Scanner;

public class FunctionEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	����ڿ��� 3���� �Է��� �޴´�
		 	ù��°�� ����, �ι�°�� ��Ģ����, ����°�� ����
		 */
		Scanner sc = new Scanner(System.in);
		Scanner a = new Scanner(System.in);
		
		
		System.out.print("ù ��° ���� �Է�: ");
		int num1 = sc.nextInt();
	
		System.out.print("�� ��° ���� �Է�: ");
		int num2 = sc.nextInt();
		
		System.out.print("������ �Է�: ");
		String operator = a.nextLine();
		
		int result = operation(num1, num2, operator);
		
		System.out.println("�����: " + result + "�Դϴ�.");
		
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
