
public class MainTest02 extends Thread{
	private int i;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(i=10; i>0; i--) {
			System.out.println(i + "��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();	// ������ ������ �ֿܼ� �ѷ���
			}
		}
		System.out.println("10���� �Է��� ���� �����մϴ�.");
		System.exit(0); // ���α׷� �ڵ� ����
	}
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	
	
}
