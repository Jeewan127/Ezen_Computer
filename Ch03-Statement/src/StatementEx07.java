import java.util.Scanner;

public class StatementEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	������ �����ϳ��� ����� ���ڸ� �Է��� 1~�� ���ڱ����� ���� ���ϴ� ���α׷�
		*/
		
		Scanner num = new Scanner(System.in);
		
		int number, sum=0;
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		number = num.nextInt();
		
		for(int i=0; i<=number; i++) {
			sum = sum+i;
		}
		System.out.println("����? " + sum);
	}

}
