package DogClass;

public class Maltese extends Dog{

	public Maltese(int hp, int barkSound) {
		super(hp, barkSound);
	}
	
	@Override
	void bark() {
		System.out.println("말티즈는 짖는 소리가 다르다.");
	}
}
