package Abstract;

public class BetMan extends Person{

	@Override
	public void attack() {
		System.out.println("��Ʈ�� ����");
	}

	@Override
	public void move() {
		System.out.println("��Ʈ�� �̵�");
	}

	@Override
	public void jump() {
		System.out.println("��Ʈ�� ����");
	}

	@Override
	public void itItem() {
		System.out.println("��Ʈ�� ������");
	}

}
