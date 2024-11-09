import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> q =new PriorityQueue<String>();
		q.offer("Java");
		q.offer("Python");
		q.offer("Angular");
		q.offer("Hibernate");
		q.offer("Spring");
		System.out.println(q);
		
		q.poll();
		System.out.println(q);
		
		ArrayDeque<Integer>dq =new ArrayDeque<Integer>();
		dq.add(100);
		dq.add(200);
		System.out.println(dq);
		
		dq.addFirst(111);
		dq.addLast(156);
		System.out.println(dq);
		
		dq.push(101);
		dq.push(102);
		System.out.println(dq);
		
		dq.pop();
		System.out.println(dq);
		
	}

}
