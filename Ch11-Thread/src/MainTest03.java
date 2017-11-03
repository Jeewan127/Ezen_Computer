
public class MainTest03 implements Runnable {

	Account acc= new Account();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(acc.balance > 0) {
			int money = (int)(Math.random()*3+1) *100;
			acc.withdraw(money);
			System.out.println("남은 금액: " + acc.balance);
		}
	}

}
