import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
 * HashMap
 * Data will be added based on hashcode of keys
 * duplicate key with new value is allowed
 */
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String>hm =new HashMap<Integer, String>();
		hm.put(1001, "sai@gmail.com");
		hm.put(1003, "abc@gmail.com");
		hm.put(1004, "sms@gmail.com");
		hm.put(1002, "lr@gmail.com");
		
		System.out.println(hm);
		
		hm.put(1002, "ps123@gmail.com");
		System.out.println(hm);
		//hm.keySet();
		System.out.println(hm.keySet());
		
		Set<Integer> keys =hm.keySet(); // to print keys
		System.out.println(keys);
		
		Collection<String> values =hm.values(); //to print values
		System.out.println(values);
		
		for(Map.Entry<Integer,String>entry : hm.entrySet()) {
			System.out.println(entry);
			System.out.println(entry.getKey()+"---------"+entry.getValue());
		}
		
	}

}
//entry is nested interface inside map interface