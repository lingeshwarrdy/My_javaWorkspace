
class MyMath{
	//Only one thread is allowed to access
	
	//Thread Requires Object level lock
	public synchronized void printMultiTable(int num) {
		for (int i=1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	// Instance Methods
	
	// Synchronized methods will execute along with non Synchronized methods at a time
	
	//Static Synchronized 
	//required class level lock
	
	public static synchronized void printSquare(int num) {         // One Synchronized method execute one time and it wont allow another Synchronized method   
		for (int i=1;i<=10;i++) {
			System.out.println(i*i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	/*public synchronized void printSquare(int num) {         // One Synchronized method execute one time and it wont allow another Synchronized method   
		for (int i=1;i<=10;i++) {
			System.out.println(i*i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}*/
}

class NTR extends Thread{
	MyMath m;
	public NTR(MyMath m) {
		this.m =m;
	}
	@Override
	public void run() {
		m.printMultiTable(10);
	}
	
}
	class Ram extends Thread{
		MyMath m;
		public Ram(MyMath m) {
			this.m =m;
		}
		@Override
		public void run() {
			m.printMultiTable(11);
		}
	
	}
	
	class Abc extends Thread{
		MyMath m;
		public Abc(MyMath m) {
			this.m =m;
		}
		@Override
		public void run() {
			m.printSquare(10);
		}
	
	}
	
	

public class SynchronizationDemo {
	public static void main(String[] args) {
		MyMath m =new MyMath();
		NTR n =new NTR(m);
		Ram R=new Ram(m);
		Abc a=new Abc(m);
		
		n.start();
		R.start();
		a.start();
	}

}
