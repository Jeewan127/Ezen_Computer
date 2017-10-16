import java.util.Scanner;

public class FunctionEx08 {
	int a = 0, b = 0; // 움직이는 변수(숫자키로 움직이는 애)
	int num;
	int [][] map;
	int [][] move;
	int [][] boom;
	int menu;
	boolean run=true;
	
	int first, second;
	
	int firstBoom;
	int secondBoom;
	
	int firstArrival;
	int secondArrival;
	
	int firstStar;
	int secondStar;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionEx08 x = new FunctionEx08();
		
		x.set();
		x.randomMap();
		
		do { 
			x.printMap();
			x.menu = x.printMenu();
			x.activity();
			x.dooropen();
			x.reset();
//			x.run = x.gameover();
	} while(x.run);
}
	public void set() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("맵 크기 입력: ");
		first = sc.nextInt();
		second = sc.nextInt();
		map = new int[first][second];
		for(int i=0; i<first; i++) {
			for(int k=0; k<second; k++) {
				map[i][k] = 0;
			}
		}
	}
	
	public void randomMap() {
		firstBoom = (int)(Math.random()*(first-2))+1;
		secondBoom = (int)(Math.random()*(second-2))+1;
		
		firstArrival = (int)(Math.random()*first);
		secondArrival = (int)(Math.random()*second);
		
		firstStar = (int)(Math.random()*(first-2))+1;
		secondStar = (int)(Math.random()*(second-2))+1;
		
		map [firstStar][secondStar] = 1;
		
		return;
	}
	
	public void printMap() {
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
		
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("left(4) right(6) up(8) down(2) set(7) exit(9) reset(3): ");
		int checkMenu = sc.nextInt();
		
		return checkMenu;
	}
	
	public void activity() {
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
		} else if(menu == 9) {
			System.out.println("게임을 종료합니다.");
			run = false;
		}
	}
	
	public void reset() {
		if(menu == 3) {
			System.out.println("게임이 리셋되었습니다.");
			
			return;
		}
	}

	/*public boolean gameover() {
//		boolean result = false;
		if(menu == 9) { // exit
			System.out.println("게임을 종료합니다.");
			return false;
		} else if(firstBoom == firstArrival && secondBoom == secondArrival) {
			if(map[firstStar][secondStar] == 1) {
				System.out.println("지뢰를 처리하지 못했습니다.");
				return true; 
			} else {
				System.out.println("게임 클리어");
			}
		}
		return false;
	}*/
	
	public void dooropen() {
		if(firstBoom == firstStar && firstBoom == firstStar) {
			map[firstArrival][secondArrival] = 5;
			map[firstStar][secondStar] = 0;
			System.out.println("도착지점 문이 열렸습니다.");
		}
	}
}
