

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] map;
		map = new int[3];
		int number = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		//�� �ʱ�ȭ 
		for (int i = 0 ; i < map.length ; i++) {
			map[i] = 0;
		}
		
		//���� ����		
		map[(int) (Math.random()*map.length)] = 1;
		
		do {
			//�� ��� 
			for (int i = 0 ; i < map.length ; i++) {
				if (map[i] == 0 || map[i] == 1) {
					System.out.print("#");
				} else if (map[i] == 2) {
					System.out.print("O");
				}
			}
			//����ڿ��� üũ�� ���� �ε����� �Է� ����
			System.out.println();
			System.out.print("���� �Է��ϼ��� : ");
			number = scanner.nextInt();
						
			//�̹� �ѹ� üũ�� ������ üũ
			if (map[number] == 2) {
				System.out.println("�̹� ������ ��ġ �Դϴ�.");
			} else if (map[number] == 1) /* ���ڹ��� */{
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
				System.out.println("���ڸ� ��ҽ��ϴ�.");
				break;
			} else if (map[number] == 0) /* �ѹ��� üũ���� ���� ���̶�� */ {
				map[number] = 2;
			}			

			//������ Ŭ���� �ߴ��� üũ
			//���� üũ�Ͽ� �ѹ��� �˻����� ���� ���� ���� ������
			//���� ������ Ŭ���� ���� ���ߴٰ� ������
			boolean clear = true;
			for (int i = 0 ; i < map.length ; i++) {
				if (map[i] == 0) {
					clear = false;
					break;
				}
			}
			
			//������ Ŭ���� �ߴٸ� ����
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
				System.out.println("���� Ŭ����!");
				break;
			}
		} while(true);		
	}
}
