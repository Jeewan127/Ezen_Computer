
public class Person {
	
	private int attackPoint;	// 공격력
	private int energy;		// 기본에너지
	private String name;	// 영웅이름
	private int damaged;	// 공격
	
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
		System.out.println("앞으로 가기");
	}
	
	void backward() {
		System.out.println("뒤로 가기");
	}
	
	void moveArm() {
		System.out.println("팔 움직이기");
	}
	
	void attack() {
		System.out.println("기본 공격");
	}
	
	void attackPoint() {
		System.out.println("공격력: " + getAttackPoint());
	}
	
	void printEnergy() {
		System.out.println("에너지: " + getEnergy());
	}
	
	public void getDamaged(int attackPoint) {
		this.energy -= attackPoint;
	}
	
	public boolean isDead() {
		if(this.energy== 0) {
			System.out.println("죽었습니다.");
			return false;
		} return true;
	}
	
}
