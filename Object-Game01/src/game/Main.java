/*
 	주사위를 던져 나온 수만큼 전진
 */

package game;

import java.util.Scanner;

class DiceGame {
	int dice;
	int x=0, y=0, end;
	
	public void firstPrintMap(int firstMap []) {
		for(int i=0; i<firstMap.length; i++) {
			if(x==i) {
				System.out.print("★");
			} else if(firstMap[i] == 0) {
				System.out.print("☆");
			}
		}
	}
	
	public void secondPrintMap(int seocndMap []) {
		for(int i=0; i<seocndMap.length; i++) {
			if(y==i) {
				System.out.print("●");
			} else if(seocndMap[i] == 0) {
				System.out.print("○");
			}
		}
	}
	
	public void getDiceNum() {
		this.dice = (int)(Math.random()*6)+1;
	}
	
	public void firstPlayer() {
		x += this.dice;
	}
	
	public void secondPlayer() {
		y += this.dice;
	}
	
	public boolean endGame(int map[]) {
		if(x > map.length-1) {
			System.out.println("firstPlayer Win!");
			return true;
		} else if(y>map.length-1) {
			System.out.println("secondPlayer Win!");
			return true;
		} else {
			return false;
		}
		
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("맵 크기 입력: ");
		int mapSize = sc.nextInt();
		int number;
		int [] firstMap = new int [mapSize];
		int [] secondMap = new int [mapSize];
		boolean run = true;
		DiceGame game = new DiceGame();
		
		for(int i=0; i<firstMap.length; i++) {
			firstMap[i] = 0;
		}
		
		for(int k=0; k<secondMap.length; k++) {
			secondMap[k] = 0;
		}
		
		do {
			System.out.println("Game Start!");
			for(int i=0; i<2; i++) {
				if(i == 0) {
					System.out.println("firstPlayerMap");
					game.firstPrintMap(firstMap);
					System.out.println();
					System.out.println("secondPlayerMap");
					game.secondPrintMap(secondMap);
					System.out.println();
					System.out.println();
					System.out.println("firstPlayer Turn");
					printMenu();
					number = sc.nextInt();
					if(number == 0) {
						game.getDiceNum();
						game.firstPlayer();
						if(game.endGame(firstMap)) {
							System.out.println("게임 클리어");
							game.firstPrintMap(firstMap);
							System.out.println();
							run = false;
						}
						System.out.println("주사위: " + game.dice);	
					} else if(number == 5) {
						System.out.println("게임을 포기합니다.");
						System.out.println("secondPlayer Win");
						run = false;
						break;
					}
				} else if(i == 1) {
					System.out.println("firstPlayerMap");
					game.firstPrintMap(firstMap);
					System.out.println();
					System.out.println("secondPlayerMap");
					game.secondPrintMap(secondMap);
					System.out.println();
					System.out.println();					
					System.out.println("secondPlayer Turn");
					printMenu();
					number = sc.nextInt();
					if(number == 0) {
						game.getDiceNum();
						game.secondPlayer();
						if(game.endGame(secondMap)) {
							System.out.println("게임 클리어");
							game.secondPrintMap(secondMap);
							System.out.println();
							run = false;
						}
						System.out.println("주사위: " + game.dice);	
					} else if(number == 5) {
						System.out.println("게임을 포기합니다.");
						System.out.println("firstPlayer Win");
						run = false;
					}
					
				}
			}
		} while(run);
		System.out.println("게임 종료");
	}
	
	public static void printMenu() {
		System.out.println("0: 주사위 던지기\t5: 게임 강제종료");
		System.out.print(">>>>>>> ");
	}

}
