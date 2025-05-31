package mislaneous;

public class MyFirstProgram {
	  
	    public int lengthOfLongestSubstring(String s) {
	    	 int count = 0;
	    	
	    

	    char lastKey = java.lang.Character.toLowerCase(s.charAt(0));

	         for (int i = 1; i < s.length(); i++) {
	             char currentKey = java.lang.Character.toLowerCase(s.charAt(i));
	             if (currentKey != lastKey) {
	                 count++;
	             }
	             lastKey = currentKey;
	         }


	        return count;
	    
	    }

	    public static void main(String[]args){

	        String s = "abcabcbb";
	        MyFirstProgram m = new MyFirstProgram();
	        int count = m.lengthOfLongestSubstring(s);
	        
	        System.out.println("Length is: " + count);
	        
	       
	    }
	}
	
	


