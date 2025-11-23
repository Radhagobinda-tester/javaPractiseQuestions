package BasicQuestions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CheckTheStringIsPalindromeOrNot {
// asked in adnai Interview
	public static void main(String[] args) {
		String [] s1 = {"radha","madam"};
		Set<String> hs = new HashSet<>();
		for(int i =0; i<s1.length; i++) {
			String s = s1[i];
			String org = s;
			 String result = ""; 
			for(int j =s.length()-1; j>=0; j--) {
				char ch = s.charAt(j);
				result = result+ch;
			}
			if(result.equals(org)) {
				hs.add(result);
			
			}
		
Iterator it = hs.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
	
}
}

	
	}

}
