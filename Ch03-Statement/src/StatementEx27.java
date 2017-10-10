import java.util.Scanner;

public class StatementEx27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("숫자 입력: ");
		num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int r=i; r<num-1; r++) {
				System.out.print(" ");
			}
			for(int k=0; k<(i*2)+1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=0; i<num; i++) {
			for(int r=0; r<i+1; r++) {
				System.out.print(" ");
			}
			for(int k=(i*2)+1; k<(num*2)-2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
