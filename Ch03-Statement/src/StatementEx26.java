import java.util.Scanner;

public class StatementEx26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner num = new Scanner(System.in);
		
		int [] number = new int[5];
		
		System.out.println(number.length + "���� ���� ������ �Է��Ͻʽÿ�.");
		
		for(int i=0; i<number.length; i++) {
			String str = num.nextLine();
			number[i] = Integer.parseInt(str);
		}
		
		for(int i=0; i<number.length-1; i++) {         // ū ������� ����
			for(int k=i+1; k<number.length; k++) {
				if(number[k]>number[i]) {
					int tmp = number[i];
					number[i] = number[k];
					number[k] = tmp;
				}
			}
		}
		
		for(int j=0; j<number.length; j++) {
			System.out.println((j+1) + "��° ����� ������" + number[j] + "�Դϴ�.");
		}
		System.out.println("���� ���� ������" + number[0] + "�Դϴ�.");
		int sum = 0;
		for(int a=0; a<number.length; a++) {
			sum += number[a];
		}
		System.out.println("�հ� ������" + sum);
		System.out.println("��� ������" + (float)sum/5);
		
	}
}

