import java.util.Scanner;

public class StatementEx20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 ������
		
		Scanner num = new Scanner(System.in);
		
		int number;
		
		System.out.print("�������� �Է��ϼ���: ");
		number = num.nextInt();
		System.out.println(number + "�� �Դϴ�.");
		
		for(int i=1; i<10; i++) {
			System.out.println(number + "X" + i + "= " + (number*i));
		}
	}

}
