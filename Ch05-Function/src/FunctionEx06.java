import java.util.Scanner;

public class FunctionEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	1. �Ʒ��� ���� �Լ��� �����ϼ���
		 	- ������ �Ķ���͸� �ް�
		 	- 1~�Ķ���ͷ� ���� �������� ���� ���ϴ� �Լ��� ����
		 	2. �� �Լ��� ȣ���Ͽ� ��� ���� ����ϴ� ���α׷��� �ۼ� 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
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
