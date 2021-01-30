package hashMapping;
import java.util.HashMap;

import hashMapping.InnerClassExample.StringExample;

import java.util.ArrayList;

public class hashMapPractice {

	public static void main(String[] args) {

		System.out.println("Hello World");
		
		HashMap<String, String> dorian = new HashMap<String, String>();
		
		dorian.put("Name", "Dorian");
		dorian.put("Address", "120 Rhew Place");
		
		System.out.println(dorian.get("Name"));
		
		
		//InnerClassExample stringExample = new InnerClassExample();
		//stringExample.testStrings();

	}

}
