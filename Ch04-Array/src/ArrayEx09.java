import java.util.Scanner;

public class ArrayEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int size, x, a, b, count;
		System.out.print("길이 입력: ");
		size = sc.nextInt();
		
		int [] map = new int [size];
		int [] map2 = new int [size];
		
		for(int i=0; i<map.length; i++) {
			map[i] = map.length+10;
		}
		
		for(int k=0; k<map.length; k++) {
			map2[k] = (int)(Math.random()*10);
		}
		
		for(int r=0; r<map.length; r++) {
				if(map[r] == map.length+10) {
					System.out.print("#");
				}  
			}
		do {
			System.out.println();
			System.out.print("값을 입력하세요: ");
			a = sc.nextInt();
				
			for(int i=0; i<map2.length; i++) {
				if(a == map2[i]) {
					map[i] = map2[i];
					System.out.print(map[i]);
				} else if(map[i] == map2[i]){
					System.out.print(map[i]);
				} else if(map[i] == map.length+10) {
					System.out.print("#");
				} 
			}
			
			boolean exit = true;
			for(int k=0; k<map.length; k++) {
				if(map[k] == map.length+10) {
					exit = false;
					break;
				}
			}
			
			if(exit) {
				a = 10;
			}
					
		} while(a != 10);
		System.out.println();
		System.out.println("프로그램 종료");
	}
}