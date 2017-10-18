import java.util.Scanner;

/*
 	자동차 정보를 가진 객체를 만들기
 	연료량, 주행거리
 	
 	전진, 후진 기능이 있다
 	전진 or 후진을 할때 연료가 10씩 줄어든다
 	현재 자동차의 상태를 보여주는 메서드
 	
 	연료가 없으면 연료가 없다는 내용을 출력
 	연료가 있으면 전진 or 후진 했다는 내용을 출력
 	전진 or 후진을 하면 주행거리도 10씩 올라간다.
 	
 	사용자가 0을 입력하면 전진기능을 
 	1을 입력하면 후진기능을 수행
 	2를 입력하면 현재 자동차의 상태를 출력해주는 프로그램을 작성
 */

class CarInformation {
	int fuel=0; // 연료
	int mile=0; // 주행거리
	
	public void goCarPosition(int carPosition) {
		if(fuel==0) {
			System.out.println("연료가 없습니다.");
		} else {
			mile = mile + 10;
			fuel = fuel - 10;
		}
	}
	
	public void backCarPosition(int carPosition) {
		if(mile == 0 || fuel == 0) {
			System.out.println("갈 수 없습니다.");
		} else {
			mile = mile - 10;
			fuel = fuel - 10;
		}
	}
	
	public void addFuel(int addFuel) {
		fuel = fuel + addFuel;
	}
	
	public void printCar() {
		System.out.println("연료: " + fuel);
		System.out.println("주행거리: " + mile);
	}
}
public class ObjectEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CarInformation car = new CarInformation();
		boolean run = true;
		System.out.print("연료를 주입하세요: ");
		int fuel = sc.nextInt();
		car.fuel = fuel;
		
		do {
			printMenu();
			System.out.println();
			System.out.print("숫자 입력: ");
			int num = sc.nextInt();
			
			if(num == 0) {
				System.out.println("전진");
				car.goCarPosition(num);
			} else if(num == 1) {
				System.out.println("후진");
				car.backCarPosition(num);
			} else if(num == 2) {
				car.printCar();
			} else if(num == 3) {
				System.out.print("연료 주입: ");
				int fuelPlus = sc.nextInt();
				car.addFuel(fuelPlus);
			} else if(num == 4) {
				System.out.println("운행종료");
				run = false;
			}
		} while(run);
		
	}
	public static void printMenu() {
		System.out.println("----------------------------------------------------");
		System.out.println("0: 전진\t1: 후진\t2: 상태\t3: 연료공급 4: 운행종료");
		System.out.println("----------------------------------------------------");
	}
}
