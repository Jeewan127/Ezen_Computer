import java.util.Scanner;

/*
 	�ڵ��� ������ ���� ��ü�� �����
 	���ᷮ, ����Ÿ�
 	
 	����, ���� ����� �ִ�
 	���� or ������ �Ҷ� ���ᰡ 10�� �پ���
 	���� �ڵ����� ���¸� �����ִ� �޼���
 	
 	���ᰡ ������ ���ᰡ ���ٴ� ������ ���
 	���ᰡ ������ ���� or ���� �ߴٴ� ������ ���
 	���� or ������ �ϸ� ����Ÿ��� 10�� �ö󰣴�.
 	
 	����ڰ� 0�� �Է��ϸ� ��������� 
 	1�� �Է��ϸ� ��������� ����
 	2�� �Է��ϸ� ���� �ڵ����� ���¸� ������ִ� ���α׷��� �ۼ�
 */

class CarInformation {
	int fuel=0; // ����
	int mile=0; // ����Ÿ�
	
	public void goCarPosition(int carPosition) {
		if(fuel==0) {
			System.out.println("���ᰡ �����ϴ�.");
		} else {
			mile = mile + 10;
			fuel = fuel - 10;
		}
	}
	
	public void backCarPosition(int carPosition) {
		if(mile == 0 || fuel == 0) {
			System.out.println("�� �� �����ϴ�.");
		} else {
			mile = mile - 10;
			fuel = fuel - 10;
		}
	}
	
	public void addFuel(int addFuel) {
		fuel = fuel + addFuel;
	}
	
	public void printCar() {
		System.out.println("����: " + fuel);
		System.out.println("����Ÿ�: " + mile);
	}
}
public class ObjectEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CarInformation car = new CarInformation();
		boolean run = true;
		System.out.print("���Ḧ �����ϼ���: ");
		int fuel = sc.nextInt();
		car.fuel = fuel;
		
		do {
			printMenu();
			System.out.println();
			System.out.print("���� �Է�: ");
			int num = sc.nextInt();
			
			if(num == 0) {
				System.out.println("����");
				car.goCarPosition(num);
			} else if(num == 1) {
				System.out.println("����");
				car.backCarPosition(num);
			} else if(num == 2) {
				car.printCar();
			} else if(num == 3) {
				System.out.print("���� ����: ");
				int fuelPlus = sc.nextInt();
				car.addFuel(fuelPlus);
			} else if(num == 4) {
				System.out.println("��������");
				run = false;
			}
		} while(run);
		
	}
	public static void printMenu() {
		System.out.println("----------------------------------------------------");
		System.out.println("0: ����\t1: ����\t2: ����\t3: ������� 4: ��������");
		System.out.println("----------------------------------------------------");
	}
}
