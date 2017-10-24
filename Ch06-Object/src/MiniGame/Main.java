package MiniGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int number = 0;
		
		TotalTreasure totalTreasure = new TotalTreasure(4, 8, 16);
		
		totalTreasure.printMap(0);
		
		do {
			printMenu();
			int num = sc.nextInt();
			if(num == 0) {
				int dice = (int)(Math.random()*6)+1;
				number = dice + number;
				number = totalTreasure.checkMap(number);
				totalTreasure.printMap(number);
				if(number == 16) {
					System.out.println("���ڸ� ��ҽ��ϴ�.");
					run = false;
				}
				System.out.println("�ֻ���: " + dice);
				System.out.println("����: " + totalTreasure.getTotalScore());
			} if(num == 5) {
				System.out.println("���α׷� ����");
				run = false;
			}
		} while(run);
		
	}

	public static void printMenu() {
		System.out.println("0: �ֻ��� ������\t5: ���α׷� ����");
		System.out.print("�Է�: ");
	}
}
