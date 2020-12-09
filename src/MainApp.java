/**
 * 
 */

/**
 * @author stefano
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import java.util.Collections;


public class MainApp {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("peter", "anna", "mike","Oriol","Joan", "xenia", "Ari", "Ash", "Ara");
		System.out.println("Llista de noms: " + stringList);
		
		System.out.println("Execució programa amb Lambdas. Llista de noms filtrats:");
		Test testLambdas = s -> s.contains("o");
		retornaLlistaStringsLambda(stringList, testLambdas);
		
		
				
		
		
	
	}
	
	public static List<String> retornaLlistaStringsLambda(List<String> stringList, Test test) {

				List<String> auxList = new ArrayList<String>();

		stringList.forEach(s -> {
			if (s.contains("o") )
				auxList.add(s);
		}

		);

		auxList.forEach(s -> System.out.println(s));

		return auxList;

	}
	
	@FunctionalInterface
	public interface Test {
		boolean applyTest(String paraula);
	}

}


