/*
 �ڵ����� ������ �����ִ� ����Ʈ�� �ִ�.

�ڵ����� ������ ����, ������, �������� �ְ�

�������� ��Ƽ��, ����, Ƽ����
���������� ������, �ҳ�Ÿ, k5
���������� ����ι�, ������ �ִ�

ó�� ȭ�鿡���� ī�װ��� ������ �� �ְ�
ī�װ��� �����ϸ� �ش� �ڵ��� ����� ���´�.
�ش� �ڵ����� �����ϸ�(�����ϴ� ����� �����ڰ� ����)
�ش� �ڵ����� ������ ���´�.

�ڵ����� ������
����Ÿ�
�ִ� �������差
����
�� ��µȴ�.

�ڵ��� ������ �����ָ� '�������� ���⸦ �����ϸ�' �ٽ� ī�װ�
ȭ������ ���ư��� �����Ѵ�.

 */
package Car;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name [] = {"����", "������", "������"};
		int num = 0;
		int num2 = 0;
		int x=1, y=0;
		
		Car car [][] = new Car [6][3];
		
		for(int i=0; i<car.length; i++) {
			for(int k=0; k<car[i].length; k++) {
				car[i][k] = new Car(0);
			}
		}
			
		car[0][0] = new Car("��Ƽ��", 20, 30, 1500);
		car[0][1] = new Car("����  ", 30, 35, 1700);
		car[0][2] = new Car("Ƽ����", 35, 40, 2300);
		
		car[2][0] = new Car("������", 50, 40, 2700);
		car[2][1] = new Car("�ҳ�Ÿ", 80, 45, 3500);
		car[2][2] = new Car("k5 ", 120, 50, 4800);
		
		car[4][0] = new Car("�����", 200, 60, 10000);
		car[4][1] = new Car("����  ", 300, 80, 8000);
		car[4][2] = new Car("Ʈ��  ", 500, 100, 5000);
		
		do {
			printMap(car, x, y);
			printMenu();
			num = sc.nextInt();
			if(num == 4) {
				y--;
			} else if(num == 6) {
				y++;
			} else if(num == 8) {
				x = x-2;
			} else if(num == 2) {
				x = x+2;
			} else if(num == 9) {
				System.out.println("����");
			} else if(num == 5) {
				System.out.println("�̸�\t�Ÿ�\t����\t����");
				car[x-1][y].carInfo();
				System.out.println();
			}
		} while(num != 9);	
	}

	public static void printMap(Car car[][], int x, int y) {
		for(int i=0; i<car.length; i++) {
			for(int k=0; k<car[i].length; k++) {
				if(x == i && y == k) {
					System.out.print("��");
				} else if(car[i][k].getName() == null) {
					System.out.print("\t");
				} else {
					System.out.print(car[i][k].getName() + "\t");
				}
			} System.out.println();
		}
	}
	
	public static void printMenu() {
		System.out.println("<�ڵ��� ����>");
		System.out.println("Left(4)  Right(6)  Up(8)  Down(2)  Choice(5)  End(9)");
		System.out.print("����: ");
	}
}
