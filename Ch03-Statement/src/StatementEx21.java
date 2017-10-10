import java.util.Scanner;

public class StatementEx21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		
		int number;
		
		System.out.print("숫자를 입력하세요: ");
		number = num.nextInt();
		
		for(int i=0; i<number; i++) {
			System.out.println("");
			for(int k=0; k<number; k++) {
				System.out.print("*");
			}
		}
	}

}
