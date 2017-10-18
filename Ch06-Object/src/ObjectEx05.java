import java.util.Scanner;

/*	@000000000
 	1:���� 2:������ 5:���α׷� ����
 */
class MoveMap {
	int x=0; // �ڽ��� ��ġ
	
	public void printMap(int map []) {
		for(int i=0; i<map.length; i++) {
			if(x==i) {
				System.out.print("@");
			} else if(map[i] == 0) {
				System.out.print("O");
			}
		}
	}
	
	public void leftMove() {
		x--;
	}
	
	public void rightMove() {
		x++;
	}
	
	public boolean isAvailable(int maxSize, int num) {
		if(x==0 && num == 1) {
			return true;
		}  else if(x==(maxSize-1) && num == 2) {
			return true;
		} else {
			return false;
		}
	}
}

public class ObjectEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ũ�� �Է�: ");
		int mapSize = sc.nextInt();
		int map [] = new int [mapSize];
		boolean run = true;
		
		MoveMap movemap = new MoveMap();
		
		for(int i=0; i<map.length; i++) {
			map[i] = 0;
		}
		
		do {
			movemap.printMap(map);
			printMenu();
			System.out.print(">>>>>>>>>>>>>>> ");
			int num = sc.nextInt();
			System.out.println();
			if(num == 1) {
				if(movemap.isAvailable(mapSize, num)) {
					System.out.println("���Դϴ�.");
				} else {
					movemap.leftMove();
					System.out.println("�������� �̵�");
				}
			} else if(num == 2) {
				if(movemap.isAvailable(mapSize, num)) {
					System.out.println("���Դϴ�.");
				} else {
					movemap.rightMove();
					System.out.println("���������� �̵�");
				}
			} else if(num == 5) {
				System.out.println("����");
				run = false;
			}
		} while(run);	
	}
	
	public static void printMenu() {
		System.out.println("----------------------------");
		System.out.println("1: ����\t2: ������\t 5:����");
		System.out.println("----------------------------");
	}
}
