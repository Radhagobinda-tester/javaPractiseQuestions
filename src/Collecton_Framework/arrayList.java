package Collecton_Framework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class arrayList {

	public static void main(String[] args) {
		
		 ArrayList obj = new ArrayList();
	       obj.add(1);
	       obj.add(2); 
	       obj.add(3); 
	       obj.add(4); 
	       obj.add(5); 
	       obj.add(6); 
	      System.out.println(obj);
	      
	      // Converting the ArrayList to array
	      // toArray()
	      Object [] a = obj.toArray();
	     for(int i=0; i<a.length; i++) {
	    	 
	    	 System.out.println(a[i]);
	     }
	      
	      

	}

}
