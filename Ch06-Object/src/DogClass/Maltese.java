package DogClass;

public class Maltese extends Dog{

	public Maltese(int hp, int barkSound) {
		super(hp, barkSound);
	}
	
	@Override
	void bark() {
		System.out.println("��Ƽ��� ¢�� �Ҹ��� �ٸ���.");
	}
}
