
public class Account {
	int balance = 1000;
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			balance -= money;
		}
	}
}
