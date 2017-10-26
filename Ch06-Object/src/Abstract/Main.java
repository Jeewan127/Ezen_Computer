package Abstract;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMan superman = new SuperMan();
		BetMan betman = new BetMan();
		
		superman.attack();
		superman.move();
		superman.jump();
		superman.itItem();
		
		System.out.println();
		
		betman.attack();
		betman.move();
		betman.jump();
		betman.itItem();
	}

}
