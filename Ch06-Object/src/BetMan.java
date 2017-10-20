
public class BetMan extends Person {
	
	void printEnergy() {
		System.out.println("에너지: " + getEnergy());
	}
	
	void weaponAttack() {
		System.out.println("배트맨 무기 공격");
		System.out.println("공격력: " + getAttackPoint());
	}
	
	void moveArm() {
		System.out.println("배트맨 팔 움직이기");
	}
	
	
}
