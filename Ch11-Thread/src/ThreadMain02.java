import java.util.Scanner;

public class ThreadMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=0;
		
		MainTest02 timeCheck = new MainTest02();
		timeCheck.start();
		
		while(true) {
			num = sc.nextInt();
			timeCheck.setI(10);
		}
	}

}
