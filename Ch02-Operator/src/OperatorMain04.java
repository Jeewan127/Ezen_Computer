
public class OperatorMain04 {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int c = 0;
		
		c = ++a + b;
		System.out.println("c = " + c + " a = " + a);
		
		a = 5;
		c = a++ + b;
		System.out.println("c = " + c + " a = " + a);
	}
}