
public class Person {
	
	private int attackPoint;
	private int energy;
	
	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

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
	
	void printEnergy() {
		System.out.println("에너지: " + getEnergy());
	}
}
