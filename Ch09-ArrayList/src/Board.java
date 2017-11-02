
public class Board {
	private int number;
	private String name;
	private String content;
	

	
	public Board(int number, String name, String content) {
		super();
		this.number = number;
		this.name = name;
		this.content = content;
	}
	
	public void printInfo1() {
		System.out.println(this.number + "\t" + this.name);
	}
	
	public void printInfo2() {
		System.out.println("제목: " + this.name);
		System.out.println("내용: " + this.content);
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
