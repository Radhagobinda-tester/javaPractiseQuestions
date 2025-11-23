package Collecton_Framework;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class Exampleofhashtable {
	/*
	 *HashTable in Java

It is an implementing class for Map interface.

It was introduced in JDK 1.0 (legacy class).

Data is stored in the form of key-value pairs.

Keys must be unique, values can be duplicate.

Null key is not allowed.

Null values are not allowed (multiple nulls also not allowed).

It is synchronized (thread-safe).

It is slower compared to HashMap due to synchronization.

Insertion order is not maintained.

Allows heterogeneous objects as keys and values. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Hashtable<Integer,String> hs = new Hashtable<>();
  
    hs.put(102, "Radha");
	hs.put(103, "Rahul");
	hs.put(104, "kuna");
	hs.put(105, "gobinda");
	System.out.println(hs.size());
	System.out.println(hs.keySet());
	System.out.println(hs.values());
	System.out.println(hs.entrySet());
	System.out.println("Execution of hash map sarted ");
	Iterator <Entry<Integer,String>> it = hs.entrySet().iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	}

}
