
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

		List<Integer> integerList = Arrays.asList(1, 33, 4, 5, 25, 43);
		System.out.println("Llista de valors: " + integerList);
		Test testLambdas = i -> i % 2 == 0;

		retornaLlistaEntersLambda(integerList, testLambdas);

	}

	public static List<String> retornaLlistaEntersLambda(List<Integer> integerList, Test testLambdas) {

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


