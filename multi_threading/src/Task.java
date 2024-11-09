
class YellowThread extends Thread{
	@Override
	public void run() {
		for (int i=1;i<=4;i++) {
			System.out.println("Yellow");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class redThread extends Thread{
	@Override
	public void run() {
		for (int i=1;i<=4;i++) {
			System.out.println("Red");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class greenThread extends Thread{
	@Override
	public void run() {
		for (int i=1;i<=4;i++) {
			System.out.println("Green");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
} 

public  class Task{
	public static void main(String[] args) throws InterruptedException {
		while(true) {
			
			YellowThread y= new YellowThread();
			y.start();
			y.join();
		
			redThread r= new redThread();
			  r.start();
			  r.join();
			  greenThread g =new greenThread();
					g.start();
					g.join();
			
		}		
	}
}