import java.util.Scanner;

public class FunctionEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int cash = 0;
		int num;
//		print(cash);
		
		while(run) {
			print(cash);
			int number = sc.nextInt();
			
			switch (number) {
			case 0:
				cash = cash + 100;
				break;
			case 1:
				num = 500;
				cash = operator(cash, num);
				break;
			case 2:
				num = 600;
				cash = operator(cash, num);
				break;
			case 3:
				num = 400;
				cash = operator(cash, num);
				break;
			case 4:
				num = 300;
				cash = operator(cash, num);
				break;
			case 5:
				System.out.println("프로그램이 종료되었습니다.");
				run = false;
				break;
			default:
				break;
			}
		}
	}
	
	public static int operator(int cash, int num) {
		if(cash > num) {
			cash = cash - num;
		} else {
			System.out.println("잔액 부족");
		}
		return cash;
	}

	public static void print(int sum) {
		System.out.println("1. 환타, 2. 콜라, 3. 사이다, 4. 물");
		System.out.println("   500원    600원    400원      300원");
		System.out.println("   잔액: " + sum);
		System.out.println();
		System.out.print("0: 100원 넣기, 1~4 음료 선택, 5 프로그램 종료: ");
	}
}
