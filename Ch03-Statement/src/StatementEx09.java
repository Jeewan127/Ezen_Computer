import java.util.Scanner;

public class StatementEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	������ �Է¹޾� 1~�� ���ڱ����� �����߿��� 3�� ����� ������ ���ϱ�
		 */
		
		Scanner num = new Scanner(System.in);
		
		int number, sum=0;
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		number = num.nextInt();
		
		for(int i=0; i<number; i=i+3) {
			sum = sum + i;
		}
		System.out.println("����: " + sum);
	}

}
