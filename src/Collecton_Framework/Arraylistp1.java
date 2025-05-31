package Collecton_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylistp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList obj = new ArrayList();
		// add is non static method 
		obj.add(1);
		// Duplictae vale adding checking whetehr is it is accepting or not 
		obj.add(2);
		
		System.out.println("The lists are"+obj);
        //we conclude that user should be able to duplicate data
		// By using method overloading we can add value by adding object and index value object(index, value)
		
		obj.add(1,"index value change ho gaya");
		System.out.println("The lists are"+obj);
		// For checking the size size method is used size()
		System.out.println("The arrray size is"+obj.size());
		
		// another object i have created 
		
		ArrayList obj1 = new ArrayList();
		obj1.add("Hii");
		
		obj1.add("i am obj1");
		
		// now i am adding .addAll method where i am adding obj with obj1 . the result become obj got effected
		obj.addAll(obj1);
		System.out.println("After adding obj1 with obj the list are:"+obj);
		
		// now i am adding .addAll method where i am adding obj with obj1. The result become obj1 got effected
		
		obj1.addAll(obj);
		System.out.println("After adding obj1 with obj the list are:"+obj1);
		
		
		/*Question iswhen we print obj why the addres is not shown? Ans: Because the two strig method is overridded from array list 
		Such that instead of giving addres it is giving the list.  */
		ArrayList obj2 = new ArrayList();
		// add is non static method 
				obj2.add(1);
				obj2.add(2);
				obj2.add(false);
				obj2.add('a');
				//.size method is used to check the size
				System.out.println("The list are:"+" "+obj2+"  "+"The size are"+obj2.size());
				
			//get(index) Method is  used  value of specific index
				
				System.out.println("The value of specific index is :"+"" +obj2.get(2));
				
				// Accesing element by the help of forloop
				
				for (int i=0;i<obj2.size();i++) {
					System.out.println("The value of index "+i+" "+"is :"+obj2.get(i));	
				}
				// to get the index value .indexOf() method is used	return type always u want to get ndex value
				System.out.println("The value index value is :"+obj2.indexOf(false));
				
				//.contains() is used to get the boolean value true or false return type is boolean 
				System.out.println("The value is present on that index :"+obj2.contains(2));
				//Homogenou eg
				// We can use generics (symbol is <>) to make for homogenous value means it will take only one type of parameter
				
				ArrayList <Boolean> obj3 = new ArrayList <>();
				
				obj3.add(false);
				obj3.add(false);
				obj3.add(false);
				obj3.add(true);
				System.out.println("The lists are"+obj3);
				
				// using advanced for loop
				
				ArrayList obj4 = new ArrayList();
				obj4.add(2);
				obj4.add(false);
				obj4.add('a');
				
				for(Object a:obj4) {
					System.out.println(a);
					
					
				}
				
				/*
				 There are three ways to get the value of array list 
				 1.By using .get method
				 2. Bu using for loop
				 3. By using advaned for loop / for each loop
				 
				 */
				System.out.println("Sorting method starts");
				
			//Sorting he array list 
			// For shorting the array we are using sort() method and collectio class whch is present inside the Array list 
				ArrayList obj5 = new ArrayList();
				obj5.add(2);
				obj5.add(1);
				obj5.add(3);
				obj5.add(4);
				//soting the array list 
				Collections.sort(obj5);
				//After shorting we will check sorting or not by using advanced for loop
				for(Object a:obj5) {
					System.out.println(a);
				}
			// sorting on reverse order we can use reverse method 
				Collections.reverse(obj5);
				System.out.print(obj5);
				
				/*
				// Class cast exception should display when the array list is not homogeneous 
				ArrayList obj6 = new ArrayList();
				obj6.add(2);
				obj6.add(false);
				obj6.add('a');
				obj6.add(true);
				Collections.sort(obj6);
				System.out.print(obj6);
				// sorting on reverse order we can use reverse method 
				*/
				 
				// iterator is a claas and method 
				ArrayList obj7 = new ArrayList();
				obj7.add(2);
				obj7.add(false);
				obj7.add('a');
				obj7.add(true);
				//System.out.print(obj7);
				// To read the object of Array list by using iterator method 
				Iterator var = obj7.iterator();
				// There are two method hasNext and next method to read object from array list 
				while(var.hasNext())
				{
					System.out.println(var.next());
				}
				
				// can we convert the array list to array?? Ans: yes 
				
				ArrayList obj8 = new ArrayList();
				obj8.add(2);
				obj8.add(3);
				obj8.add(4);
				obj8.add(5);
				
				// to array method is used t convert the array lis to array
				// retunrn type should ne Object array
				Object a[]=obj8.toArray();
				// by using lenth method we can access the array
				for(int i=0; i<a.length; i++)
				{
					System.out.println(a[i]);
				}
				
				ArrayList obj9 = new ArrayList();
				obj9.add(2);
				obj9.add(true);
				obj9.add("False");
				obj9.add('a');
				System.out.println(obj9);
				// remove() method is used to remove the data the from array list either you use index number or value inside the method
				// passing vlaue inside the argument
				obj9.remove(2);
				System.out.println(obj9);
				// passing index number inside the argument
				obj9.remove("False");
				System.out.println(obj9);
				// remove (object type)
				obj9.remove(Boolean.valueOf(true));
				System.out.println(obj9);
				
				// remove all method: .removeAll(), it will remove common values
				
				ArrayList obj10 = new ArrayList();
				obj10.add(2);
				obj10.add(true);
				obj10.add("False");
				obj10.add('a');
				
				ArrayList obj11 = new ArrayList();
				obj11.add(3);
				obj11.add(true);
				obj11.add("False");
				obj11.add('a');
				System.out.println("-----------------Remove all method result-----------------------------------");
				obj10.removeAll(obj11);
				System.out.println(obj10);
				// remove all method: .retainAll(), it will remove uncommon values
				ArrayList obj12 = new ArrayList();
				obj12.add(2);
				obj12.add(true);
				obj12.add("False");
				obj12.add('a');
				
				ArrayList obj13 = new ArrayList();
				obj13.add(3);
				obj13.add(true);
				obj13.add("False");
				obj13.add('a');
				System.out.println("-----------------RetainAll method result-----------------------------------");
				obj12.retainAll(obj13);
				System.out.println(obj12);
				System.out.println(obj13);
	} 
	
}

