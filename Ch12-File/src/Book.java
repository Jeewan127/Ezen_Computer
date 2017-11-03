
public class Book {
	private int number;
	private String name;
	private int price;
		
	public Book(int number, String name, int price) {
		this.number = number;
		this.name = name;
		this.price = price;
	}
	
	public String saveData() {
		return this.number + "," + this.name + "," + this.price + "\n";
	}
	
	public void printBookInfo() {
		System.out.println(this.number + " " + this.name + " " + this.price);
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
