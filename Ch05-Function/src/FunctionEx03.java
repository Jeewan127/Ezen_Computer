import java.util.Scanner;

public class FunctionEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	1. �Ķ���ͷ� 1�� ������ �迭�� �ް� 
		 	�� �߿��� ���� ū���� ��ȯ �ϴ� �Լ��� �ۼ��ϼ���.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�: ");
		String num = sc.nextLine();
		
		String [] numarr = num.split("\\s");

		maxArray(numarr);
		System.out.println();
		minArray(numarr);
	}

	public static void maxArray(String [] maxnum) {
		int max=0;
		for(int i=1; i<maxnum.length; i++) {
			if(max < Integer.parseInt(maxnum[i])) {
				max = Integer.parseInt(maxnum[i]); 
			} 
		}
		System.out.println("ū����: " + max);
	}
	
	public static void minArray(String [] minnum) {
		int min = 1000;
		for(int i=1; i<minnum.length; i++) {
			if(min > Integer.parseInt(minnum[i])) {
				min = Integer.parseInt(minnum[i]); 
			}
		}
		System.out.println("��������: " + min);
	}
}
