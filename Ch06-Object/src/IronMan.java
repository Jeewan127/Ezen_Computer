
public class IronMan extends Person {
	
	private int secondEnergy;
	private int energySum=0;
	
	public int getSecondEnergy() {
		return secondEnergy;
	}

	public void setSecondEnergy(int secondEnergy) {
		this.secondEnergy = secondEnergy;
	}

	void printEnergy() {
		energySum = getEnergy() + getSecondEnergy();
		System.out.println("������: " + energySum);
	}
	
	void Rocket() {
		System.out.println("���̾�� �̻��� �߻�");
		System.out.println("���ݷ�: " + getAttackPoint());
	}
}
