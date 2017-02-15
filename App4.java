package multithreading;

import java.util.Scanner;

class Processor extends Thread {
	private volatile boolean running = true;
	
	public void run() {
		while(running) {
			System.out.println("Running");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown() {
		running = false;
	}
}

public class App4 {

	public static void main(String[] args) {
		Processor p = new Processor();
		p.start();
		
		Scanner input = new Scanner(System.in);
		input.nextLine();
		p.shutdown();
	}

}
