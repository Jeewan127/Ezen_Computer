import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 10;
		int[] numbers = new int[size];
		int[] checkNumbers = new int[size];
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		//������ ���� ������ ���� 0~9
		for (int i = 0 ; i < numbers.length ; i++) {
			numbers[i] = (int) (Math.random()*10);
		}
		
		for (int i = 0 ; i < checkNumbers.length ; i++) {
			checkNumbers[i] = 0;
		}
		
		do {
			//ȭ�鿡 ǥ���ϴ� �κ�
			for (int i = 0 ; i < checkNumbers.length ; i++) {
				if (checkNumbers[i] == 0) {
					System.out.print("*");
				} else if (checkNumbers[i] == 1) {
					System.out.print(numbers[i]);
				}
			}
			System.out.println();
			System.out.print("���� �Է��ϼ��� : ");
			number = scanner.nextInt();
			
			for (int i = 0 ; i < numbers.length ; i++) {
				if (numbers[i] == number) {
					checkNumbers[i] = 1;
				}
			}
			boolean exit = true;
			for (int i = 0 ; i < checkNumbers.length ; i++) {
				if (checkNumbers[i] == 0) {
					exit = false;
					break;
				}
			}
			
			if (exit) {
				number = 10;
			}			
		} while(number != 10);
		
		System.out.println("���α׷� ����");
	}

}
