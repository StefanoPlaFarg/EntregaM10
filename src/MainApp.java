import java.util.ArrayList;
import java.util.List;
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

		Test test = s -> s.substring(0, 1).equals("A") && (s.length() == 3);

		retornaLlistaStrings(stringList, test);

	}

	public static List<String> retornaLlistaStrings(List<String> stringList, Test test) {

		List<String> auxList = new ArrayList<String>();

		stringList.forEach(s -> {
			if (test.applyTest(s))
				auxList.add(s);
		});
		auxList.forEach(s -> System.out.println(s));
		return auxList;

		// if (s.substring(0, 1).equals("A") && (s.length() == 3))
		// auxList.add(s);
		// }

		// );

	}

	@FunctionalInterface
	public interface Test {
		boolean applyTest(String paraula);
	}

}

