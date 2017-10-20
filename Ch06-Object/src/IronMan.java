
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
		System.out.println("에너지: " + energySum);
	}
	
	void Rocket() {
		System.out.println("아이언맨 미사일 발사");
		System.out.println("공격력: " + getAttackPoint());
	}
}
