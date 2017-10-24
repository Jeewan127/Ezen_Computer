package Animal;

public class Elephant extends Animal {

	public Elephant() {
		super.setName("코끼리");
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
		System.out.println("이름: " + super.getName());
	}*/

}
