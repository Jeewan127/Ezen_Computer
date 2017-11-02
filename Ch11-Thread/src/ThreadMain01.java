
public class ThreadMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainTest01 thread = new MainTest01();
		thread.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("main: " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
