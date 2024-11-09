import java.util.Stack;

public class StackDemo{
	public static void main(String[] args) {
		Stack<String> names = new Stack<String>();
		
		names.push("Java");
		names.push("Python");
		names.push("Angular");
		System.out.println(names);
		
		System.out.println(names.peek());
		
		names.pop();
		System.out.println(names);
	}
}
