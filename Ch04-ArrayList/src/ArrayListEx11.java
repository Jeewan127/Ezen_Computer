import java.util.Scanner;

public class ArrayListEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	2차 배열 지뢰찾기
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 길이 입력: ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		int [][] map = new int [first][second];
		
		int f, s;
		boolean exit;
		
		// mpa 초기화	
		for(int i=0; i<first; i++) {
			for(int r=0; r<second; r++) {
				map[i][r] = 0;
			}
		}
		
		// 지뢰 설정
		f = (int)(Math.random()*(first));
		s = (int)(Math.random()*(second));
		
		map[f][s] = 1;	// 지뢰인곳에 1을 넣어줌
		
		do {
			for(int i=0; i<first; i++) {
				for(int r=0; r<second; r++) {
					if(map[i][r] == 0 || map[i][r] == 1) {
						System.out.print("#");
					} else if(map[i][r] == 2) {
						System.out.print("O");
					}
				}
				System.out.println();
			}
			
			System.out.print("first 숫자 입력: ");
			int a = sc.nextInt();
			System.out.print("second 숫자 입력: ");
			int b = sc.nextInt();
			
			if(map[a][b] == 2) {
				System.out.println("이미 선택한 위치 입니다.");
			} else if(map[a][b] == 1) {
				for(int i=0; i<first; i++) {
					for(int k=0; k<second; k++) {
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
				break;
			}
			else if(map[a][b] == 0) {
				map[a][b] = 2;
			}
			
			exit = true;
			for(int i=0; i<first; i++) {
				for(int k=0; k<second; k++) {
					if(map[i][k] == 0) {
						exit = false;
						break;
					}
				}
			}
			
			if(exit) {
				for(int i=0; i<first; i++) {
					for(int k=0; k<second; k++) {
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
				System.out.println("게임 클리어!");
				break;
			}
				
		} while(true);
		
	}

}
