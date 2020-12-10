
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

		Foo foo = () ->  3.1415;				
		System.out.println(foo.getPiValue());

	}
	
	
	@FunctionalInterface
	public interface Foo {
		double getPiValue () ;
		
	}

	
}





