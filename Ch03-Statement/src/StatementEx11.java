import java.util.Scanner;

public class StatementEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	������ ���� ���� �Է�
		 	�������� 2�� ����̸� '2�� ����Դϴ�', 3�� ����̸� '3�� ����Դϴ�.',
		 	2�� ����̸鼭 3�� ����̸� '2�� ����̸鼭 3�� ����Դϴ�.'
		 	��� �ƴѰ�� '�Ϲ� ���� �Դϴ�.'
		 	-> if���� ���� �߿�
		 */
		
		Scanner num = new Scanner(System.in);
		
		int number;
		System.out.print("������ �Է��ϼ���: ");
		number = num.nextInt();
		
		if (number%6 == 0) {
			System.out.println("2�� ����̸鼭 3�� ����Դϴ�.");
		} else if (number%3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		} else if (number%2 == 0) {
			System.out.println("2�� ����Դϴ�.");
		} else {
			System.out.println("�Ϲ� ���� �Դϴ�.");
		}
	}

}
