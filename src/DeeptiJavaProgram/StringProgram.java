package DeeptiJavaProgram;

public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String  s1 = "bye";
       String s2 = "bye";// String constant pool 
       String s3 = new String("bye");
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s1==s2);
       System.out.println(s1==s3);// comparing with address
       
       System.out.println("================== writing the program of equals and equals ignore case");
       
       String  s4 = "hii";
       String s5 = "hii";// String constant pool 
       String s6 = "Hii";
       String s7 = s6.toLowerCase();
     
       // It is case sensitive 
       if(s4.equals(s7)) {
    	   System.out.println("The result is  same");
       }else {
    	   System.out.println("The result is not  same");
       }
       
       if(s6.equalsIgnoreCase(s5)) {
    	   System.out.println("The result is  same");
    }else {
 	   System.out.println("The result is not  same");
    }
       // .value of methoid is used to convert the character to string
 	  char [] ch = {'j','a','v','a'};
 	  String s8 = String.valueOf(ch);
	System.out.println("The out put is string : "+s8);
	String s9 = new String(ch);
	System.out.println("The out put is string : "+s9);
	
	
	
	
	
    }
	}


