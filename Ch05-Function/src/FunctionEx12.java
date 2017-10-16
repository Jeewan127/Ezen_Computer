import java.util.Scanner;

public class FunctionEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	�Լ� ���� ã��
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭 ���� �Է�: ");
		int firstMap = sc.nextInt();
		int secondMap = sc.nextInt();
		
		int map [][];
		int succes [][];
		int boomx, boomy;
		
		boolean run = true;
		
		map = new int [firstMap][secondMap];
		succes = new int [firstMap][secondMap];
		
		// �� �ʱ�ȭ
		for(int i=0; i<map.length; i++) {
			for(int k=0; k<map[i].length; k++) {
				map[i][k] = 0;
			}
		}
		
		boomx = (int)(Math.random()*(firstMap));
		boomy = (int)(Math.random()*(secondMap));
		
		// succes �� �ʱ�ȭ
		for(int i=0; i<succes.length; i++) {
			for(int k=0; k<succes[i].length; k++) {
				succes[i][k] = 2;
			}
		}
		
		// ���� ��ġ ����
		map[boomx][boomy] = 1;
		succes[boomx][boomy] = 1;
		
		System.out.println("���� ��ġ" + boomx + " " +  boomy);
		
		do {
			printMap(map);
			System.out.print("���� �Է�: ");
			int first = sc.nextInt();
			int second = sc.nextInt();
			run = printMap2(map, first, second);
			if(run) {
				map[first][second] = 2;
			}
			if(run){
				run = exit(map, succes);
			}
			
		} while(run); 
		System.out.println("���� Ŭ����");
	}
	
	public static void printMap(int map[][]) {
		for(int i=0; i<map.length; i++) {
			for(int k=0; k<map[i].length; k++) {
				if(map[i][k] == 0 || map[i][k] == 1) {
					System.out.print("#");
				} else if(map[i][k] == 2) {
					System.out.print("O");
				}
			}
			System.out.println();
		}
	}
	
	public static boolean printMap2(int map[][], int first, int second) {
		boolean run = true;
		if(map[first][second] == 2) {
			System.out.println("�̹� ������ ��ġ�Դϴ�.");
			run = true;
		} else if(map[first][second] == 1) {
			for(int i=0; i<map.length; i++) {
				for(int k=0; k<map[i].length; k++) {
					if(map[i][k] == 0) {
						System.out.print("#");
					} else if(map[i][k] == 1) {
						System.out.print("X");
					} else if(map[i][k] == 2) {
						System.out.print("O");
					}
				}
				System.out.println();
			}
			System.out.println("���ڸ� ��ҽ��ϴ�.");
			run = false;
		} else {
			run = true;
		}
		return run;
	}
	
	public static boolean exit(int map[][], int succes [][]) {
		boolean run=true;
		
		for(int i=0; i<map.length; i++) {
			for(int k=0; k<map[i].length; k++) {
				if(map[i][k] ==  succes[i][k]) {
					run = false;
				} else {
					run = true;
					break;
				}
			}
		}
		return run;
	}

}
