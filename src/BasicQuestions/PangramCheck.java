package BasicQuestions;

public class PangramCheck {

	public static void main(String[] args) {
		String sentence = "The quick brown fox jumps over the lazy dog";
        sentence = sentence.toLowerCase();
        
        boolean[] alphabet = new boolean[26];
        int index =0;
        for(int i=0; i<sentence.length(); i++) {
        	char ch =sentence.charAt(i);
        	if(ch>='a'&& ch <='z') {
        		index = ch-'a';
        		alphabet[index] = true;
        	}
        }
        
       boolean isPangram = true;
       for(int i=0; i<26; i++) {
    	   if(!alphabet[i]) {
    		   isPangram =false;
    		   break;
    	   }
       }
       if (isPangram)
           System.out.println("It is a Pangram");
       else
           System.out.println("It is NOT a Pangram");
   }
	}


