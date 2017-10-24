package Animal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elephant element = new Elephant();
		Bird bird = new Bird();
		Cat cat = new Cat("°í¾çÀÌ", 30, "japan");
		
		System.out.println("");
		
		element.printInfo();
		System.out.println();
		bird.printInfo();
		System.out.println();
		cat.printInfo();
	
	}
}
