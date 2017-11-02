import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx_ShoppingMall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Shopping> shops = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int number = 1;
		String str = "";
		
		
		
		do{ 
			printMenu();
			num1 = sc.nextInt();
			
			if(num1 == 0) {
				sc.nextLine();
				System.out.print("��ǰ �̸�: ");
				str = sc.nextLine();
				System.out.print("����: ");
				num1 = sc.nextInt();
				System.out.print("����: ");
				num2 = sc.nextInt();
				
				Shopping shop = new Shopping(number, str, num1, num2);
				shops.add(shop);
				number++;
			} else if(num1 == 1) {
				System.out.println("��ȣ\t��ǰ\t����\t����");
				for(int i=0; i<shops.size(); i++) {
					shops.get(i).printInfo();
				}
			} else if(num1 == 2) {
				System.out.print("������ ��ȣ: ");
				num1 = sc.nextInt();
				shops.remove(num1-1);
			} else if(num1 == 3) {
				sc.nextLine();
				System.out.print("�˻��� ��ǰ: ");
				str = sc.nextLine();
				System.out.println("��ȣ\t��ǰ\t����\t����");
				for(Shopping shop : shops) {
					if(shop.getName().contains(str)) {
						shop.printInfo();
					}
				}
			} else if(num1 == 5) {
				System.out.println("����");
			}	
		} while(num1 != 5);
		
		
	}
	public static void printMenu() {
		System.out.println("0: ��� 1: ���� 2: ���� 3: �˻� 5: ����");
		System.out.print("�Է�: ");
	}
}
