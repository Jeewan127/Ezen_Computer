package Abstract;

public class BetMan extends Person{

	@Override
	public void attack() {
		System.out.println("베트맨 공격");
	}

	@Override
	public void move() {
		System.out.println("베트맨 이동");
	}

	@Override
	public void jump() {
		System.out.println("베트맨 점프");
	}

	@Override
	public void itItem() {
		System.out.println("베트맨 아이템");
	}

}
