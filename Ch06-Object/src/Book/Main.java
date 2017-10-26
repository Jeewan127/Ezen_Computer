package Book;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int maxBookCount=10;
		int bookNumber = 0;
		int number = 0;
		int money = 50000;
		int x = 0;
		Book[] books = new Book[maxBookCount];
		int map [] = new int[maxBookCount];
		
		for(int i=0; i<map.length; i++) {
			map[i] = 0;
		}
		
		do{
			printMenu();
			number = sc.nextInt();
			if(number == 0) {
				sc.nextLine();
				books[bookNumber] = new Book();
				System.out.print("å �̸��� �Է��ϼ���: ");
				books[bookNumber].setName(sc.nextLine());
				System.out.print("å ������ �Է��ϼ���: ");
				books[bookNumber].setPrice(sc.nextInt());
				books[bookNumber].setNumber(bookNumber+1);
				
				bookNumber++;
			} else if(number == 1) {
				do{
					bookNumMenu(books, bookNumber, x, map);
					bookInfoMenu();
					number = sc.nextInt();
					if(number == 0 || number == 1) {
						x = move(x, number, bookNumber);
					} else if(number == 2) {
						bookInfoPrint(books, x);
						System.out.println();
					}
				} while(number != 5);
				
				
//				printBookList(books, bookNumber);
			} else if(number == 2) {
				System.out.print("������ å ��ȣ �Է�: ");
				number = sc.nextInt();
				System.out.println();
				System.out.print("���� �Է�: ");
				int price = sc.nextInt();
				priceChange(books, number, price);
			} else if(number == 3) {
				System.out.print("������ å ��ȣ �Է�: ");
				number = sc.nextInt();
				money = buyBook(books, number, money);
				System.out.println("�ܾ�: " + money);
			}
		} while(number != 5);
		
	}
	
	public static int move(int x, int number, int bookNumber) {
		if(x==0 && number == 0) {
			x=0;
		} else if(number == 0) {
			x--;
		} else if(x==(bookNumber-1) && number == 1) {
			x = (bookNumber-1);
		} else if(number == 1) {
			x++;
		}
		return x;
	}
	
	public static void bookInfoPrint(Book[] books, int x) {
		System.out.println("��ȣ\t�̸�\t����");
		System.out.println(books[x].getNumber() + "\t" + books[x].getName() 
					+ "\t" + books[x].getPrice());
	}
	
	public static void bookInfoMenu() {
		System.out.println("0: ����\t1: ������\t2: ���� ����\t5: ����");
		System.out.print(">>>>>>>>>>>>>>>>");
	}
	
	public static void bookNumMenu(Book[] books, int bookNumber, int x, int map[]) {
		for(int i=0; i<bookNumber; i++) {
			System.out.print(books[i].getNumber()+"\t");
		}
		System.out.println();
		for(int k=0; k<bookNumber; k++) {
			if(x==k) {
				System.out.print("��");
			} else if(map[k] == 0) {
				System.out.print("\t");
			}
		}
		System.out.println();
	}
	
	public static int buyBook(Book[] books, int number, int money) {
		if(money>=books[number-1].getPrice()) {
			money -= books[number-1].getPrice();
		} else {
			System.out.println("�ܾ� ����");
		} return money;
	}
	
	public static void priceChange(Book[] books, int bookNumber, int price) {
		books[bookNumber-1].setPrice(price);
	}

	public static void printBookList(Book[] books, int bookCount) {
		System.out.println("��ȣ\t�̸�\t����");
		for(int i=0; i<bookCount; i++) {
			System.out.println(books[i].getNumber() + "\t" + books[i].getName() 
					+ "\t" + books[i].getPrice());
		} System.out.println();
	}
	
	public static void printMenu() {
		System.out.println("0: å���\t1: å��Ϻ���\t2: å ���� ����\t\t3: å����\t5: ����");
		System.out.print(">>>>>>>>>  ");
	}
}
