

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] map;
		map = new int[3];
		int number = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		//맵 초기화 
		for (int i = 0 ; i < map.length ; i++) {
			map[i] = 0;
		}
		
		//지뢰 생성		
		map[(int) (Math.random()*map.length)] = 1;
		
		do {
			//맵 출력 
			for (int i = 0 ; i < map.length ; i++) {
				if (map[i] == 0 || map[i] == 1) {
					System.out.print("#");
				} else if (map[i] == 2) {
					System.out.print("O");
				}
			}
			//사용자에게 체크할 맵의 인덱스를 입력 받음
			System.out.println();
			System.out.print("값을 입력하세요 : ");
			number = scanner.nextInt();
						
			//이미 한번 체크한 셀인지 체크
			if (map[number] == 2) {
				System.out.println("이미 선택한 위치 입니다.");
			} else if (map[number] == 1) /* 지뢰밟음 */{
				for (int i = 0 ; i < map.length ; i++) {
					if (map[i] == 0) {
						System.out.print("#");
					} else if (map[i] == 1) {
						System.out.print("X");
					} else if (map[i] == 2) {					
						System.out.print("O");
					}
				}
				System.out.println();
				System.out.println("지뢰를 밟았습니다.");
				break;
			} else if (map[number] == 0) /* 한번도 체크하지 않은 셀이라면 */ {
				map[number] = 2;
			}			

			//게임을 클리어 했는지 체크
			//맵을 체크하여 한번도 검사하지 않은 셀이 남아 있으면
			//아직 게임을 클리어 하지 못했다고 생각함
			boolean clear = true;
			for (int i = 0 ; i < map.length ; i++) {
				if (map[i] == 0) {
					clear = false;
					break;
				}
			}
			
			//게임을 클리어 했다면 종료
			if (clear) {
				for (int i = 0 ; i < map.length ; i++) {
					if (map[i] == 0) {
						System.out.print("#");
					} else if (map[i] == 1) {
						System.out.print("X");
					} else if (map[i] == 2) {					
						System.out.print("O");
					}
				}
				System.out.println();
				System.out.println("게임 클리어!");
				break;
			}
		} while(true);		
	}
}
