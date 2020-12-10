
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

		Foo foo = s ->  {
			String p ="";
			for (int i=s.length()-1; i>=0 ;i--) {
				
				p = p + s.charAt(i);
			}
			
			return p;
		};	
		
		System.out.println("Paraula a revertir: paraula");
		System.out.println("El resultat és: " + foo.reverse("paraula"));

	}
	
	
	@FunctionalInterface
	public interface Foo {
		String reverse (String paraula) ;
		
	}

	
}





