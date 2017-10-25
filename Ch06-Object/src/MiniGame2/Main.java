package MiniGame2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height = 8;
		int width = 8;
		int[][] map = new int[height][width];
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		Character character = new Character(0, 0, 0);
		Goal goal = new Goal(6, 5);
				
		do {
			printMap(map,character,goal);
			printMenu();
			number = scanner.nextInt();
			
			if (number == 4) {
				character.moveLeft();
				character.incMoveCount();
			} else if (number == 6) {
				character.moveRight();
				character.incMoveCount();
			} else if (number == 8) {
				character.moveUp();
				character.incMoveCount();
			} else if (number == 2) {
				character.moveDown();
				character.incMoveCount();
			}
			
			if (character.getX() == goal.getX() && character.getY() == goal.getY()) {
				System.out.println("ÀÌµ¿È½¼ö : " + character.getMoveCount());
				number = 5;
			}
		} while(number != 5);
	}
	
	public static void printMenu() {
		System.out.println("4 : left  6 : right  8 : top  2 : down   5 : exit");
		System.out.print(">>>>>>");
	}
	
	public static void printMap(int[][] map,Character character,Goal goal) {
		for (int i = 0 ; i < map.length ; i++) {
			for (int j = 0 ; j < map[i].length ; j++) {
				if (character.getY() == i && character.getX() == j) {
					System.out.print("¡Ú");
				} else if (goal.getY() == i && goal.getX() == j) { 
					System.out.print("£À");
				} else if (map[i][j] == 0) {
					System.out.print("¡Ù");
				}
			}
			System.out.println();
		}
	}

}
