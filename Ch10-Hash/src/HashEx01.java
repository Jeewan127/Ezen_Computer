import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Ex_Student> students = new HashMap<>();
		
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
				System.out.print("�̸�: ");
				str1 = sc.nextLine();
				System.out.print("����ȣ: ");
				str2 = sc.nextLine();
				
				Ex_Student student = new Ex_Student(str1, str2);
				students.put(number, student);
				number ++;
			} else if(num == 1) {
				System.out.println("��ȣ\t�̸�\t����ȣ");
				Iterator<Integer> keys = students.keySet().iterator();
				while(keys.hasNext()) {
					Integer key = keys.next();
					System.out.print(key + "\t");
					students.get(key).printInfo();
				}
			} else if(num == 2) {
				System.out.println("������ ��ȣ: ");
				num = sc.nextInt();
				students.remove(num-1);
			} else if(num == 3) {
				sc.nextLine();
				System.out.print("��ȣ �Է�: ");
				str1 = sc.nextLine();
				System.out.println("��ȣ\t�̸�\t����ȣ");
				
				Iterator<Integer> keys = students.keySet().iterator();
				while(keys.hasNext()) {
					Integer key = keys.next();
					if (students.get(key).getName().contains(str1)) {
						students.get(key).printInfo();
					}
				}
			} else if(num == 4) {
				students.clear();
			} else if(num == 5) {
				System.out.println("����");
			}
		} while(num != 5);
	}
	public static void printMenu() {
		System.out.println("0: ��� 1: ���� 2: ���û��� 3: �˻� 4: ��ü���� 5: ����");
		System.out.print("�Է�: ");
	}
}
