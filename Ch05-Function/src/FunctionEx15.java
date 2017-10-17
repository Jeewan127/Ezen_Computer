import java.util.Scanner;

public class FunctionEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	1: �л� �߰� / 2: �л� ����Ʈ ���� / 5: ���α׷� ����
		 	�л�����: �̸�, ����, ��������
		 	�л��� �߰��� �� �ִ� �ִ� ����: 10
		 	
		 	�л� ����Ʈ
		 	�̸�	����	��������
		 	����	26		100
		 */
		
		Scanner sc = new Scanner(System.in);
		String name [] = new String [10];
		int age [] = new int [10];
		int math [] = new int [10];
		boolean run = true;
			
		for(int i=0; i<age.length; i++) {
			age[i] = 0;
		}
		
		for(int i=0; i<math.length; i++) {
			math[i] = 0;
		}
		
		do {
			printMenu();
			int num = sc.nextInt();
			switch (num) {
			case 1:
				name = studentName(name);
				age = studentAge(age);
				math = studentMath(math);
				break;
			case 2:
				printList(name, age, math);
				break;
			case 5:
				System.out.println("���α׷� ����");
				run = false;
			default:
				break;
			}
		} while(run);
	}
		
	
	public static void printMenu() {
		System.out.println("------------------------------------------");
		System.out.println("1. �л��߰� 2.�л� ����Ʈ 5. ���α׷� ����");
		System.out.println("------------------------------------------");
		System.out.print(">>>>>>>>>>>>>>>");
	}
	
	public static String[] studentName(String name []) {
		Scanner plus = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		for(int i=0; i<name.length; i++) {
			if(name[i] == null) {
			name[i] = plus.nextLine();
			break;
			}
		}
		return name;
	}
	
	public static int[] studentAge(int age []) {
		Scanner plus = new Scanner(System.in);
		
		System.out.print("����: ");
		for(int i=0; i<age.length; i++) {
			if(age[i] == 0) {
			age[i] = plus.nextInt();
			break;
			}
		}
		return age;
	}

	public static int[] studentMath(int math []) {
		Scanner plus = new Scanner(System.in);
		
		System.out.print("��������: ");
		for(int i=0; i<math.length; i++) {
			if(math[i] == 0) {
				math[i] = plus.nextInt();
			break;
			}
		}
		return math;
	}
	
	public static void printList(String name [], int age [], int math []) {
		for(int i=0; i<name.length; i++) {
			if(name[i] != null && age[i] != 0 && math[i] != 0) {
				System.out.println("<�л� ����Ʈ>");
				System.out.println("�̸�\t����\t��������");
				System.out.println(name[i] + "\t" + age[i] + "\t" + math[i]);
			}
		}
	}

}
