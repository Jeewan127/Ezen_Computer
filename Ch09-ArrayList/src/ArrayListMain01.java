import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> items = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		do {
			printMenu();
			num = sc.nextInt();
			
			if(num == 1) {
				System.out.println("������ �Է�: ");
				num = sc.nextInt();
				items.add(num);
			} else if(num == 2) {
				System.out.println("������ ����: ");
				num = sc.nextInt();
				items.remove(num);
			} else if(num == 3) {
				System.out.println("��ü ������ ����");
				for(int i=0; i<items.size(); i++) {
					System.out.println((i+1) + ". " + items.get(i));
				}
			} else if(num == 4) {
				System.out.println("��ü ����");
				items.clear();
			} else if(num == 5) {
				System.out.println("����");
			}
		} while(num != 5);
		
	}

	public static void printMenu() {
		System.out.println("1: ������ �ֱ� 2: ������ ���� 3: ��ü ������ ���� 4: ��ü ���� 5: ����");
		System.out.print("�Է�: ");
	}
}
