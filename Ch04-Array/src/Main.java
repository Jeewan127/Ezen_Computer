import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 10;
		int[] numbers = new int[size];
		int[] checkNumbers = new int[size];
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		//랜덤한 값을 변수에 저장 0~9
		for (int i = 0 ; i < numbers.length ; i++) {
			numbers[i] = (int) (Math.random()*10);
		}
		
		for (int i = 0 ; i < checkNumbers.length ; i++) {
			checkNumbers[i] = 0;
		}
		
		do {
			//화면에 표시하는 부분
			for (int i = 0 ; i < checkNumbers.length ; i++) {
				if (checkNumbers[i] == 0) {
					System.out.print("*");
				} else if (checkNumbers[i] == 1) {
					System.out.print(numbers[i]);
				}
			}
			System.out.println();
			System.out.print("값을 입력하세요 : ");
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
		
		System.out.println("프로그램 종료");
	}

}
