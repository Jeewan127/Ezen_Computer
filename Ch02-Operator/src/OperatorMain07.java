
public class OperatorMain07 {

	public static void main(String[] args) {
		boolean a;
		boolean b;
		boolean c;
		
		a = true;
		b = true;
		
		c = a && b;
		System.out.println("c = " + c);
		c = a || b;
		System.out.println("c = " + c);
		System.out.println();
		
		a = true;
		b = false;
		
		c = a && b;
		System.out.println("c = " + c);
		c = a || b;
		System.out.println("c = " + c);
		System.out.println();
		
		a = false;
		b = true;
		
		c = a && b;
		System.out.println("c = " + c);
		c = a || b;
		System.out.println("c = " + c);
		System.out.println();
		
		a = false;
		b = false;
		
		c = a && b;
		System.out.println("c = " + c);
		c = a || b;
		System.out.println("c = " + c);
		System.out.println();
	}

}
