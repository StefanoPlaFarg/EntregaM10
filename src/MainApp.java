import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

/**
 * 
 */

/**
 * @author stefano
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("peter", "anna", "mike", "xenia", "Ari", "Ash", "Ara");
		System.out.println("Llista de noms: " + stringList);

		System.out.println("Execució programa amb Lambdas. Llista de noms filtrats:");
		Test testLambdas = s -> s.substring(0, 1).equals("A") && (s.length() == 3);
		retornaLlistaStringsLambda(stringList, testLambdas);

		System.out.println("Execució programa amb Streams i Lambdas. Llista de noms filtrats:");
		Test testStreams = s -> s.substring(0, 1).equals("A") && (s.length() == 3);
		retornaLlistaStringsStreams(stringList, testStreams);


	}

	public static List<String> retornaLlistaStringsStreams(List<String> stringList, Test testStreams) {

		List<String> filteredList = stringList.stream().filter(s -> testStreams.applyTest(s))

				.map(s -> {
					System.out.println(s);
					return s;
				})

				.collect(Collectors.toList());

		return filteredList;

	}

	public static List<String> retornaLlistaStringsLambda(List<String> stringList, Test test) {

		List<String> auxList = new ArrayList<String>();

		stringList.forEach(s -> {
			if (test.applyTest(s))
				auxList.add(s);
		});
		auxList.forEach(s -> System.out.println(s));
		return auxList;


	}

	@FunctionalInterface
	public interface Test {
		boolean applyTest(String paraula);
	}

}
