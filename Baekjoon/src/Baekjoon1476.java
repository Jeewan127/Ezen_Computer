import java.util.Scanner;

public class Baekjoon1476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a=1, b=1, c=1;
		boolean run = true;
		int E, S, M;
		
		System.out.print("ют╥б");
		E = sc.nextInt();
		S = sc.nextInt();
		M = sc.nextInt();

		while(run) {
			int earth = E+(15*(a-1));
			int sun = S+(28*(b-1));
			int moon = M+(19*(c-1));
			
			if(earth == sun && earth == moon && sun == moon) {
				System.out.println(earth);
				run = false;
			} /*else if(a == b && a == c && b == c) {
				a++;
			} else if(a != b && a != c && b == c) {
				c++;
			} else if(a != b && a == c && b != c) {
				a++;
			} else if(a != b && a != c && b != c) {
				b++;
			}*/
			a = first(a, b, c);
			c = second(a, b, c);
			a = third(a, b, c);
			b = fourth(a, b, c);
		}
	}
	public static int first(int a, int b, int c) {
		if(a == b && a == c && b == c) {
			a++;
		}
		return a;
	}
	public static int second(int a, int b, int c) {
		if(a != b && a != c && b == c) {
			c++;
		}
		return c;
	}
	public static int third(int a, int b, int c) {
		if(a != b && a == c && b != c) {
			a++;
		}
		return a;
	}
	public static int fourth(int a, int b, int c) {
		if(a != b && a != c && b != c) {
			b++;
		}
		return b;
	}
}
