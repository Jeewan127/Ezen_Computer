import java.util.Scanner;

public class StatementEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	�����ϳ��� �Է¹޾� �� ���ڰ� Ȧ���̸� 'Ȧ��' ¦���̸� '¦��'�� ���
		*/
		
		Scanner num = new Scanner(System.in);
		
		int number, n;
		
		System.out.print("������ �Է��ϼ���: ");
		number = num.nextInt();
		n = number%2;
		
		if (n==0) {
			System.out.println("¦���Դϴ�.");
		}
		if (n==1) {
			System.out.println("Ȧ���Դϴ�.");
		}
	}
}
