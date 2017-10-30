package Book2;

public class Book {
	private int number;
	private String name;
	private int price;
	
	public Book(int number, String name, int price) {
		this.number = number;
		this.name = name;
		this.price = price;
	}
	
	public void bookInfo() {
		System.out.println(this.getNumber() + "\t" + this.getName() + "\t" + this.getPrice());
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
