
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
		System.out.println("������ ����");
	}
	
	void backward() {
		System.out.println("�ڷ� ����");
	}
	
	void moveArm() {
		System.out.println("�� �����̱�");
	}
	
	void printEnergy() {
		System.out.println("������: " + getEnergy());
	}
}
