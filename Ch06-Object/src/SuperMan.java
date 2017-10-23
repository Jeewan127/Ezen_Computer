
public class SuperMan extends Person {
	
	public SuperMan(int attackPoint, int energy, String name) {
		super(attackPoint, energy, name);
	}
	
	void attack() {
		System.out.println("슈퍼맨 기본 공격");
	} 
	
	void flySky() {
		System.out.println("슈퍼맨 하늘 날기");
	}
	
	void laserAttack() {
		System.out.println("슈퍼맨 레이저 공격");
	}
	
	
}
