package BasicQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyOfCharactersInString {

    public static void main(String[] args) {
    	 String s = "radha gobinda dash";
         s = s.replaceAll("\\s","");
         Character [] ch = s.toCharArray();
         Map <Character, Integer> m = new HashMap<>();
         int cnt =1;
         
         for(int i =0; i<ch.length; i++){
             if(!m.containsKey(ch[i])){
                 m.put(ch[i], 1);
             }else{
                 
                 m.put(ch[i],m.get(ch[i])+1);
                 
                 
             }
             
         }
         System.out.print(m.entrySet());
    }
}

