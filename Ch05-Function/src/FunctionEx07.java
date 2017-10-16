import java.util.Scanner;

public class FunctionEx07 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0; // 움직이는 변수(숫자키로 움직이는 애)
		int num;
		int [][] map;
		int [][] move;
		int [][] boom;
		
		boolean run = true;
		
		System.out.print("맵 크기 입력: ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		map = new int [first][second];
		move = new int [first][second];
		boom = new int [first][second];
		
		// 폭탄 랜덤 생성
		int firstBoom = (int)(Math.random()*(first-2))+1;
		int secondBoom = (int)(Math.random()*(second-2))+1;
		
		// 도착지점 랜덤 생성
		int firstArrival = (int)(Math.random()*first);
		int secondArrival = (int)(Math.random()*second);
		
		// 별 랜덤 생성
		int firstStar = (int)(Math.random()*(first-2))+1;
		int secondStar = (int)(Math.random()*(second-2))+1;
		// map 초기화
		for(int i=0; i<first; i++) {
			for(int k=0; k<second; k++) {
				map[i][k] = 0;
			}
		}
		
		// 별 지점 초기화
		map [firstStar][secondStar] = 1;
		
		do { 
			printMap(map, a, b, firstBoom, secondBoom);
			int menu = printMenu();
			activity(menu, a, b, firstBoom, secondBoom, first, second);
			dooropen(firstBoom, secondBoom, firstStar, secondStar, 
					firstArrival, secondArrival, map);
			reset(menu);
			run = gameover(menu, firstBoom, secondBoom, firstArrival, secondArrival, 
					firstStar, secondStar, map);
		} while(run);
		
	}
	
	public static void printMap(int map[][], int a, int b, int firstBoom, int secondBoom) {
		for(int i=0; i<map.length; i++) {
			for(int k=0; k<map[i].length; k++) {
				if(a == i && b == k) {
					System.out.print("★");
				} else if(map[i][k] == 10) {
					System.out.print("★");
				} else if(firstBoom == i && secondBoom == k) {
					System.out.print("◆");
				} else if(map[i][k] == 0) {
					System.out.print("☆");
				} else if(map[i][k] == 1) {
					System.out.print("※");
				} else if(map[i][k] == 5) {
					System.out.print("♬");
				}
			}
			System.out.println();
		}
	}
		
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("left(4) right(6) up(8) down(2) set(7) exit(9) reset(3): ");
		int menu = sc.nextInt();
		
		return menu;
	}
	
	public static void activity(int menu, int a, int b, int firstBoom, int secondBoom, 
			int first, int second) {
		if(menu == 4) {
			if(b==0) {
				System.out.println("벽입니다.");
			} else if(firstBoom == a && secondBoom == (b-1)) {
				if(firstBoom == a && secondBoom == 0) {
					System.out.println("더 이상 갈 수 없습니다.");
				} else {
					secondBoom--;
					b--;
				}
			} else {
				b--;
			}
			
		} else if(menu == 6) {
			if(b==(second-1)) {
				System.out.println("벽입니다.");
			} else if(firstBoom == a && secondBoom == (b+1)) {
				if(firstBoom == a && secondBoom == (second-1)) {
					System.out.println("더 이상 갈 수 없습니다.");
				} else {
					secondBoom++;
					b++;
				}
			} else {
				b++;
			}
		} else if(menu == 8) { // up
			if(a==0) {
				System.out.println("벽입니다.");
			} else if(firstBoom == (a-1) && secondBoom == b) { 
				if(firstBoom == 0 && secondBoom == b) {
					System.out.println("더 이상 갈 수 없습니다.");
				} else {
					firstBoom--;
					a--;
				}
			} else {
				a--;
			}
		} else if(menu == 2) { // down
			if(a==(first-1)) {
				System.out.println("벽입니다.");
			} else if(firstBoom == (a+1) && secondBoom == b) {
				if(firstBoom == (first-1) && secondBoom == b) {
					System.out.println("더 이상 갈 수 없습니다.");
				} else {
					firstBoom++;
					a++;
				}
				
			} else {
				a++;
			}
		} 
	}
	
	public static void reset(int menu) {
		if(menu == 3) {
			System.out.println("게임이 리셋되었습니다.");
			
			main(null);
			
		}
	}
	
	public static boolean gameover(int menu, int firstBoom, int secondBoom, int firstArrival,

			int secondArrival, int firstStar, int secondStar, int [][]map) {
		boolean result = false;
		if(menu == 9) { // exit
			System.out.println("게임을 종료합니다.");
		} else if(firstBoom == firstArrival && secondBoom == secondArrival) {
			if(map[firstStar][secondStar] == 1) {
				System.out.println("지뢰를 처리하지 못했습니다.");
				return true; 
			} else {
				System.out.println("게임 클리어");
			}
		}
		return result;
	}
	
	public static void dooropen(int firstBoom, int secondBoom, int firstStar, int secondStar,
			int firstArrival, int secondArrival, int [][]map) {
		if(firstBoom == firstStar && firstBoom == firstStar) {
			map[firstArrival][secondArrival] = 5;
			map[firstStar][secondStar] = 0;
			System.out.println("도착지점 문이 열렸습니다.");
		}
	}
}
