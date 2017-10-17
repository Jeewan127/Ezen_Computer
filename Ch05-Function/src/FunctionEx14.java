import java.util.Scanner;

public class FunctionEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	<쇼핑몰>
		 	1. 카테고리
		 	- 반팔 300원, 긴팔 400원, 바지 500원
		 	사용자가 카테고리 선택
		 	2. 색상
		 	- 빨간 50원, 파랑 100원, 초록 150원
		 	
		 	0: 100원씩 잔액 올라감
		 	1~3: 카테고리 선택 -> 1~3 색상 선택
		 	잔액이 부족하면 '잔액 부족'
		 	잔액이 충분하면 상품 금액만큼 차감
		 	최종적으로 구매한 상품 정보가 나와야 함( ex) 반팔 - 빨강 )
		 */
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int cash = 0;
		int num;
		
		do {
			categoryPrint(cash);
			int number = sc.nextInt();
			
			if(number == 0) {
				cash = cash + 100;
			} else if(number == 1) {
				System.out.println("반팔을 선택하셨습니다.");
				num = 300;
				cash = category(cash, num);
			} else if(number == 2) {
				System.out.println("긴팔을 선택하셨습니다.");
				num = 400;
				cash = category(cash, num);
			} else if(number == 3) {
				System.out.println("바지를 선택하셨습니다.");
				num = 500;
				cash = category(cash, num);
			} else if(number == 4) {
				System.out.println("프로그램이 종료 되었습니다.");
				System.out.println("잔액: " + cash);
				run = false;
			}
			
			/*if(number != 0) {
				run = false;
				System.out.println("잔액: " + cash);
			}*/
		} while(run);
	}
	public static void categoryPrint(int cash) {
		System.out.println("1. 반팔, 2. 긴팔, 3. 바지");
		System.out.println("   300원    400원    500원");
		System.out.println("   잔액: " + cash);
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.print("0: 100원 넣기, 1~3: 옷 선택, 4: 프로그램 종료: ");
		
	}
	
	public static int category(int cash, int num) {
		System.out.println("*********옵션 선택********");
		System.out.println("1. 빨강, 2. 파랑, 3. 초록");
		System.out.println("   +50원    +100원   +150원");
		System.out.println();
		System.out.print("1~3 색깔 선택, 4 프로그램 종료: ");
		
		Scanner sc = new Scanner(System.in);
		int colornum = sc.nextInt();
		if(colornum == 0) {
			cash = cash + 100;
		} else if(colornum == 1) {
			if(cash > (num+50)) {
				cash = cash - (num + 50);
				if(num == 300) {
					System.out.println("선택한 상품: 빨강-반팔");
				} else if(num == 400) {
					System.out.println("선택한 상품: 파랑-반팔");
				} else if(num == 500) {
					System.out.println("선택한 상품: 녹색-반팔");
				}
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else if(colornum == 2) {
			if(cash > (num+100)) {
				cash = cash - (num + 100);
				if(num == 300) {
					System.out.println("선택한 상품: 빨강-긴팔");
				} else if(num == 400) {
					System.out.println("선택한 상품: 파랑-긴팔");
				} else if(num == 500) {
					System.out.println("선택한 상품: 녹색-긴팔");
				}
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else if(colornum == 3) {
			if(cash > (num+150)) {
				cash = cash - (num + 150);
				if(num == 300) {
					System.out.println("선택한 상품: 빨강-바지");
				} else if(num == 400) {
					System.out.println("선택한 상품: 파랑-바지");
				} else if(num == 500) {
					System.out.println("선택한 상품: 녹색-바지");
				}
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		}
		return cash;
	}

}