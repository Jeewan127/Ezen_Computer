package Animal;

public class Animal {
	private int hp;
	private String name;
	private String addr;
	
	public Animal() {
		this.name = "name";
		this.hp = 10;
		this.addr = "korea";
	}
	
	public Animal(String name) {
		this.name = name;
		this.hp = 20;
		this.addr = "american";
	}
	
	public Animal(String name, int hp) {
		this(name);
		this.hp = hp;
		this.addr = "japan";
	}
	
	public Animal(String name, int hp, String addr) {
		this(name, hp);
		this.addr = addr;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void move() {
		System.out.println("������");
	}
	
	public void bark() {
		System.out.println("¢��");
	}
	
	public void printInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("ü��: " + hp);
		System.out.println("����: " + addr);
	}
}
