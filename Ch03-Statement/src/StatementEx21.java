import java.util.Scanner;

public class StatementEx21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		
		int number;
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		number = num.nextInt();
		
		for(int i=0; i<number; i++) {
			System.out.println("");
			for(int k=0; k<number; k++) {
				System.out.print("*");
			}
		}
	}

}
