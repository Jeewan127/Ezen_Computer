package Car;

public class Car {
	private String name;
	private int mileage;
	private int fuel;
	private int price;
	private int map = 0;

	public Car(int map) {
		this.map = map;
	}
	
	public Car(String name, int mileage, int fuel, int price) {
		this.name = name;
		this.mileage = mileage;
		this.fuel = fuel;
		this.price = price;
	}
	
	public void carInfo() {
		System.out.println(this.getName() + "\t" + this.getMileage() + "\t" + this.getFuel() + "\t" + this.getPrice());
	}
	
	public int getMap() {
		return map;
	}

	public void setMap(int map) {
		this.map = map;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
