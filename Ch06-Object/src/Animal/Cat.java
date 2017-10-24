package Animal;

public class Cat extends Animal {

	public Cat() {
		super.setName("°í¾çÀÌ");
	}
	public Cat(String name) {
		super(name);
	}
	public Cat(String name, int hp) {
		super(name, hp);
	}
	public Cat(String name, int hp, String addr) {
		super(name, hp, addr);
	}
}
