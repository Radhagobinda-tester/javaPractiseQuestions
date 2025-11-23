package Collecton_Framework;

import java.util.Iterator;
import java.util.TreeSet;

public class ExapleOfTreeSet {
	/*
	 * It is a concrete class in java 
	 * We can create a object for tree set
	 * duplicates are not allowesd 
	 * indexing is not allowed 
	 * the elements would be sortewdby default 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet a = new TreeSet();
		
		a.add("Radha");
		a.add("Gobinda");
		a.add("Radha");
		a.add("Dash");
		
		for(Object a1 : a) {
			System.out.println(a1);
			
		}
		System.out.println("Execution starts for itreator ");
		Iterator i = a.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		

	}

}
