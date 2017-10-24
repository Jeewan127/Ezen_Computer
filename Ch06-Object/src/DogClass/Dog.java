package DogClass;

public class Dog {
	private int hp;
	private int barkSound;
	
	public Dog(int hp, int barkSound) {
		this.hp = hp;
		this.barkSound = barkSound;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getBarkSound() {
		return barkSound;
	}
	public void setBarkSound(int barkSound) {
		this.barkSound = barkSound;
	}	
	
	void bite() {
		System.out.println("����");
	}
	
	void bark() {
		System.out.println("¢��");
	}
	
	public void printInfo() { 
		System.out.println("¢�� �Ҹ� ũ��: " + this.barkSound);
		System.out.println("�⺻ü��: " + this.hp);
	}

}
