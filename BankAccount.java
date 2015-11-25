public class BankAccount {
	private int balance = 0;
	private static final Object obj = new Object();
	
	public int getBalance() {
		return balance;
	}
	public synchronized void deposit(int money) {
		balance = balance + money;
	}
	public int retrieve(int money) {
		int result = 0;
		if (balance > money) {
			result = money;
		} else {
			result = balance;
		}
		
		synchronized (obj) {
			balance = balance - result;
		}
			
		return result;
	}
}