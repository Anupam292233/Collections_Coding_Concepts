import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {
public static void main(String[] args) {
	Map<String, Integer> numbers = new HashMap<>();
	numbers.put("One", 1);
	numbers.put("Two", 2);
	numbers.put("Three", 3);
	/*
	 * if(!numbers.containsKey("Two")) { numbers.put("Two", 23); }
	 */
	     
	   // numbers.putIfAbsent("Two", 23);
	     
	    System.out.println(numbers);
	    
	    for(Entry<String, Integer> e:numbers.entrySet()) {
	    	System.out.println(e);
	    	
	    	System.out.println(e.getKey());
	    	System.out.println(e.getValue());
	    	
	    }
}
}
