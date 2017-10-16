import java.util.Scanner;

public class ArrayEx16 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		/*
		 	2차 배열로 맵을 만들고 맵 시작점에서
		 	숫자 방향키를 이용하여 물체를 움지여서 
		 	랜덤한 위치에 생성된 별을 먹으면 맵 끝에
		 	문이 열리고 문에 도착하면 종료
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0; // 움직이는 변수(숫자키로 움직이는 애)
		int c , d;
		int num;
		int boomx, boomy;
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
		
		// map 초기화
		for(int i=0; i<first; i++) {
			for(int k=0; k<second; k++) {
				map[i][k] = 0;
			}
		}
		
		// 폭탄 랜덤 생성
		boomx = (int)(Math.random()*(first-2))+1;
		boomy = (int)(Math.random()*(second-2))+1;
		
		// map에 별 랜덤으로 생성
		int f = (int)(Math.random()*(first-2))+1;
		int s = (int)(Math.random()*(second-2))+1;
		
		// 도착지점 랜덤 생성
		c = (int)(Math.random()*first);
		d = (int)(Math.random()*second);
		
		map [f][s] = 1;
		
		do {
			// 맵 출력
			for(int i=0; i<first; i++) {
				for(int k=0; k<second; k++) {
					if(a == i && b == k) {
						System.out.print("★");
					} else if(map[i][k] == 10) {
						System.out.print("★");
					} else if(boomx == i && boomy == k) {
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
			
			// 메뉴 호출
			System.out.print("left(4) right(6) up(8) down(2) set(7) exit(9) reset(3): ");
			num = sc.nextInt();
			
			if (num == 4) { // left
				if(b==0) {
					System.out.println("벽입니다.");
				} else if(boomx == a && boomy == (b-1)) {
					if(boomx == a && boomy == 0) {
						System.out.println("더 이상 갈 수 없습니다.");
					} else {
						boomy--;
						b--;
					}
					
				} else {
					b--;
				}
			} else if(num == 6) { // right 
				if(b==(second-1)) {
					System.out.println("벽입니다.");
				} else if(boomx == a && boomy == (b+1)) {
					if(boomx == a && boomy == (second-1)) {
						System.out.println("더 이상 갈 수 없습니다.");
					} else {
						boomy++;
						b++;
					}
				} else {
					b++;
				}
			} else if(num == 8) { // up
				if(a==0) {
					System.out.println("벽입니다.");
				} else if(boomx == (a-1) && boomy == b) { 
					if(boomx == 0 && boomy == b) {
						System.out.println("더 이상 갈 수 없습니다.");
					} else {
						boomx--;
						a--;
					}
				} else {
					a--;
				}
			} else if(num == 2) { // down
				if(a==(first-1)) {
					System.out.println("벽입니다.");
				} else if(boomx == (a+1) && boomy == b) {
					if(boomx == (first-1) && boomy == b) {
						System.out.println("더 이상 갈 수 없습니다.");
					} else {
						boomx++;
						a++;
					}
					
				} else {
					a++;
				}
			} else if(num == 9) { // exit
				System.out.println("게임을 종료합니다.");
				run = false;
			} else if(num == 3) {
				System.out.println("초기화");
				
				if(map [f][s] == 0) {
					
					// 다시 초기화
					for(int i=0; i<first; i++) {
						for(int k=0; k<second; k++) {
							map[i][k] = 0;
						}
					}
					
					// 별 생성
					f = (int)(Math.random()*(first-2))+1;
					s = (int)(Math.random()*(second-2))+1;
					
					map [f][s] = 1;
					
					// 폭탄 생성
					boomx = (int)(Math.random()*(first-2))+1;
					boomy = (int)(Math.random()*(second-2))+1;
					
					// 도착지점 랜덤 생성
					c = (int)(Math.random()*first);
					d = (int)(Math.random()*second);
					
					a = 0;
					b = 0;
				} else {
					// 초기화
					for(int i=0; i<first; i++) {
						for(int k=0; k<second; k++) {
							map[i][k] = 0;
						}
					}
				
					// 별 생성
					f = (int)(Math.random()*(first-2))+1;
					s = (int)(Math.random()*(second-2))+1;
					
					map [f][s] = 1;
					
					// 폭탄 생성
					boomx = (int)(Math.random()*(first-2))+1;
					boomy = (int)(Math.random()*(second-2))+1;
					
					// 도착지점 랜덤 생성
					c = (int)(Math.random()*first);
					d = (int)(Math.random()*second);
					
					a = 0;
					b = 0;
				}
			} else if(num == 7) {
				if(map[a][b] == 0) {
					map[a][b] = 10;
				} else {
					map[a][b] = 0;
				}
			}
			
			if(boomx==f && boomy==s) {
				// 도착지점 설정
				map [c][d] = 5;		
				// 별 없애기
				map [f][s] = 0;
				System.out.println("도착지점 문이 열렸습니다.");
			}
			
			if(boomx == c && boomy == d) {
				if(map[f][s] == 1) {
					System.out.println("지뢰를 처리하지 못헀습니다.");
				} else {
				System.out.println("게임 클리어");
				run = false; 
				}
			}
			
		} while(run);	
	}
}
