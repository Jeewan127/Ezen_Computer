import java.util.Scanner;

public class StatementEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	������ ������ ���ڸ� �ް� 1~ �Է��� ���ڱ��� ȭ�鿣 ����ϴ� ���α׷�
		 */
		
		Scanner num = new Scanner(System.in);
		
		int number;
		System.out.print("���ڸ� �Է��ϼ���: ");
		number = num.nextInt();
		
		for(int i=1; i<=number; i++){
			System.out.print(i + " ");
		}
	}

}
