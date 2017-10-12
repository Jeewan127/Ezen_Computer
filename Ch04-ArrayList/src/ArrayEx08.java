import java.util.Scanner;

public class ArrayEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("맵 길이 입력: ");
		int mapn = sc.nextInt();
		
		int [] map = new int[mapn];
		int number, x, count=0;
		int a=map.length+1, b=map.length+2;
		
		
		
		for(int i=0; i<map.length; i++) {
			map[i] = 0;
		}
		
		x = (int)(Math.random()*(map.length));
		
		do {
			for(int i=0; i<map.length; i++) {	
				if(a == i) {
					System.out.print("X");
				} else if(b == i || map[i] == 2) {
					map[b] = 2;
					System.out.print("O");
					} else if(map[i] == 0) {
					System.out.print("#");
				}
			}
			
			System.out.print(" " + x);
			System.out.println("");
			System.out.print("값을 입력하세요: ");
			number = sc.nextInt();
			
			if(number == x) {
				a = x;
				System.out.println("지뢰를 밝았습니다.");
				for(int i=0; i<map.length; i++) {
					if(a == i) {
						System.out.print("X");
					} else if(b == i || map[i] == 2) {
						map[b] = 2;
						System.out.print("O");
					} else if(map[i] == 0) {
						System.out.print("#");
					} 
				}
			} else if(number != x) {
				if(number == b) {
						System.out.println("이미 선택하셨습니다.");
					} else if(number > map.length){
						System.out.println("잘못 입력하셨습니다.");
					} else {
						b = number;
						count ++;
					}
			}
			
			if(count == map.length-1) {
				for(int i=0; i<map.length; i++) {	
					if(a == i) {
						System.out.print("X");
					} else if(b == i || map[i] == 2) {
						map[b] = 2;
						System.out.print("O");
						} else if(map[i] == 0) {
						System.out.print("#");
					}
				}
				System.out.println();
				System.out.println("게임 클리어");
				break;
			}
		
		} while(number != x);
	}
}
