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
		System.out.println("물다");
	}
	
	void bark() {
		System.out.println("짖다");
	}
	
	public void printInfo() { 
		System.out.println("짖는 소리 크기: " + this.barkSound);
		System.out.println("기본체력: " + this.hp);
	}

}
