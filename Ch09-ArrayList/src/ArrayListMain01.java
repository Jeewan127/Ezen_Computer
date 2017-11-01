import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> items = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		do {
			printMenu();
			num = sc.nextInt();
			
			if(num == 1) {
				System.out.println("데이터 입력: ");
				num = sc.nextInt();
				items.add(num);
			} else if(num == 2) {
				System.out.println("데이터 삭제: ");
				num = sc.nextInt();
				items.remove(num);
			} else if(num == 3) {
				System.out.println("전체 데이터 보기");
				for(int i=0; i<items.size(); i++) {
					System.out.println((i+1) + ". " + items.get(i));
				}
			} else if(num == 4) {
				System.out.println("전체 삭제");
				items.clear();
			} else if(num == 5) {
				System.out.println("종료");
			}
		} while(num != 5);
		
	}

	public static void printMenu() {
		System.out.println("1: 데이터 넣기 2: 데이터 삭제 3: 전체 데이터 보기 4: 전체 삭제 5: 종료");
		System.out.print("입력: ");
	}
}
