
public class BetMan extends Person {
	
	private int secondEnergy;
	
	public BetMan(int attackPoint, int energy, int secondEnergy, String name) {
		super(attackPoint, energy, name);
		this.secondEnergy = secondEnergy;
	}
	
	public int getSecondEnergy() {
		return secondEnergy;
	}

	public void setSecondEnergy(int secondEnergy) {
		this.secondEnergy = secondEnergy;
	}
/*	
	void attack() {
		System.out.println("��Ʈ�� �⺻ ����");
	}
	
	void weaponAttack() {
		System.out.println("��Ʈ�� ���� ����");
	}
	
	void moveArm() {
		System.out.println("��Ʈ�� �� �����̱�");
	}*/
	
	public int getEnergy() {
		return (super.getEnergy() + this.secondEnergy);
	}
	
	public void getDamaged(int attackPoint) {
		if(super.getEnergy() >= attackPoint) {
			super.getDamaged(attackPoint);
		} else {
			int tmpEnergy = attackPoint - super.getEnergy();
			super.getDamaged(super.getEnergy());
			this.secondEnergy -= tmpEnergy;
		}
	}
	
	public boolean isDead() {
		if(this.secondEnergy == 0) {
			System.out.println("�׾����ϴ�.");
			return false;
		} return true;
	}
	
}
