
public class Person {
	
	private int attackPoint;	// ���ݷ�
	private int energy;		// �⺻������
	private String name;	// �����̸�
	private int damaged;	// ����
	
	public int getDamaged() {
		return damaged;
	}

	public void setDamaged(int damaged) {
		this.damaged = damaged;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int attackPoint, int energy, String name) {
//		this.energy = energy;
		this.attackPoint = attackPoint;
		this.energy = energy;
		this.name = name;
	}
	
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
	
	void attack() {
		System.out.println("�⺻ ����");
	}
	
	void attackPoint() {
		System.out.println("���ݷ�: " + getAttackPoint());
	}
	
	void printEnergy() {
		System.out.println("������: " + getEnergy());
	}
	
	public void getDamaged(int attackPoint) {
		this.energy -= attackPoint;
	}
	
	public boolean isDead() {
		if(this.energy== 0) {
			System.out.println("�׾����ϴ�.");
			return false;
		} return true;
	}
	
}
