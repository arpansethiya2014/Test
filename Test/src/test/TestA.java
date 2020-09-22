package test;
import java.util.concurrent.*;
public class TestA {

	 public static void main(String[] args) {
		 ConcurrentHashMap m = new ConcurrentHashMap(); 
	        m.put(100, "Hello"); 
	        m.put(101, "Geeks"); 
	        m.put(102, "Geeks");
		
		System.out.println("Before : " + m);
    	
		m.putIfAbsent(101, "Hello"); 
		  
        m.remove(101, "Geeks"); 
  
        m.putIfAbsent(103, "Hello"); 
  
        m.replace(101, "Hello", "For"); 
        System.out.println(" After : " + m);
    	
    	
		
	}
	
}
