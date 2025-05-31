package Collecton_Framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Syntax of hashmap
	//Hashmap hs = new Hashmap();
   // Map hs = new Hashmap();
	HashMap<Integer, String> hs = new HashMap<Integer, String>();
	hs.put(102, "Radha");
	hs.put(103, "Rahul");
	hs.put(104, "kuna");
	hs.put(105, "gobinda");
	System.out.println(hs);//{102=Radha, 103=Rahul}
	//get the size of object 
	System.out.println("The size of array is : "+hs.size());//2
	//remove the value 
	hs.remove(104);
	// After removing the data dispaly 
	System.out.println(hs);//{102=Radha, 103=Rahul, 105=gobinda}
	// to get all the keys from hassmap 
    System.out.println(hs.keySet());//[102, 103, 105]
 // to get all the value from hassmap 
    System.out.println(hs.values());//[Radha, Rahul, gobinda]
    // To gat all the keys and value 
    System.out.println(hs.entrySet());//[102=Radha, 103=Rahul, 105=gobinda]
    
    // Using for loop
    for(int k:hs.keySet()) {
    	 System.out.println(k+"   "+hs.get(k));
    }
	// Using itreator 
    System.out.println("=============Printing the itreator output ===========");
    Iterator<Entry<Integer, String>> it = hs.entrySet().iterator();
    while(it.hasNext()) {
	Entry<Integer,String> entry = it.next();
	
	System.out.println(entry.getKey()+"  "+entry.getValue());
}
    
    
    
	}

}
