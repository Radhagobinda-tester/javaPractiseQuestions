                  package Collecton_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class K1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList obj = new ArrayList();
       obj.add(1);
       obj.add(2); 
       obj.add(3); 
       obj.add(4); 
       obj.add(5); 
       obj.add(6); 
       // Sorting the array list asending order 
       Collections.sort(obj);
       // printing the statement
       System.out.println(obj);
       // To read the object which is present inside the array least by using advanced for loop
       System.out.println("----Reading the object--------");  
       for(Object a: obj) {
    	   
    	   System.out.println(a);
       }
       
       ArrayList obj1 = new ArrayList();
       obj1.add(1);
       obj1.add('A'); 
       obj1.add("hai"); 
       obj1.add(true); 
       obj1.add(5); 
       obj1.add(6); 
       
       //class name - Iterator, method name - iterator
      Iterator var = obj1.iterator();
      
      System.out.println("----Reading the object by using iterator method and class--------");  
      //To read the object which is present inside the array least by using hasNext method 
      while(var.hasNext()) {
    	  //To read the object which is present inside the array least by using next method 
    	  System.out.println(var.next()); 
      }
	}

}
/*

output 
[1, 2, 3, 4, 5, 6]


*/