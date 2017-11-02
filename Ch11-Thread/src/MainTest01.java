
public class MainTest01 extends Thread{
	@Override
	public void run() {
		super.run();
		
		for(int i=0; i<20; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
