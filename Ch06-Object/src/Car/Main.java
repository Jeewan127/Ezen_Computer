/*
 자동차의 정보를 보여주는 사이트가 있다.

자동차의 종류는 경차, 중형차, 대형차가 있고

경차에는 마티즈, 레이, 티볼리
중형차에는 말리부, 소나타, k5
대형차에는 랜드로버, 버스가 있다

처음 화면에서는 카테고리를 선택할 수 있고
카테고리를 선택하면 해당 자동차 목록이 나온다.
해당 자동차를 선택하면(선택하는 방식은 개발자가 선택)
해당 자동차의 정보가 나온다.

자동차의 정보는
주행거리
최대 연료저장량
가격
이 출력된다.

자동차 정보를 보여주면 '이전으로 가기를 선택하면' 다시 카테고리
화면으로 돌아가게 구성한다.

 */
package Car;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name [] = {"경차", "중형차", "대형차"};
		int num = 0;
		int num2 = 0;
		int x=1, y=0;
		
		Car car [][] = new Car [6][3];
		
		for(int i=0; i<car.length; i++) {
			for(int k=0; k<car[i].length; k++) {
				car[i][k] = new Car(0);
			}
		}
			
		car[0][0] = new Car("마티즈", 20, 30, 1500);
		car[0][1] = new Car("레이  ", 30, 35, 1700);
		car[0][2] = new Car("티볼리", 35, 40, 2300);
		
		car[2][0] = new Car("말리부", 50, 40, 2700);
		car[2][1] = new Car("소나타", 80, 45, 3500);
		car[2][2] = new Car("k5 ", 120, 50, 4800);
		
		car[4][0] = new Car("랜드로", 200, 60, 10000);
		car[4][1] = new Car("버스  ", 300, 80, 8000);
		car[4][2] = new Car("트럭  ", 500, 100, 5000);
		
		do {
			printMap(car, x, y);
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
			} else if(num == 5) {
				System.out.println("이름\t거리\t연료\t가격");
				car[x-1][y].carInfo();
				System.out.println();
			}
		} while(num != 9);	
	}

	public static void printMap(Car car[][], int x, int y) {
		for(int i=0; i<car.length; i++) {
			for(int k=0; k<car[i].length; k++) {
				if(x == i && y == k) {
					System.out.print("▲");
				} else if(car[i][k].getName() == null) {
					System.out.print("\t");
				} else {
					System.out.print(car[i][k].getName() + "\t");
				}
			} System.out.println();
		}
	}
	
	public static void printMenu() {
		System.out.println("<자동차 정보>");
		System.out.println("Left(4)  Right(6)  Up(8)  Down(2)  Choice(5)  End(9)");
		System.out.print("선택: ");
	}
}
