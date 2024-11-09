
class BahubaliThread extends Thread{
	int total =0;
	@Override
	public void run() {
		System.out.println(" 2.BahubaliThread begins calculation.");
		for (int i=1;i<=100;i++) {
			total +=i;
		}
		System.out.println(" 3.BahubaliThread gives notification.");
		synchronized (this) {
			
			this.notify();
		}
	}
	
	
}

public class InterThreadCommunication {
	public static void main(String[] args) throws InterruptedException {
		BahubaliThread b = new BahubaliThread();
		b.start();
		
		//Thread.sleep(0);
		//main thread
		System.out.println(" 1.Main Thread calling wait. ");
		synchronized (b) {
			b.wait();
		}
		System.out.println(" 4.Main Thread gets notification.");
		System.out.println(b.total);
	}

}
