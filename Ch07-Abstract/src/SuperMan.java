

public class SuperMan extends Person {

	@Override
	public void attack() {
		System.out.println("슈퍼맨 공격");
	}

	@Override
	public void move() {
		System.out.println("슈퍼맨 이동");
	}

	@Override
	public void jump() {
		System.out.println("슈퍼맨 점프");
	}

	@Override
	public void itItem() {
		System.out.println("슈퍼맨 아이템");
	}

}
