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

		List<Integer> integerList = new ArrayList<Integer>();

		integerList.add(1);
		integerList.add(33);
		integerList.add(4);
		integerList.add(6);
		integerList.add(5);
		integerList.add(25);

		retornaLlista(integerList);

	}

	public static List<String> retornaLlista(List<Integer> integerList) {

		List<Integer> list = integerList;

		List<String> auxList = new ArrayList<String>();

		list.forEach(i -> {
			if (i % 2 == 0)
				auxList.add("o" + String.valueOf(i) + ",");
			else
				auxList.add("e" + String.valueOf(i) + ",");

		}

		);

		auxList.forEach(s -> System.out.println(s));

		return auxList;

	}

}


