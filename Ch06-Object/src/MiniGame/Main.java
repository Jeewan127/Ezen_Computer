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
					System.out.println("지뢰를 밟았습니다.");
					run = false;
				}
				System.out.println("주사위: " + dice);
				System.out.println("점수: " + totalTreasure.getTotalScore());
			} if(num == 5) {
				System.out.println("프로그램 종료");
				run = false;
			}
		} while(run);
		
	}

	public static void printMenu() {
		System.out.println("0: 주사위 던지기\t5: 프로그램 종료");
		System.out.print("입력: ");
	}
}
