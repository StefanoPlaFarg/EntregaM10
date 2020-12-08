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
		
		
		stringList.add("Pau");
		stringList.add("Marc");
		stringList.add("Ari");
		stringList.add("Albert");
		stringList.add("Ash");
		stringList.add("Ara");
		stringList.add("Oriol");
		stringList.add("Joan");
		
		retornaLlistaStrings(stringList);
		
		
		
	
	}
	
	public static List<String> retornaLlistaStrings(List<String> stringList) {

		List<String> list = stringList;

		List<String> auxList = new ArrayList<String>();

		list.forEach(s -> {
			if (s.contains("o") )
				auxList.add(s);
		}

		);

		auxList.forEach(s -> System.out.println(s));

		return auxList;

	}
	

}


