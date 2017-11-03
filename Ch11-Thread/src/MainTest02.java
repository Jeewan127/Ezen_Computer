
public class MainTest02 extends Thread{
	private int i;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(i=10; i>0; i--) {
			System.out.println(i + "초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();	// 에러의 내용을 콘솔에 뿌려라
			}
		}
		System.out.println("10동안 입력이 없어 종료합니다.");
		System.exit(0); // 프로그램 자동 종료
	}
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	
	
}
