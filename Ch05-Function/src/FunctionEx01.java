import java.util.Scanner;

import javax.swing.text.StyledEditorKit.StyledTextAction;

import org.omg.CORBA.PUBLIC_MEMBER;

public class FunctionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	��Ģ���� �Լ� 4����
		 	1. ���ϱ� ��� -> ���� 2���� �Ķ���ͷ� �ް� 2���� ���� ���� 2�� ���� ��� ���� ��ȯ
		 	2. ���� ��� -> ���� 2���� �Ķ���ͷ� �ް� ū������ �������� ������
		 	3. ���ϱ� ��� -> ���� 2���� �Ķ���ͷ� �ް� �ܼ� ���ϱ�
		 	4. ������ ��� -> ���������� ���� 0�� ��� 1�� ��ȯ�ϵ���
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° parameter: ");
		int parameter1 = sc.nextInt();
		System.out.print("�ι�° parameter: ");
		int parameter2 = sc.nextInt();
		
		sum(parameter1, parameter2);
		minus(parameter1, parameter2);
		multiply(parameter1, parameter2);
		division(parameter1, parameter2);
		
	}
	
	public static void sum(int sumParameter1, int sumParameter2) {
		int sumresult = sumParameter1 + sumParameter2;
		float sumDivisionresult = (float)sumresult/2;
		
		System.out.println("sum������ ���: " + sumDivisionresult);
	}
	
	public static void minus(int minusParameter1, int minusParameter2) {
		int minusresult;
		if(minusParameter1>minusParameter2) {
			minusresult = minusParameter1 - minusParameter2;
			System.out.println("minus������ ���: " + minusresult);
		} else if(minusParameter2>minusParameter1) {
			minusresult = minusParameter2 - minusParameter1;
			System.out.println("minus������ ���: " + minusresult);
		} else {
			System.out.println("���ڰ� �����Ƿ� 0�Դϴ�.");
		}
	}
	
	public static void multiply(int multiplyParameter1, int multiplyParameter2) {
		int multiplyresult = multiplyParameter1 * multiplyParameter2;
		System.out.println("multiply������ ���: " + multiplyresult);
	}

	public static void division(int divisionParameter1, int divisionParameter2) {
		int divisionresult;
	
		divisionresult = divisionParameter1 / divisionParameter2;
		if(divisionresult == 0) {
			System.out.println("���� 0�̹Ƿ� 1�� ��ȯ");
		} else {
			System.out.println("division������ ���: " + divisionresult);
		}	
	}
}
