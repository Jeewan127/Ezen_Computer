import java.util.Scanner;

public class ArrayEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �Է�: ");
		int mapn = sc.nextInt();
		
		int [] map = new int[mapn];
		int number, x, count=0;
		int a=map.length+1, b=map.length+2;
		
		
		
		for(int i=0; i<map.length; i++) {
			map[i] = 0;
		}
		
		x = (int)(Math.random()*(map.length));
		
		do {
			for(int i=0; i<map.length; i++) {	
				if(a == i) {
					System.out.print("X");
				} else if(b == i || map[i] == 2) {
					map[b] = 2;
					System.out.print("O");
					} else if(map[i] == 0) {
					System.out.print("#");
				}
			}
			
			System.out.print(" " + x);
			System.out.println("");
			System.out.print("���� �Է��ϼ���: ");
			number = sc.nextInt();
			
			if(number == x) {
				a = x;
				System.out.println("���ڸ� ��ҽ��ϴ�.");
				for(int i=0; i<map.length; i++) {
					if(a == i) {
						System.out.print("X");
					} else if(b == i || map[i] == 2) {
						map[b] = 2;
						System.out.print("O");
					} else if(map[i] == 0) {
						System.out.print("#");
					} 
				}
			} else if(number != x) {
				if(number == b) {
						System.out.println("�̹� �����ϼ̽��ϴ�.");
					} else if(number > map.length){
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					} else {
						b = number;
						count ++;
					}
			}
			
			if(count == map.length-1) {
				for(int i=0; i<map.length; i++) {	
					if(a == i) {
						System.out.print("X");
					} else if(b == i || map[i] == 2) {
						map[b] = 2;
						System.out.print("O");
						} else if(map[i] == 0) {
						System.out.print("#");
					}
				}
				System.out.println();
				System.out.println("���� Ŭ����");
				break;
			}
		
		} while(number != x);
	}
}
