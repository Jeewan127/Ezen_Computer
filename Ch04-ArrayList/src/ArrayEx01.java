import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num = new Scanner(System.in);
		
		int [] number;
		int sum=0;
		int avg=0;
		number = new int[10];
		
		for(int i=0; i<number.length; i++) {
			System.out.print((i+1) + "��° �л��� ���������� �Է��ϼ���: ");
			String score = num.nextLine();
			number[i] = Integer.parseInt(score);
		}
		
		for(int k=0; k<number.length; k++) {
			sum += number[k];
		}
		
		avg = sum/number.length;
		System.out.println("�� ���� ��� ���� ������: " + avg + "�Դϴ�.");
		
	}

}
