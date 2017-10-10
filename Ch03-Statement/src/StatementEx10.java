import java.util.Scanner;

public class StatementEx10 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/*
		 	키보드로부터 입력된 데이터로 예금(1), 출금(2), 조회(3), 종료(4) 기능을
		 	제공하는 코드 작성(while사용)
		*/
		
		Scanner num = new Scanner(System.in);
		
		boolean run = true;
		int sum=0;
		int keyCode = 0;
		int number;
		
		while (run) {
			if (keyCode!=13 && keyCode!=10) {
				System.out.println("---------------------------");
				System.out.println("1.예금 / 2.출금 / 3.조회 / 4.종료");
				System.out.println("---------------------------");
				System.out.print("선택>");
			}
			
			keyCode = System.in.read();
			
				if(keyCode == 49) {
					System.out.print("예금액>");
					number = num.nextInt();
					sum = sum + number;
				} else if (keyCode == 50) {
					System.out.print("출금액>");
					number = num.nextInt();
					if(sum<number) {
						System.out.println("잔고가 부족합니다.");
					}
					sum = sum - number;
				} else if (keyCode == 51) {
						System.out.println("잔고>" + sum); 
				} else if (keyCode == 52) {
					run = false;
				}
			}
			System.out.println("프로그램 종료");
		}
	}