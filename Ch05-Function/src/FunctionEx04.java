import java.util.Scanner;

public class FunctionEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	�Ǽ��� �Ķ���͸� �ް� �� �Ǽ���
		 	�Ҽ��� 2��° �ڸ������� ����Ͽ� ��ȯ�ϴ� �Լ�
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ǽ� �Է�: ");
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
