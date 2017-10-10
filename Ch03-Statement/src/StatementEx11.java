import java.util.Scanner;

public class StatementEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	변수에 정수 값을 입력
		 	변수값이 2의 배수이면 '2의 배수입니다', 3의 배수이면 '3의 배수입니다.',
		 	2의 배수이면서 3의 배수이면 '2의 배수이면서 3의 배수입니다.'
		 	모두 아닌경우 '일반 정수 입니다.'
		 	-> if문의 순서 중요
		 */
		
		Scanner num = new Scanner(System.in);
		
		int number;
		System.out.print("정수를 입력하세요: ");
		number = num.nextInt();
		
		if (number%6 == 0) {
			System.out.println("2의 배수이면서 3의 배수입니다.");
		} else if (number%3 == 0) {
			System.out.println("3의 배수입니다.");
		} else if (number%2 == 0) {
			System.out.println("2의 배수입니다.");
		} else {
			System.out.println("일반 정수 입니다.");
		}
	}

}
