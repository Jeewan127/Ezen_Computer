import java.util.Scanner;

public class StatementEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	������ �����ϳ��� ����� ���ڸ� �Է��� 1~�� ���� ������ ������ ¦����
		 	ȭ�鿡 ����ϴ� ���α׷�
		*/
		
		Scanner num = new Scanner(System.in);
		
		int number;
		System.out.print("���ڸ� �Է��ϼ���: ");
		number = num.nextInt();
		
		for(int i=1; i<=number; i++) {
			if (i%2==0) {
				System.out.print(i + " ");
			} 
		}
	}

}
