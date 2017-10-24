package DogClass;

public class Main {

	public static void main(String[] args) {
		
		Yorkshire yorkshire = new Yorkshire(100, 10);
		ShihTzu shihtzu = new ShihTzu(60, 20);
		Maltese maltese = new Maltese(80, 30);
		
		yorkshire.bark();
		yorkshire.bite();
		yorkshire.run();
		yorkshire.printInfo();
		
		System.out.println();
		
		shihtzu.bark();
		shihtzu.bite();
		shihtzu.jump();
		shihtzu.printInfo();
		
		System.out.println();
		
		maltese.bark();
		maltese.bite();
		maltese.printInfo();
	}

}
