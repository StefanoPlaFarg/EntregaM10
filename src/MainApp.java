/**
 * 
 */

/**
 * @author stefano
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class MainApp {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<String>();
		List<String> auxList = new ArrayList<String>();
		
		stringList.add("Pau");
		stringList.add("Marc");
		stringList.add("Ari");
		stringList.add("Albert");
		
		
		stringList.forEach(s->{
			if (s.substring(0, 1).equals("A")&& (s.length()==3)) auxList.add(s);}
				
			);
		
		auxList.forEach(s->System.out.println(s));
	
	}
	
	    
	

}


