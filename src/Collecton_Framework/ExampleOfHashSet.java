package Collecton_Framework;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleOfHashSet {

	
	/*
	 * Hashset is concrete class in java 
	 * where we can crete a objecyt 
	 * it is present inside the java.util.package 
	 * the fully qualified name  is java.uti. hashset
	 * insertioion orderis not maintained 
	 * duplicatevalue is we cannot store 
	 * indexing is not allowed
	 *  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet  a= new HashSet();
		a.add("Radha");
		a.add("Gobinda");
		a.add("Radha");
		a.add("Dash");
		
		 for(Object a1 : a) {
			System.out.println(a1);
		}
		System.out.println("Itreator execution starts");
		Iterator i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
		

	}

}
