import java.util.Scanner;

public class ArrayListEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	2차 배열 빙고, 빙고 크기는 입력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("빙고크기를 입력하세요: ");
		
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		int map[][];
		int check[][];
		
		map = new int [first][second];
//		num = new int [first][second];
		check = new int [first][second];
		
		boolean run = true;
		
		// map을 0으로 초기화
		for(int i=0; i<map.length; i++) {
			for(int k=0; k<map[i].length; k++) {
				map[i][k] = 0;
			}
		}
		
		// 빙고판에 랜덤한 숫자 입력
		while(run) {
			int num = (int)(Math.random()*(first*second)+1);
			
			for(int i=0; i<map.length; i++) {
				for(int k=0; k<map[i].length; k++) {
					if(map[i][k] == 0 && map[i][k]  ) {
						map[i][k] = num;
					}
				}
			}
		}
		
		
		do {
			for(int i=0; i<map.length; i++) {
				for(int r=0; r<map[i].length; r++) {
					if(map[i][r] == 0) {
						System.out.print(num[i][r] + "  ");
					} 
				}
				System.out.println();
			}
			
			System.out.print("숫자를 입력하세요: ");
			int number = sc.nextInt();
			
			
		} while(run);
	}
}
