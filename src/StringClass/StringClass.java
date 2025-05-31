package StringClass;

public class StringClass {

	public static void main(String[] args) {
		
		
	String s1 = "bye";// Value stored on string constant pull
	String s2 = new String("bye"); // value stored on Heap area
	System.out.println(s1==s2); //Comparing the value of address
	//o/p: false 
//obj.equals(obj1) :  Method is used to compare the value present inside the object it is case sensitive 
	System.out.println(s1.equals(s2));
	//o/p: true
	String s3 = "bye";// Value stored on string constant pull
	String s4 = "Bye"; 
	
// obj.equlsIngnorecase(obj1) Method is used to compare the value present inside the object irespective of case sensitive 
	
	System.out.println(s3.equalsIgnoreCase(s4));
	//o/p: true
	System.out.println(s3.equals(s4));
	//o/p: False
	
	String s5 = "i am learing java";
 // toUperCase() method is used to convert the string to uppercase 
	System.out.println(s5.toUpperCase());
	
	// toLowerCase() method is used to convert the string to Lower case
	
	System.out.println(s5.toLowerCase());
	
	// Array to string String.valueOf(ch)methos is used
	
	char [] ch = {'j','a','v','a'};
	  String s6 = String.valueOf(ch);
	System.out.println(s6);
	 String s7 = new String(ch); // Here ch is construtor
	 System.out.println(s7);
	 
	 // string  to array .toCharArray() method is used
	 
	 String s8 ="Mainhoonna";
	 char [] a=s8.toCharArray();
	 System.out.println(a.length);// only we are using this length to check the array length variable(imp)
	 
	 // To get the index value of array  by using for  loop
	 
	 for(int i =0; i<a.length; i++)
	 {
	 System.out.println("The index value is:"+" "+i+" "+a[i]);
	}
// .length() : it is used to check the length of a string 
	 
	 
	 String s9 ="Dahivada";
	 System.out.println("length of the string is :"+s9.length());
	 
	 // Concat : This method is used to concat/merge the two string 
	 String s10 ="Dahi";
	 String s11 ="vada";
	 System.out.println("After merging the words :"+s10.concat(s11));
	 // Character from a index in the string 
	 // charAt(index) : extract a char from a string 
	 
	 String s12 ="Dahivada";
	 System.out.println("Charcter present in specfic index is  :"+s12.charAt(1));
	 
	 String s13 ="  Dahivada   ";
	 System.out.println("length of the string is :"+s13.length());
	 
	 //.trim() : This method is used to remove extra spaces from begining to end 
	 
	 System.out.println("After removing extra spaces from begning to end  :"+s13.trim());
	 
	 // using length variable to get the length
	 
	 String  a1 = s13.trim();
	 System.out.println("length after trimming the spaces is :"+a1.length());
	 
	 String s14 ="a";
	 String s15 ="a";
	 
	 //compareTo : it is used to compare beteween two string and it will return some integer 
	  
	 /* Case 1 : when the two string are same >........................> return 0
	  * CompareTo method is coming from comparable interface 
	  * String class is implements from  comparable interface
	  * Syntax : String1.compareTo(String2)
	  
	     Case 2 : S1 is smaller than s2 then comparison is happening between ASCII vale Eg: 65 -97 = -32 
	     Case 3: S1 is Greater than s2 then comparison is happening between ASCII vale Eg: 65 -97 = -32 
	 
	 */
	 
	 System.out.println("Comparing the string which are same the value is :"+s14.compareTo(s15));
		 
	 System.out.println("Comparing the string which are different  the value is :"+"A".compareTo("a"));
	 System.out.println("Comparing the string which are different  the value is :"+"a".compareTo("A"));
	 
	 String s16 ="Radheyapartment";
	 
	/*indexOf(char ch) : It is used to search character from the given string
	 * 
	 * 4 overoaded versions are there 
	 * 
	 */
	 System.out.println("The index value of particular character  is  :"+s16.indexOf('a')); //1
	 
	 System.out.println("The index value of particular character  is (which is not present on the string)  :"+s16.indexOf('w')); // it will return -1
	 // indexOf(char ch, int index start) : method overloading concept
	 System.out.println("The index value of particular character  is  :"+s16.indexOf('a',5)); // after the index value of (y) is 5
	 
	 //  // indexOf(characterSequence ch) : method overloading concept
	 
	 System.out.println("The index value of particular character  is  :"+s16.indexOf("part"));
		
	 System.out.println("The index value of particular character  is  :"+s16.indexOf("part",9));
	 
	 //substring(int starting index) : It is use to show the value of after the index value 
	        // it is used to obtain string from a given string       
	 System.out.println("The string is after the index value  :"+s16.substring(0));
	 System.out.println("The string is after the index value  :"+s16.substring(6)); // the
	 // if we write the the value staring from index value 7 to 10
	 
	 //substring(int starting index, last index)
	 System.out.println("The string is after the index value  :"+s16.substring(7,11)); // the out put will give "part" always remmeber it will not take he last index
	 
	 // .split() : Split method is used to split the string into mutiple string 
	 
     String s18 = "i am kuna";
     // Coverting the the string to string array by giving string array 
     String []d = s18.split(" ");
     
     // Using for loop to spliting multiple values 
     
     for(int i =0; i<d.length; i++) {
    	 
    	 System.out.println("The value of index"+i+"is "+d[i]);
     }
     
     // String object is mutable or immutable ? 
     
    // Immutable means: We an modify the object 
     
     /* Ans :String object  is immutable, once the object is created using string it becomes constant 
      * Because string classes are final in java 
      * We want to modify the string object ?
      * We can create the modify object with the help of 
      * 1. StringBuilder 
      * 2. StringBuffer 
      * Present in java.lanuage.package
      * 
      * The fully qualified name of the package 
      * 
      *     1.java.lanuage.StringBuilder;
      *     2. java.lanuage.StringBuffer;
      * 
      * 
      * 
      * */
     
    // StringBuffer : class 
     // append method is used to   modify 
     
     System.out.println("String buffer Example");
     StringBuffer s19,s20;
     
     s19= new StringBuffer("i am ");
     s20=s19;
     s19.append("good");
     System.out.println(s19);// i am good 
     System.out.println(s20);// i am good 
     
     System.out.println("------------------------------------Using String object class -----------------------------------------------------");
     // String class is final in java it cannot be muttable 
     String s21,s22;
     s21= new String("i am ");
     s22=s21;
     s21.concat("good");
     System.out.println(s21);
     System.out.println(s22);
     
     System.out.println("------- we cannot modify the object by the help of string -------------------");
     System.out.println("StringBuilder Example");
     
     StringBuilder s23,s24;
     s23= new StringBuilder("Hello");
     s24=s23;
     s23.append("I am Good");
     System.out.println(s23);
     System.out.println(s24);
}
	
}
