import java.util.Scanner;

public class FunctionEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int cash = 0;
		int num;
//		print(cash);
		
		while(run) {
			print(cash);
			int number = sc.nextInt();
			
			switch (number) {
			case 0:
				cash = cash + 100;
				break;
			case 1:
				num = 500;
				cash = operator(cash, num);
				break;
			case 2:
				num = 600;
				cash = operator(cash, num);
				break;
			case 3:
				num = 400;
				cash = operator(cash, num);
				break;
			case 4:
				num = 300;
				cash = operator(cash, num);
				break;
			case 5:
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				run = false;
				break;
			default:
				break;
			}
		}
	}
	
	public static int operator(int cash, int num) {
		if(cash > num) {
			cash = cash - num;
		} else {
			System.out.println("�ܾ� ����");
		}
		return cash;
	}

	public static void print(int sum) {
		System.out.println("1. ȯŸ, 2. �ݶ�, 3. ���̴�, 4. ��");
		System.out.println("   500��    600��    400��      300��");
		System.out.println("   �ܾ�: " + sum);
		System.out.println();
		System.out.print("0: 100�� �ֱ�, 1~4 ���� ����, 5 ���α׷� ����: ");
	}
}
