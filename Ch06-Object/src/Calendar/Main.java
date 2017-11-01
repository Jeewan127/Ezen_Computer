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
		// '��' ����ŭ �ݺ�
		
		for(int i=0; i<week_count+5; i+=2) {
			// ��~����� ���� �ݺ�
			for(int j=0; j<7; j++) {
				// �޷��� ù���� ����
				if(i == 0 && j<first_day - 1) {
					data[i][j] = 0;
				} else if(count > day_count) {
					// �̹����� ��¥�� ���� ���
					data[i][j] = 0;
				} else {
					data[i][j] = count++;
				}
			}
		}

		do {
			System.out.println("\t��\t��\tȭ\t��\t��\t��\t��");
			for(int i=0; i<week_count+5; i++) {
				for(int j=0; j<7; j++) {
					if(x == i && y == j) {
						System.out.print("\t��");
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
				System.out.println("����");
			} 
		} while(num != 9);
		
		
	}
	
	public static void printMenu() {
		System.out.println();
		System.out.println("Left(4)  Right(6)  Up(8)  Down(2)  End(9)");
		System.out.print("����: ");
	}

}
