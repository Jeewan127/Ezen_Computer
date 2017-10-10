import java.util.Scanner;

public class StatementEx23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int number = num.nextInt();
		
		for(int i=0; i<number; i++) {
			for(int k=0; k<i+1; k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
		for(int j=0; j<number; j++) {
			for(int r=number-j-1; r>0; r--) {
				System.out.print(number-r-(j+1));
			}
			System.out.println("");
		}
	}
}