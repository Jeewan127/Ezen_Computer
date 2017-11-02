
public class Book {
	private int number;
	private String name;
	private int price;
	private String publisher;
	
	
	public Book(int number, String name, int price, String publisher) {
		this.number = number;
		this.name = name;
		this.price = price;
		this.publisher = publisher;
	}
	
	public void printInfo() {
		System.out.println(this.number + "\t" + this.name + "\t" + this.price + "\t" + this.publisher);
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
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
