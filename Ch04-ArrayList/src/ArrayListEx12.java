import java.util.Scanner;

public class ArrayListEx12 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		/*
		 	2�� �迭�� ���� ����� �� ����������
		 	���� ����Ű�� �̿��Ͽ� ��ü�� �������� 
		 	������ ��ġ�� ������ ���� ������ �� ����
		 	���� ������ ���� �����ϸ� ����
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int key =0;
		int num;
		int [][] map;
		int [][] move;
		
		boolean run = true;
		
		System.out.print("�� ũ�� �Է�: ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		map = new int [first][second];
		move = new int [first][second];
		
		// map �ʱ�ȭ
		for(int i=0; i<first; i++) {
			for(int k=0; k<second; k++) {
				map[i][k] = 0;
			}
		}
		
		// map�� �� �������� ����
		int f = (int)(Math.random()*first);
		int s = (int)(Math.random()*second);
		map [f][s] = 1;
		
		// �������� ����
		map [first][second] = 5;
		
		do {
			for(int i=0; i<first; i++) {
				for(int k=0; k<second; k++) {
					if(map[i][k] == 0 || map[i][k] == 5) {
						System.out.print("��");
					} else if(map[i][k] == 1) {
						System.out.print("��");
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
