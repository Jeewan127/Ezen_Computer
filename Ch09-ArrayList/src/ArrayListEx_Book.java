import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx_Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> books = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int number = 1;
		
		String str1 = "";
		String str2 = "";
		
		do {
			printMenu();
			num = sc.nextInt();
			
			if(num==0) {
				sc.nextLine();
				System.out.print("å �̸�: ");
				str1 = sc.nextLine();
				System.out.print("����: ");
				num = sc.nextInt();
				sc.nextLine();
				System.out.print("���ǻ� �̸�: ");
				str2 = sc.nextLine();
				
				Book book = new Book(number, str1, num, str2);
				books.add(book);
				number ++;
			} else if(num == 1) {
				System.out.println("��ȣ\t�̸�\t����\t���ǻ�");
				for(int i=0; i<books.size(); i++) {
					books.get(i).printInfo();
				}
			} else if(num == 2) {
				System.out.println("������ ��ȣ: ");
				num = sc.nextInt();
				books.remove(num-1);
			} else if(num == 3) {
				sc.nextLine();
				System.out.println("�̸����� å �˻�");
				System.out.print("�̸��Է�: ");
				str1 = sc.nextLine();
				for(Book a : books) {
					if(a.getName().contains(str1)) {
						a.printInfo();
					}
				}
				
			} else if(num == 4) {
				books.clear();
			} else if(num == 5) {
				System.out.println("����");
			}
		} while(num != 5);
		
	}
	public static void printMenu() {
		System.out.println("0: å��� 1: ��Ϻ��� 2: å���� 3: å �˻� 4: ��ü���� 5: ����");
		System.out.print("�Է�: ");
	}
	
	
}
