import java.util.Scanner;

public class FunctionEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	1�� �迭 1���� ����� ���ڸ� �����ϰ� �ִ´�
		 	����ڰ� �����ϳ��� �Է�(0~9)
		 	����ڰ� �Է��� ���ڰ� �迭�� ���° �ִ��� ã���ִ� �Լ��� �ۼ�
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr;
		
		System.out.print("�迭 ���� �Է�: ");
		int length = sc.nextInt();
		arr = new int [length];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10);
		}
		search(arr);
	}
	
	public static void search(int [] arr) {
		Scanner num = new Scanner(System.in);
		
		System.out.print("���� �Է�(0~9): ");
		int number = num.nextInt();
		if(number < 10) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i] == number) {
					System.out.println(i + "��°�� �����մϴ�.");
				} 
			}
		} else {
			System.out.println("�߸��� �����Դϴ�.");
		}
		
	}

}
