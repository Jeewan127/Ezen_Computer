import java.util.Scanner;

public class StatementEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	random�Լ��� �̿��Ͽ� 1~6������ ���� ������ �����ϰ� 
		 	switch���� �̿��Ͽ� �� ���� ���� ��¹��� �ۼ��ϼ���.
		 */
		
		Scanner num = new Scanner(System.in);
		
		int number;
		

		number = (int)((Math.random()*10)%6+1);
		
		switch (number) {
		case 1:
			System.out.println("1�Դϴ�.");
			break;
		case 2:
			System.out.println("2�Դϴ�.");
			break;
		case 3:
			System.out.println("3�Դϴ�.");
			break;
		case 4:
			System.out.println("4�Դϴ�.");
			break;
		case 5:
			System.out.println("5�Դϴ�.");
			break;
		case 6:
			System.out.println("6�Դϴ�.");
			break;
		default:
			break;
		}
	}

}
