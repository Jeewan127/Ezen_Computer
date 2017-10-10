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
		
		int key =0;
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
		
		// 도착지점 설정
		map [first][second] = 5;
		
		do {
			for(int i=0; i<first; i++) {
				for(int k=0; k<second; k++) {
					if(map[i][k] == 0 || map[i][k] == 5) {
						System.out.print("□");
					} else if(map[i][k] == 1) {
						System.out.print("★");
					}
				}
				System.out.println();
			}
			
			System.out.print("left(4) right(6) up(8) down(2) exut(9): ");
			num = sc.nextInt();
			
			if (num == 4) { // left
				
			} else if(num == 6) { // right 
				
			} else if(num == 2) { // up
				
			} else if(num == 8) { // down
				
			} else if(num == 9) { // exit
				run = false;
			}
			
		} while(run && num != 9);
		
	}

}
