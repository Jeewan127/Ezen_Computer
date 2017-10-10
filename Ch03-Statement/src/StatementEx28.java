import java.util.Scanner;

public class StatementEx28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int k=0; k<num-i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=0; i<num; i++) {
			for(int k=0; k<i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
