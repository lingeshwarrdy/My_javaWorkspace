class Programming{
	
}
//1.Using Thread class
class JavaThread extends Thread{
	@Override
	public void run() {
		for (int i=1;i<=10;i++) {
			System.out.println("Java");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

// 2.Using Runnable interface 
class PythonThread extends Programming implements Runnable{
	@Override
	public void run() {
		for (int i=1;i<=10;i++) {
			System.out.println("Python");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class AngularThread extends Thread{
	
 @Override
	public void run() {
		for (int i=1;i<=10;i++) {
			System.out.println("Angular");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
	
			}}
}
public class Test {
	public static void main(String[] args) throws InterruptedException {
		JavaThread j =new JavaThread();
		j.start(); // To begin user defined thread
		//j.start() exception will occur
		j.run(); //new thread won't be created, executed like a normal method
		j.join();
		
		//main thread
		
		PythonThread p =new PythonThread();
		//p.start();
		Thread t =new Thread(p);  // Thread class object
		t.start();
		t.join();
		
		AngularThread a =new AngularThread();
		a.start();
			for (int i=1;i<=10;i++) {
				System.out.println(" main ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}

}}

// runnable interface is most prefer for thread
