import java.util.Scanner;

public class ArrayEx16 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		/*
		 	2�� �迭�� ���� ����� �� ����������
		 	���� ����Ű�� �̿��Ͽ� ��ü�� �������� 
		 	������ ��ġ�� ������ ���� ������ �� ����
		 	���� ������ ���� �����ϸ� ����
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0; // �����̴� ����(����Ű�� �����̴� ��)
		int c , d;
		int num;
		int boomx, boomy;
		int [][] map;
		int [][] move;
		int [][] boom;
		
		boolean run = true;
		
		System.out.print("�� ũ�� �Է�: ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		map = new int [first][second];
		move = new int [first][second];
		boom = new int [first][second];
		
		// map �ʱ�ȭ
		for(int i=0; i<first; i++) {
			for(int k=0; k<second; k++) {
				map[i][k] = 0;
			}
		}
		
		// ��ź ���� ����
		boomx = (int)(Math.random()*(first-2))+1;
		boomy = (int)(Math.random()*(second-2))+1;
		
		// map�� �� �������� ����
		int f = (int)(Math.random()*(first-2))+1;
		int s = (int)(Math.random()*(second-2))+1;
		
		// �������� ���� ����
		c = (int)(Math.random()*first);
		d = (int)(Math.random()*second);
		
		map [f][s] = 1;
		
		do {
			// �� ���
			for(int i=0; i<first; i++) {
				for(int k=0; k<second; k++) {
					if(a == i && b == k) {
						System.out.print("��");
					} else if(map[i][k] == 10) {
						System.out.print("��");
					} else if(boomx == i && boomy == k) {
						System.out.print("��");
					} else if(map[i][k] == 0) {
						System.out.print("��");
					} else if(map[i][k] == 1) {
						System.out.print("��");
					} else if(map[i][k] == 5) {
						System.out.print("��");
					}
				}
				System.out.println();
			}
			
			// �޴� ȣ��
			System.out.print("left(4) right(6) up(8) down(2) set(7) exit(9) reset(3): ");
			num = sc.nextInt();
			
			if (num == 4) { // left
				if(b==0) {
					System.out.println("���Դϴ�.");
				} else if(boomx == a && boomy == (b-1)) {
					if(boomx == a && boomy == 0) {
						System.out.println("�� �̻� �� �� �����ϴ�.");
					} else {
						boomy--;
						b--;
					}
					
				} else {
					b--;
				}
			} else if(num == 6) { // right 
				if(b==(second-1)) {
					System.out.println("���Դϴ�.");
				} else if(boomx == a && boomy == (b+1)) {
					if(boomx == a && boomy == (second-1)) {
						System.out.println("�� �̻� �� �� �����ϴ�.");
					} else {
						boomy++;
						b++;
					}
				} else {
					b++;
				}
			} else if(num == 8) { // up
				if(a==0) {
					System.out.println("���Դϴ�.");
				} else if(boomx == (a-1) && boomy == b) { 
					if(boomx == 0 && boomy == b) {
						System.out.println("�� �̻� �� �� �����ϴ�.");
					} else {
						boomx--;
						a--;
					}
				} else {
					a--;
				}
			} else if(num == 2) { // down
				if(a==(first-1)) {
					System.out.println("���Դϴ�.");
				} else if(boomx == (a+1) && boomy == b) {
					if(boomx == (first-1) && boomy == b) {
						System.out.println("�� �̻� �� �� �����ϴ�.");
					} else {
						boomx++;
						a++;
					}
					
				} else {
					a++;
				}
			} else if(num == 9) { // exit
				System.out.println("������ �����մϴ�.");
				run = false;
			} else if(num == 3) {
				System.out.println("�ʱ�ȭ");
				
				if(map [f][s] == 0) {
					
					// �ٽ� �ʱ�ȭ
					for(int i=0; i<first; i++) {
						for(int k=0; k<second; k++) {
							map[i][k] = 0;
						}
					}
					
					// �� ����
					f = (int)(Math.random()*(first-2))+1;
					s = (int)(Math.random()*(second-2))+1;
					
					map [f][s] = 1;
					
					// ��ź ����
					boomx = (int)(Math.random()*(first-2))+1;
					boomy = (int)(Math.random()*(second-2))+1;
					
					// �������� ���� ����
					c = (int)(Math.random()*first);
					d = (int)(Math.random()*second);
					
					a = 0;
					b = 0;
				} else {
					// �ʱ�ȭ
					for(int i=0; i<first; i++) {
						for(int k=0; k<second; k++) {
							map[i][k] = 0;
						}
					}
				
					// �� ����
					f = (int)(Math.random()*(first-2))+1;
					s = (int)(Math.random()*(second-2))+1;
					
					map [f][s] = 1;
					
					// ��ź ����
					boomx = (int)(Math.random()*(first-2))+1;
					boomy = (int)(Math.random()*(second-2))+1;
					
					// �������� ���� ����
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
				// �������� ����
				map [c][d] = 5;		
				// �� ���ֱ�
				map [f][s] = 0;
				System.out.println("�������� ���� ���Ƚ��ϴ�.");
			}
			
			if(boomx == c && boomy == d) {
				if(map[f][s] == 1) {
					System.out.println("���ڸ� ó������ �������ϴ�.");
				} else {
				System.out.println("���� Ŭ����");
				run = false; 
				}
			}
			
		} while(run);	
	}
}
