package Animal;

public class Elephant extends Animal {

	public Elephant() {
		super.setName("�ڳ���");
	}
	public Elephant(String name) {
		super(name);
	}
	public Elephant(String name, int hp) {
		super(name, hp);
	}
	public Elephant(String name, int hp, String addr) {
		super(name, hp, addr);
	}
	
	/*@Override
	public void printInfo() {
		System.out.println("�̸�: " + super.getName());
	}*/

}
