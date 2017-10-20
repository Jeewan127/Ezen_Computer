
public class Person {
	
	private int attackPoint;
	
	public int getAttackPoint() {
		return attackPoint;
	}

	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}

	void forward() {
		System.out.println("앞으로 가기");
	}
	
	void backward() {
		System.out.println("뒤로 가기");
	}
	
	void moveArm() {
		System.out.println("팔 움직이기");
	}
}
