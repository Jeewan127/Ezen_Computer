import java.util.Scanner;

public class StatementEx10 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/*
		 	Ű����κ��� �Էµ� �����ͷ� ����(1), ���(2), ��ȸ(3), ����(4) �����
		 	�����ϴ� �ڵ� �ۼ�(while���)
		*/
		
		Scanner num = new Scanner(System.in);
		
		boolean run = true;
		int sum=0;
		int keyCode = 0;
		int number;
		
		while (run) {
			if (keyCode!=13 && keyCode!=10) {
				System.out.println("---------------------------");
				System.out.println("1.���� / 2.��� / 3.��ȸ / 4.����");
				System.out.println("---------------------------");
				System.out.print("����>");
			}
			
			keyCode = System.in.read();
			
				if(keyCode == 49) {
					System.out.print("���ݾ�>");
					number = num.nextInt();
					sum = sum + number;
				} else if (keyCode == 50) {
					System.out.print("��ݾ�>");
					number = num.nextInt();
					if(sum<number) {
						System.out.println("�ܰ� �����մϴ�.");
					}
					sum = sum - number;
				} else if (keyCode == 51) {
						System.out.println("�ܰ�>" + sum); 
				} else if (keyCode == 52) {
					run = false;
				}
			}
			System.out.println("���α׷� ����");
		}
	}