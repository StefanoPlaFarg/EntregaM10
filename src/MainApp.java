
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

		List<String> stringList = Arrays.asList("gener", "febrer", "mar�", "abril", "maig", "juny", "juliol", "agost", "setembre", "octubre", "novembre", "desembre");
		System.out.println("Llista de mesos de l'any: " + stringList);

		System.out.println("Execuci� programa.");
		stringList.forEach(s -> System.out.println(s));
		
		

	}

	
}





