package BasicQuestions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StoringOnlyDplicatesCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a code only store  duplicate alphabets");
        String s = "Radha Gobinda Dash";
        s= s.toLowerCase().replaceAll(" ","");
        Set<Character> hs = new HashSet<>();
        for(int i =0; i<s.length(); i++){
            char ch =  s.charAt(i);
            for(int j=i+1; j<s.length(); j++){
                char ch1 =s.charAt(j);
                if(ch==ch1){
                    hs.add(ch);
                }
            }
            
        }
        
    Iterator it = hs.iterator();
    while(it.hasNext()){
        System.out.print(it.next());
    }

	}

}
