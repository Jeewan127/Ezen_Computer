import java.util.Scanner;

public class ArrayListEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	1. ����ڿ��� ��� ������ �Է� �޴´�.
		 	2. ��� �� ���� �̿��Ͽ� 2���迭�� �����Ѵ�.
		 	3. 2�� �迭�� 0 or 1���� �����ϰ� �޴´�.
		 	4. 2�� �迭�� �Ʒ��� ��Ģ�� ���� ȭ�鿡 ����Ѵ�.
		 	ex) 0-># / 1->@
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է�: ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		int [][] num = new int[first][second];
		
		for(int i=0; i<first; i++) {
			for(int r=0; r<second; r++) {
				num[i][r] = (int)(Math.random()*2);
				if(num[i][r] == 0) {
					System.out.print("#");
				} else if(num[i][r] == 1) {
					System.out.print("@");
				}
			}
			System.out.println();
		}
	}

}
