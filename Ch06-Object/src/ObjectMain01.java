class Car {
		int fuel;
		int mileage;
		
		public void printCarInfo() {
			System.out.println("���� ����: " + fuel);
			System.out.println("���� �Ÿ�: " + mileage);
		}
		
		public void addFuel(int addFuel) {
			fuel += addFuel;
		}
		
		public int getMileage() {
			return mileage;
		}
	}

public class ObjectMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		car.fuel = 100;
		car.mileage = 15000;
		car.printCarInfo();
		car.addFuel(200);
		car.printCarInfo();
		
		int mile = car.getMileage();
		System.out.println(mile);
	}
}
