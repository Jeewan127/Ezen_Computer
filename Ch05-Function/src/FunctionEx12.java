import java.util.Scanner;

public class FunctionEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	함수 지뢰 찾기
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 길이 입력: ");
		int firstMap = sc.nextInt();
		int secondMap = sc.nextInt();
		
		int map [][];
		int succes [][];
		int boomx, boomy;
		
		boolean run = true;
		
		map = new int [firstMap][secondMap];
		succes = new int [firstMap][secondMap];
		
		// 맵 초기화
		for(int i=0; i<map.length; i++) {
			for(int k=0; k<map[i].length; k++) {
				map[i][k] = 0;
			}
		}
		
		boomx = (int)(Math.random()*(firstMap));
		boomy = (int)(Math.random()*(secondMap));
		
		// succes 맵 초기화
		for(int i=0; i<succes.length; i++) {
			for(int k=0; k<succes[i].length; k++) {
				succes[i][k] = 2;
			}
		}
		
		// 지뢰 위치 설정
		map[boomx][boomy] = 1;
		succes[boomx][boomy] = 1;
		
		System.out.println("지뢰 위치" + boomx + " " +  boomy);
		
		do {
			printMap(map);
			System.out.print("숫자 입력: ");
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
		System.out.println("게임 클리어");
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
			System.out.println("이미 선택한 위치입니다.");
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
			System.out.println("지뢰를 밟았습니다.");
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
