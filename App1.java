package multithreading;

class Runner2 implements Runnable {
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("i value: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class App2 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runner());
		t1.start();
		
		Thread t2 = new Thread(new Runner());
		t2.start();

	}

}
