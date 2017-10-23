

public class IronMan extends Person {
	
	private int secondEnergy;
	
	public IronMan(int attackPoint, int energy, int secondEnergy, String name) {
		super(attackPoint, energy, name);
		this.secondEnergy = secondEnergy;
	}
	
	public int getSecondEnergy() {
		return secondEnergy;
	}

	public void setSecondEnergy(int secondEnergy) {
		this.secondEnergy = secondEnergy;
	}

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
			System.out.println("죽었습니다.");
			return false;
		} return true;
	}
	
	void Rocket() {
		System.out.println("아이언맨 미사일 발사");
	}
	
	
}
