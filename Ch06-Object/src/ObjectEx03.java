//	1�� �迭 ���� ã��
import java.util.Scanner;

class Mine {
	int x; // �ڽ��� ��ġ
	
	public int creatMyPosition(int maxPosition) { // ���� ��ġ ���� ����
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
			System.out.print("���� �Է�: ");
			int num = sc.nextInt();
			
			if(mine.isMinePostion(num)) {		// ���ڸ� ��Ҵ��� Ȯ��
				System.out.println("����!");
				run = false;
			} else if(map[num] == 0) {
				map[num] = 1;
			}
		} while(run);
		 
	}

	public static void printMap(int [] map, Mine mine) {
		for(int i=0; i<map.length; i++) {
			if(mine.creatMyPosition(mine.x) == i) {
				System.out.print("��");
			} else if(map[i] == 0) {
				System.out.print("��");
			} else if(map[i] == 1) {
				System.out.print("��");
			}
		}
	}
}
