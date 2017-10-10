import java.util.Scanner;

public class StatementEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int number = num.nextInt();
/*		for(int i=0; i<5; i++) {
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}*/
		for(int i=number; i>0; i--) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=number+1; k>i; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
