
public class Person {
	
	private int attackPoint;
	
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
}
