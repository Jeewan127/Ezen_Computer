
public class ObjectMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BetMan betman = new BetMan();
		SuperMan superman = new SuperMan();
		IronMan ironman = new IronMan();
		
		betman.setAttackPoint(50);
		superman.setAttackPoint(100);
		ironman.setAttackPoint(150);
		
		
		superman.forward();
		superman.backward();
		superman.moveArm();
		superman.flySky();
		superman.laserAttack();
		
		System.out.println();
		
		betman.forward();
		betman.backward();
		betman.moveArm();
		betman.weaponAttack();
		
		
		System.out.println();
		
		ironman.forward();
		ironman.backward();
		ironman.moveArm();
		ironman.Rocket();
	}

}
