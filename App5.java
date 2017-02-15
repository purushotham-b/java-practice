package multithreading;

public class App5 {
	private int count = 0;
	
	private synchronized void increment() {
		count++;
	}
	
	public void run() {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});
		
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});
		
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Count is " + count);
	}
	
	public static void main(String[] args) {
		new App5().run();
	}
}
