package Test;

import java.util.Scanner;

class BookInfo {
	String name;
	int price, number, num, money=0;
	
	// Ŭ���� ������
	public BookInfo(int tmpNum, String tmpName, int tmpPrice, int tmpNumber) {
		num = tmpNum;
		name = tmpName;
		price = tmpPrice;
		number = tmpNumber;
	}
	
	// ���� ���� 
	public void bookGet() { 
		if(number > 0) {
			this.number --;
		} else {
			System.out.println("���� �Ұ�");
		}
	}
	
	// ���� �������
	public void printBookInfo() {
		System.out.println(this.num + "\t" + this.name + "\t" + this.price + "\t" + this.number);
	}
	
	public void getMoney(int getMoney) {
		this.money = this.money + getMoney;
	}
	
	public void spendMoney() {
		if(this.money > this.price) {
			this.money = this.money - this.price;
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}

}

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BookInfo book1 = new BookInfo(1, "Do it android", 20000, 5);
		BookInfo book2 = new BookInfo(2, "Hello Java", 30000, 3);
		BookInfo book3 = new BookInfo(3, "Jsp������Ʈ", 15000, 1);
		
		boolean run = true;
		
		do {
			printMenu();
			int num = sc.nextInt(); 
			if(num == 0) {
				System.out.println("��ȣ\t�̸�\t\t�ݾ�\t����");
				book1.printBookInfo();
				book2.printBookInfo();
				book3.printBookInfo();
			} else if(num == 1) {
				System.out.println("������ å�ǹ�ȣ�� �Է��ϼ��� ");
				System.out.println("��ȣ\t�̸�\t\t�ݾ�\t����");
				book1.printBookInfo();
				book2.printBookInfo();
				book3.printBookInfo();
				System.out.print(">>>>>>>>>> ");
				int getnum = sc.nextInt();
				if(getnum == 1) {
					book1.bookGet();
					book1.spendMoney();
					System.out.println("�ܾ�: " + book1.money);
				} else if(getnum == 2) {
					book2.bookGet();
					book2.spendMoney();
					System.out.println("�ܾ�: " + book2.money);
				} else if(getnum == 3) {
					book3.bookGet();
					book3.spendMoney();
					System.out.println("�ܾ�: " + book3.money);
				}
				
			} else if(num == 2) {
				System.out.print("�Ա��� �ݾ� �Է�: ");
				int money = sc.nextInt();
				book1.getMoney(money);
				book2.getMoney(money);
				book3.getMoney(money);
				System.out.println("�ܾ�: " + book1.money);
			} else if(num == 5) {
				System.out.println("���α׷� ����");
				run = false;
			}
		} while(run);
			
	}
	public static void printMenu() {
		System.out.println("------------------------------------------------------------------------");
		System.out.println("0: ���� ������� ����\t1: ��������\t2: �� �Ա�\t5: ���α׷� ����");
		System.out.println("------------------------------------------------------------------------");
		System.out.print("�Է�: ");
	}
	
}
