import java.util.Scanner;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ������ 10¥�� �迭�� �����
		 1~100������ ������ ���� ���ʷ� �迭�� �Է�.
		 ������ ����� ���ϴ� ���α׷�
		 */
		
		int sum = 0;
		int avg = 0;
		int [] number = new int[10];
		
		for(int i=0; i<number.length; i++) {
			number[i] = (int)((Math.random()*100)+1);
			sum += number[i];
		}
		
		for(int k=0; k<number.length; k++) {
			System.out.println(k + "��° ������: " + number[k]);
		}
		
		avg = sum/number.length;
		
		System.out.println("��� ������: " + avg + "�Դϴ�.");
	}

}
