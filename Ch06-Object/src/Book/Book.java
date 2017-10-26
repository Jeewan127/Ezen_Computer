package Book;

public class Book {
	private int number;
	private String name;
	private int price;
	private int move=0;
	
	public int getMove() {
		return move;
	}

	public void setMove(int move) {
		this.move = move;
	}

	public Book() {
		
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
