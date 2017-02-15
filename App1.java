package multithreading;

class Runner extends Thread {
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
public class App1 {

	public static void main(String[] args) {
		Runner r1 = new Runner();
		r1.start();
		
		Runner r2 = new Runner();
		r2.start();
	}

}
