import java.util.Scanner;

public class OperatorEx04 {

	public static void main(String[] args) {
		/*
		 ���ڸ� �Է¹޾� 100~300���̸� false�� , �������� true ���
		 */
		
		Scanner num = new Scanner(System.in);
		
		int number, i;

		while(true) {
		System.out.print("���ڸ� �Է��ϼ���: ");
		number = num.nextInt();
		
		System.out.println((number<=100) || (number>=300));
		
		if(number == 0)
			break;
		}
	}
}
