public class Counter {
	private int n = 0;
	public void increase() {
		synchronized (this) {
			n++;	
		}
		
	}
	public int getCount() {
		return n;
	}
}