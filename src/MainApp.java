
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
import java.util.stream.Collectors;



import java.util.Collections;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1, 33, 4, 5, 25, 43);
		System.out.println("Llista de valors: " + integerList);
		
		System.out.println("Execució programa amb Lambdas. Llista de valors filtrats:");
		Test testLambdas = i -> i % 2 == 0;
		retornaLlistaStringsLambda(integerList, testLambdas);

		System.out.println("Execució programa amb Streams i Lambdas. Llista de valors filtrats:");
		Test testStreams = i -> i % 2 == 0;
		retornaLlistaStringsStreams(integerList, testStreams);
		
	}
   
	public static List<String> retornaLlistaStringsStreams(List<Integer> integerList, Test testStreams) {

		List<String> filteredList = new ArrayList<String>();

		integerList.stream().forEach(i -> {
			if (testStreams.applyTest(i))
				filteredList.add("o" + String.valueOf(i) + ",");
			else
				filteredList.add("e" + String.valueOf(i) + ",");

		});
         
		filteredList.forEach(s -> System.out.println(s));
		
		return filteredList;

	}
	
	
	public static List<String> retornaLlistaStringsLambda(List<Integer> integerList, Test testLambdas) {

		List<String> auxList = new ArrayList<String>();

		integerList.forEach(i -> {
			if (testLambdas.applyTest(i))
				auxList.add("o" + String.valueOf(i) + ",");
			else
				auxList.add("e" + String.valueOf(i) + ",");

		}

		);

		auxList.forEach(s -> System.out.println(s));

		return auxList;

	}

	@FunctionalInterface
	public interface Test {
		boolean applyTest(Integer value);
	}

}


