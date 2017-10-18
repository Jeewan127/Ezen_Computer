//	1차 배열 지뢰 찾기
import java.util.Scanner;

class Mine {
	int x; // 자신의 위치
	
	public int creatMyPosition(int maxPosition) { // 지뢰 위치 랜덤 생성
		x = (int)(Math.random()*maxPosition);
		
		return 0;
	}
	
	public boolean isMinePostion(int position) {
		if (position == x) {
			return true;
		} else {
			return false;
		}
	}
}
public class ObjectEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mapSize = 10;
		int [] map = new int[mapSize];
		Mine mine = new Mine();
		mine.creatMyPosition(mapSize);
		boolean run = true;

		for(int i=0; i<map.length; i++) {
			map[i] = 0;
		}
		
		do {
			printMap(map, mine);
			System.out.println();
			System.out.print("숫자 입력: ");
			int num = sc.nextInt();
			
			if(mine.isMinePostion(num)) {		// 지뢰를 밟았는지 확인
				System.out.println("지뢰!");
				run = false;
			} else if(map[num] == 0) {
				map[num] = 1;
			}
		} while(run);
		 
	}

	public static void printMap(int [] map, Mine mine) {
		for(int i=0; i<map.length; i++) {
			if(mine.creatMyPosition(mine.x) == i) {
				System.out.print("＠");
			} else if(map[i] == 0) {
				System.out.print("☆");
			} else if(map[i] == 1) {
				System.out.print("★");
			}
		}
	}
}
