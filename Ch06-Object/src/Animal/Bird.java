package Animal;

public class Bird extends Animal {

	public Bird() {
		super.setName("��");
	}
	public Bird(String name) {
		super(name);
	}
	public Bird(String name, int hp) {
		super(name, hp);
	}
	public Bird(String name, int hp, String addr) {
		super(name, hp, addr);
	}

	/*@Override
	public void printInfo() {
		System.out.println("�̸�: " + super.getName());
		System.out.println("ü��: " + super.getHp());
	}*/
}
