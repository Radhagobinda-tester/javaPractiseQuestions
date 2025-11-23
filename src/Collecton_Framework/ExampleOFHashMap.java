package Collecton_Framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class ExampleOFHashMap {
	
	/*
	 * It is implemention class of map interface
	 * it has no indexing 
	 * Value stored in key and value pair 
	 * it does not accepts multiple values 
	 * it does accepts multiple nulls 
	 * it acceps object type data \\*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <Integer, String> hs = new HashMap<>();
		hs.put(102, "Radha");
		hs.put(103, "Rahul");
		hs.put(104, "kuna");
		hs.put(105, "gobinda");
		System.out.println(hs.size());
		System.out.println(hs);
//		 getting the keys
		System.out.println(hs.keySet());
//		 getting the values
		System.out.println(hs.values());
//		 Getting al 
		System.out.println(hs.entrySet());
		System.out.println("Ireator execution starts");
		 Iterator<Entry<Integer, String>> it = hs.entrySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
				
	}

}
