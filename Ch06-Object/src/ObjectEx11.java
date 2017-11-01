import java.util.Scanner;

public class ObjectEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int first;
		int second;
		
		int x=0, y=0;
		
		int num = 0;
		
		System.out.print("맵 크기 입력: ");
		first = sc.nextInt();
		second = sc.nextInt();
		
		int map[][] = new int [first][second];
		
		for(int i=0; i<map.length; i++) {
			for(int k=0; k<map[i].length; k++) {
				map[i][k] = 0;
			}
		}
		
		do {
			map = printMap(map, x, y);
			printMenu();
			num = sc.nextInt();
			
			if(num == 4) {
				y--;
			} else if(num == 6) {
				y++;
			} else if(num == 8) {
				x--;
			} else if(num == 2) {
				x++;
			}
		} while(num != 5);
	}

	public static int [][] printMap(int map[][], int x, int y) {
		for(int i=0; i<map.length; i++) {
			for(int k=0; k<map[i].length; k++) {
				if(i==x && k==y) {
					map[x][y] = 1;
					System.out.print("★");
				} else if(map[i][k] == 1) {
					System.out.print("★");
				} else if(map[i][k] == 0) {
					System.out.print("☆");
				}
			} System.out.println();
		}
		return map;
	}
	
	public static void printMenu() {
		System.out.println("Left(4)  Right(6)  Up(8)  Down(2)  End(5)");
		System.out.print("입력: ");
	}
}
