import java.util.Scanner;

public class StatementMain12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		int number = 0;
		System.out.print("숫자를 입력하세요: ");
		inputString = scanner.nextLine();
		number = Integer.parseInt(inputString);
		
		if(number%2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		} else {
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
	}

}
