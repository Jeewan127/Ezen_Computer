import java.util.Scanner;

public class StatementMain12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		int number = 0;
		System.out.print("���ڸ� �Է��ϼ���: ");
		inputString = scanner.nextLine();
		number = Integer.parseInt(inputString);
		
		if(number%2 == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");
		}
	}

}
