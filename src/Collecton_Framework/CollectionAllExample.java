package Collecton_Framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;


public class CollectionAllExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <Integer> al= new ArrayList<>();
 al.add(1);
 al.add(2);
  Iterator i =  al.iterator();
  while(i.hasNext()) {
  System.out.print(i.next());
  }
  
  Set<Integer> hs = new HashSet<>();
  hs.add(3);
  hs.add(3);
  Iterator h = hs.iterator();
  while(h.hasNext()) {
	  System.out.print(h.next());
  }
  
  Set <Integer> ts = new TreeSet<>();
  ts.add(4);
  ts.add(5);
  Iterator t= ts.iterator();
  while(t.hasNext()) {
	  System.out.print(t.next());
  }
  
  Map <Integer, String> hm = new HashMap<>();
  hm.put(101, "Radha");
  hm.put(102, "Gobinda");
  System.out.println(hm.values());
  System.out.println(hm.keySet());
  System.out.println(hm.entrySet());
  Iterator <Entry<Integer, String >> its = hm.entrySet().iterator();
  while(its.hasNext()) {
	  System.out.println(its.next());
  }
  
  Map <Integer, String>  ht = new Hashtable <>();
  ht.put(103, "DAsh");
  ht.put(105, "kuna");
    Iterator <Entry<Integer,String>> iyu = ht.entrySet().iterator();
    while(iyu.hasNext()) {
    	System.out.println(iyu.next());
    }
	}

}
