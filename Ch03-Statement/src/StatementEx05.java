import java.util.Scanner;

public class StatementEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	������
		 	2~9������ ���� �����ϴ� ����
		 	�� ������ ����� �������� ����ϼ���.
		 */
		
		Scanner num = new Scanner(System.in);
		
		int gogodan;
		
		System.out.println("������");
		System.out.print("���ڸ� �Է��ϼ���: ");
		
		gogodan = num.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(gogodan + "x" + i + "=" + gogodan*i);
		}
	}

}
