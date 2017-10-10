import java.util.Scanner;

public class StatementEx24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int number = num.nextInt();
		
		for(int i=0; i<number; i++) {
			for(int j=i; j<number-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i+1; k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
		for(int i=0; i<number-1; i++) {
			for(int j=number+i; j>number-1; j--) {
				System.out.print(" ");
			}
			for(int r=number-i-1; r>0; r--) {
				System.out.print(number-r-(i+1));
			}
			System.out.println("");
		}
	}
}
