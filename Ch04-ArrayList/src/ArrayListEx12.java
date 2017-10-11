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
		
		int a = 0, b = 0; // �����̴� ����
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
		
		do {
			
			for(int i=0; i<first; i++) {
				for(int k=0; k<second; k++) {
					if(a == i && b == k) {
						System.out.print("��");
					}
					else if(map[i][k] == 0) {
						System.out.print("��");
					} else if(map[i][k] == 1) {
						System.out.print("��");
					} else if(map[i][k] == 5) {
						System.out.print("��");
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
				System.out.println("������ �����մϴ�.");
				run = false;
			}
			
			if(a==f && b==s) {
				// �������� ����
				map [first-1][second-1] = 5;		
				// �� ���ֱ�
				map [f][s] = 0;
				System.out.println("�������� ���� ���Ƚ��ϴ�.");
			}
			
			if(a==(first-1) && b==(second-1)) {
				if(map[f][s] == 1) {
					System.out.println("���� ���� ���߽��ϴ�.");
				} else {
				System.out.println("���� Ŭ����");
				run = false; 
				}
			}
			
		} while(run);	
	}
}
