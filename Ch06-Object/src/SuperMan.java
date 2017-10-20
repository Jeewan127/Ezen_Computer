
public class SuperMan extends Person {
	
	void printEnergy() {
		System.out.println("에너지: " + getEnergy());
	}
	
	void flySky() {
		System.out.println("슈퍼맨 하늘 날기");
	}
	
	void laserAttack() {
		System.out.println("슈퍼맨 레이저 공격");
		System.out.println("공격력: " + getAttackPoint());
	}
}
