public class Task implements Runnable{
	public int duration;
	private int id;
	private boolean running;
	
	public Task(int duration, int id) {
		this.duration = duration;
		this.id = id;
		running = true;
	}
	
	public boolean isRunning() {
		return running;
	}
	
	public void run() {
		try {
			Thread.sleep(duration);	
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
		running = false;
	}
	
	public int getId() {
		return id;
	}
	public void setRunning() {
		running = true;
	}
}