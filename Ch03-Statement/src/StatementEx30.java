import java.util.Scanner;

public class StatementEx30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	����ڿ��� �����ϳ��� �Է¹ް� ���ڸ�ŭ *�� ���
		 */
		
		Scanner num = new Scanner(System.in);
		String numb;
		int number;
		int sum = 0;
		
		System.out.print("���ڸ� �Է��ϼ���. ");
		numb = num.nextLine();
		number = Integer.parseInt(numb);
		
		for(int i=1; i<number+1; i++) {
			sum += i;
		} System.out.println("����: " + sum);
	}

}
