import java.util.Scanner;

public class StatementEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int number = num.nextInt();
		
		for(int i=0; i<number; i++) {
				for(int j=0; j<i+1; j++){
					System.out.print("*");
			}
			System.out.println("");
		}
		
/*		for(int i=6; i>0; i--) {
			for(int j=0; j<i-1; j++){
				System.out.print("*");
			} 			
			System.out.println("");
		}*/
	}
}
