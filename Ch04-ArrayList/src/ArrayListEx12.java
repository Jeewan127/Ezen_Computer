import java.util.Scanner;

public class ArrayListEx12 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		/*
		 	2차 배열로 맵을 만들고 맵 시작점에서
		 	숫자 방향키를 이용하여 물체를 움지여서 
		 	랜덤한 위치에 생성된 별을 먹으면 맵 끝에
		 	문이 열리고 문에 도착하면 종료
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0; // 움직이는 변수
		int num;
		int [][] map;
		int [][] move;
		
		boolean run = true;
		
		System.out.print("맵 크기 입력: ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		map = new int [first][second];
		move = new int [first][second];
		
		// map 초기화
		for(int i=0; i<first; i++) {
			for(int k=0; k<second; k++) {
				map[i][k] = 0;
			}
		}
		
		// map에 별 랜덤으로 생성
		int f = (int)(Math.random()*first);
		int s = (int)(Math.random()*second);
		map [f][s] = 1;
		
		do {
			
			for(int i=0; i<first; i++) {
				for(int k=0; k<second; k++) {
					if(a == i && b == k) {
						System.out.print("●");
					}
					else if(map[i][k] == 0) {
						System.out.print("▥");
					} else if(map[i][k] == 1) {
						System.out.print("★");
					} else if(map[i][k] == 5) {
						System.out.print("♬");
					}
				}
				System.out.println();
			}
			
			System.out.print("left(4) right(6) up(8) down(2) exit(9): ");
			num = sc.nextInt();
			
			if (num == 4) { // left
				if(b==0) {
					b = (second-1);
				} else {
					b--;
				}
			} else if(num == 6) { // right 
				if(b==(second-1)) {
					b = 0;
				} else {
					b++;
				}
			} else if(num == 8) { // up
				if(a==0) {
					a = (first-1);
				} else {
					a--;
				}
			} else if(num == 2) { // down
				if(a==(first-1)) {
					a = 0;
				} else {
					a++;
				}
			} else if(num == 9) { // exit
				System.out.println("게임을 종료합니다.");
				run = false;
			}
			
			if(a==f && b==s) {
				// 도착지점 설정
				map [first-1][second-1] = 5;		
				// 별 없애기
				map [f][s] = 0;
				System.out.println("도착지점 문이 열렸습니다.");
			}
			
			if(a==(first-1) && b==(second-1)) {
				if(map[f][s] == 1) {
					System.out.println("별을 먹지 못했습니다.");
				} else {
				System.out.println("게임 클리어");
				run = false; 
				}
			}
			
		} while(run);	
	}
}
