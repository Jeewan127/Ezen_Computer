import java.util.Scanner;

public class FunctionEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	<���θ�>
		 	1. ī�װ�
		 	- ���� 300��, ���� 400��, ���� 500��
		 	����ڰ� ī�װ� ����
		 	2. ����
		 	- ���� 50��, �Ķ� 100��, �ʷ� 150��
		 	
		 	0: 100���� �ܾ� �ö�
		 	1~3: ī�װ� ���� -> 1~3 ���� ����
		 	�ܾ��� �����ϸ� '�ܾ� ����'
		 	�ܾ��� ����ϸ� ��ǰ �ݾ׸�ŭ ����
		 	���������� ������ ��ǰ ������ ���;� ��( ex) ���� - ���� )
		 */
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int cash = 0;
		int num;
		
		do {
			categoryPrint(cash);
			int number = sc.nextInt();
			
			if(number == 0) {
				cash = cash + 100;
			} else if(number == 1) {
				System.out.println("������ �����ϼ̽��ϴ�.");
				num = 300;
				cash = category(cash, num);
			} else if(number == 2) {
				System.out.println("������ �����ϼ̽��ϴ�.");
				num = 400;
				cash = category(cash, num);
			} else if(number == 3) {
				System.out.println("������ �����ϼ̽��ϴ�.");
				num = 500;
				cash = category(cash, num);
			} else if(number == 4) {
				System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
				System.out.println("�ܾ�: " + cash);
				run = false;
			}
			
			/*if(number != 0) {
				run = false;
				System.out.println("�ܾ�: " + cash);
			}*/
		} while(run);
	}
	public static void categoryPrint(int cash) {
		System.out.println("1. ����, 2. ����, 3. ����");
		System.out.println("   300��    400��    500��");
		System.out.println("   �ܾ�: " + cash);
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.print("0: 100�� �ֱ�, 1~3: �� ����, 4: ���α׷� ����: ");
		
	}
	
	public static int category(int cash, int num) {
		System.out.println("*********�ɼ� ����********");
		System.out.println("1. ����, 2. �Ķ�, 3. �ʷ�");
		System.out.println("   +50��    +100��   +150��");
		System.out.println();
		System.out.print("1~3 ���� ����, 4 ���α׷� ����: ");
		
		Scanner sc = new Scanner(System.in);
		int colornum = sc.nextInt();
		if(colornum == 0) {
			cash = cash + 100;
		} else if(colornum == 1) {
			if(cash > (num+50)) {
				cash = cash - (num + 50);
				if(num == 300) {
					System.out.println("������ ��ǰ: ����-����");
				} else if(num == 400) {
					System.out.println("������ ��ǰ: �Ķ�-����");
				} else if(num == 500) {
					System.out.println("������ ��ǰ: ���-����");
				}
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
			}
		} else if(colornum == 2) {
			if(cash > (num+100)) {
				cash = cash - (num + 100);
				if(num == 300) {
					System.out.println("������ ��ǰ: ����-����");
				} else if(num == 400) {
					System.out.println("������ ��ǰ: �Ķ�-����");
				} else if(num == 500) {
					System.out.println("������ ��ǰ: ���-����");
				}
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
			}
		} else if(colornum == 3) {
			if(cash > (num+150)) {
				cash = cash - (num + 150);
				if(num == 300) {
					System.out.println("������ ��ǰ: ����-����");
				} else if(num == 400) {
					System.out.println("������ ��ǰ: �Ķ�-����");
				} else if(num == 500) {
					System.out.println("������ ��ǰ: ���-����");
				}
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
			}
		}
		return cash;
	}

}