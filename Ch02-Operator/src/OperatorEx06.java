import java.util.Scanner;

public class OperatorEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ������ ������ ���� �ִ´�.
		 ���� ���� 0 �Ǵ� 0 �������� ���̸� ����
		 �� �̿��� ���̸� "Ȧ��" or "¦��" ���
		 */
		
		Scanner num = new Scanner(System.in);
		
		int number;
		String res, res2;
		boolean c;
		
		System.out.println("���ڸ� �Է��ϼ���: ");
		number = num.nextInt();
		
/*		c = (number > 0);
		number %= 2;
		res = (number == 0) ? "¦��" : "Ȧ��";
		res2 = (c == true) ? res : "����";   
		System.out.println(res2);*/
		
//		res = (number > 0) ? ((number %2 == 0) ? "¦��" : "Ȧ��") : "����";
//		System.out.println(res);
		
		res2 = ((number % 2)==0) ? "¦��" : "Ȧ��";
		res = (number <= 0) ? "����" : res2;
		System.out.println(res);
	}

}
