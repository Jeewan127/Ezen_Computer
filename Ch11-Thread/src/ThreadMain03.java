
public class ThreadMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainTest03 accountTeset = new MainTest03();
		
		Thread t1 = new Thread(accountTeset);
		Thread t2 = new Thread(accountTeset);
		
		System.out.println("t1����");
		t1.start();
		System.out.println("t2����");
		t2.start();
	}

}
