import java.util.Scanner;

public class ObjectMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		BetMan betman = new BetMan();
		SuperMan superman = new SuperMan();
		IronMan ironman = new IronMan();
		
		betman.setAttackPoint(50);
		superman.setAttackPoint(100);
		ironman.setAttackPoint(150);
		
		System.out.print("��Ʈ�� ������ �Է�: ");
		int betmanEnergy = sc.nextInt();
		betman.setEnergy(betmanEnergy);
		
		System.out.print("���۸� ������ �Է�: ");
		int supermanEnergy = sc.nextInt();
		superman.setEnergy(supermanEnergy);
		
		System.out.print("���̾�� ������ �Է�: ");
		int ironmanEnergy = sc.nextInt();
		ironman.setEnergy(ironmanEnergy);
		
		System.out.print("���̾�� ���� ������ �Է�: ");
		int ironmanSecondEnergy = sc.nextInt();
		ironman.setSecondEnergy(ironmanSecondEnergy);
		
		superman.forward();
		superman.backward();
		superman.moveArm();
		superman.flySky();
		superman.laserAttack();
		superman.printEnergy();
		System.out.println();
		
		betman.forward();
		betman.backward();
		betman.moveArm();
		betman.weaponAttack();
		betman.printEnergy();
		
		System.out.println();
		
		ironman.forward();
		ironman.backward();
		ironman.moveArm();
		ironman.Rocket();
		ironman.printEnergy();
	}

}
