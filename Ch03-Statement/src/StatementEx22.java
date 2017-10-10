import java.util.Scanner;

public class StatementEx22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int number = num.nextInt();
		
		for(int i=0; i<number; i++) {
			for(int k=0; k<i+1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int j=0; j<number; j++) {
			for(int r=number-1; r>j; r--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
