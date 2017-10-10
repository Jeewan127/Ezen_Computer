import java.util.Scanner;

public class ArrayListEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	2�� �迭 ����ã��
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭 ���� �Է�: ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		int [][] map = new int [first][second];
		
		int f, s;
		boolean exit;
		
		// mpa �ʱ�ȭ	
		for(int i=0; i<first; i++) {
			for(int r=0; r<second; r++) {
				map[i][r] = 0;
			}
		}
		
		// ���� ����
		f = (int)(Math.random()*(first));
		s = (int)(Math.random()*(second));
		
		map[f][s] = 1;	// �����ΰ��� 1�� �־���
		
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
			
			System.out.print("first ���� �Է�: ");
			int a = sc.nextInt();
			System.out.print("second ���� �Է�: ");
			int b = sc.nextInt();
			
			if(map[a][b] == 2) {
				System.out.println("�̹� ������ ��ġ �Դϴ�.");
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
				System.out.println("���ڸ� ��ҽ��ϴ�.");
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
				System.out.println("���� Ŭ����!");
				break;
			}
				
		} while(true);
		
	}

}
