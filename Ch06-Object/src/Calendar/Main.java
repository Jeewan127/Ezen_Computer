package Calendar;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataUtil util = DataUtil.getInstance();
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int x=1, y=0;
		
		
		util.printDate(cal);
		
		cal.set(Calendar.DAY_OF_MONTH, 1);
		int week_count = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
		int first_day = cal.get(Calendar.DAY_OF_WEEK);
		int day_count = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int count = 1;
		
		int [][] data = new int[week_count+5][7];
		// '주' 수만큼 반복
		
		for(int i=0; i<week_count+5; i+=2) {
			// 일~토요일 까지 반복
			for(int j=0; j<7; j++) {
				// 달력의 첫줄을 구함
				if(i == 0 && j<first_day - 1) {
					data[i][j] = 0;
				} else if(count > day_count) {
					// 이번달의 날짜를 넘은 경우
					data[i][j] = 0;
				} else {
					data[i][j] = count++;
				}
			}
		}

		do {
			System.out.println("\t일\t월\t화\t수\t목\t금\t토");
			for(int i=0; i<week_count+5; i++) {
				for(int j=0; j<7; j++) {
					if(x == i && y == j) {
						System.out.print("\t▲");
					} else if(data[i][j] == 0) {
						System.out.print("\t");
					} else {
						System.out.print("\t" + data[i][j]);
					}
				}
				System.out.println();
			}
			
			printMenu();
			num = sc.nextInt();
			if(num == 4) {
				y--;
			} else if(num == 6) {
				y++;
			} else if(num == 8) {
				x = x-2;
			} else if(num == 2) {
				x = x+2;
			} else if(num == 9) {
				System.out.println("종료");
			} 
		} while(num != 9);
		
		
	}
	
	public static void printMenu() {
		System.out.println();
		System.out.println("Left(4)  Right(6)  Up(8)  Down(2)  End(9)");
		System.out.print("선택: ");
	}

}
