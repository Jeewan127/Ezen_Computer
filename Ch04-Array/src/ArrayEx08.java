import java.util.Scanner;

public class ArrayEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �Է�: ");
		int mapn = sc.nextInt();
		
		int [] map = new int[mapn];	// �� ũ�� ����
		int number, x, count=0; // number: �Է¹޴� ����, x: ������ġ, count: ���� Ŭ���� ����
		int a=map.length+1, b=map.length+2; // �� ũ�⺸�� ũ�� �ؾ� ��ũ�⸦ ����������
											// ó���� ���ڰ� ��ġ�� ����
		boolean run = true;	// �������� ������ ���ؼ� ����
		
		for(int i=0; i<map.length; i++) { // ���� 0���� �ʱ�ȭ
			map[i] = 0;
		}
		
		x = (int)(Math.random()*(map.length));	// �� ũ��ȿ� �������� ���� ����
		
		do {
			// �� ��� ��.
			for(int i=0; i<map.length; i++) {
				if(a == i) { // ���� ���
					System.out.print("X");	
				} else if(b == i || map[i] == 2) { // �ʿ� 2�� �ְų� b�� ���ڰ� �������
					map[b] = 2; // b==i ��� �� ���ڸ� �Է������� ���ڰ� ��� �� ��ġ�� ���
								// ��������� �ϱ� ������ 2�� �����ؼ� ��������
					System.out.print("O");                                                                                     
					} else if(map[i] == 0) { // ���� �ƹ��͵� ���� ���� ��.
					System.out.print("#");
				}
			}
			
			System.out.print(" " + x); // �׽�Ʈ��, ������ġ ǥ��
			System.out.println("");
			System.out.print("���� �Է��ϼ���: "); // ���� �Է�
			number = sc.nextInt(); // �Է��� �� ����
			
			// ���� ���
			if(number == x) { // �Է��� ���� x�� ������
				a = x; // a�� x�� ���� ����
				System.out.println("���ڸ� ��ҽ��ϴ�.");
				// run�� false�� �Ǳ⶧���� ���ڸ� ����� ���� �ѹ��� ����� �ֱ� ���ؼ� ����
				for(int i=0; i<map.length; i++) {	
					// �������� �޸� a���� ������ ��ġ�� x���� ����Ǿ� �ֱ� ������
					// ���ڰ� �ִ°��� X ǥ�ð� ���
					if(a == i) {		
						System.out.print("X");
					} else if(b == i || map[i] == 2) { // ������ ����
						map[b] = 2;
						System.out.print("O");
						} else if(map[i] == 0) {
						System.out.print("#");
					}
				}
				run = false;	// run�� false�Ǹ鼭 ������ ����	
			} else if(number != x) { // ���� �Է��� ���� ���ڰ� �ƴ϶��
				if(map[number] == 2) { // �Է��� ���� �̹� �����ߴ� ���� ���
						System.out.println("�̹� �����ϼ̽��ϴ�.");
					} else if(number > map.length){ // �Է��� ���� �� ũ�⺸�� ũ��
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					} else { // ó�� �Է� �� ���̶�� b�� �Է��� ���ڸ� �־��ְ� ī��Ʈ�� ������Ŵ
						b = number;
						count ++;
					}
			}
			
			// Ŭ����
			if(count == map.length-1) { // ī��Ʈ�� ��ũ�⿡�� 1�� �� ���ڿ� ������ Ŭ���� ������ ����
				System.out.println();
				System.out.println("���� Ŭ����");
				for(int i=0; i<map.length; i++) {	// ���ڶ��� ���������� run�� false�� �Ǿ� �����⶧����
					if(a == i) {					// �� �ѹ��� ���. ������ ����
						System.out.print("X");
					} else if(b == i || map[i] == 2) {
						map[b] = 2;
						System.out.print("O");
						} else if(map[i] == 0) {
						System.out.print("#");
					}
				}
				run = false;
			}
		
		} while(run);
	}
}
