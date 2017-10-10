import java.util.Scanner;

public class ArrayListEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] map = new int [10];
		int a=0;
		int number;
		
		Scanner num = new Scanner(System.in);
		
		for(int i=1; i<map.length; i++) {
			map[i] = 0;
		}
		
		do {
			for(int i=0; i<map.length; i++) {
				if(a == i){
					System.out.print("@");
				} else if(map[i] == 0 ) {
					System.out.print("#");
				}
			}
			
			System.out.println("");
			System.out.print("ют╥б: ");
			number = num.nextInt();
			
			if(number == 2) {
				if(a == map.length-1) {
					a=0;
				} else{
					a++;
				}
				
			} else if (number == 1) {
				if(a == 0) {
					a = (map.length-1);
				} else {
					a--;
				}
				
			}
		} while(number!=3);
		
	}
}
