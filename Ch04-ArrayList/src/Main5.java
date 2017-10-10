

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
		
		for (int i = 0 ; i < number ; i++) {
			for (int j = (number-i-1) ; 0 < j; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0 ; j < (i*2 + 1) ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		
		
		for (int i = 0 ; i < number - 1 ; i++) {
			for (int j = 0 ; j < (i+1) ; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0 ; j < ((number-i-2)*2 + 1) ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
