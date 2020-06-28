package practice_11062020;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map<Integer, String> test = new HashMap<Integer, String>();
		// python dict
		test.put(55, "dsadas");
		// dict[55]="dsadas" in Python
		System.out.println(test);
		test.keySet();
		System.out.println(test.get(55));

	}

}
