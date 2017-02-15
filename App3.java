package multithreading;

public class App3 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
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
		});
		t1.start();
	}

}
