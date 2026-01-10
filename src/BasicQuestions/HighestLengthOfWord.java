package BasicQuestions;

public class HighestLengthOfWord {

	public static void main(String[] args) {
		System.out.println("program eexecution started");
        String s= "fox brown quick The";
        String[] s1 = s.split(" ");
        int maxlen= Integer.MIN_VALUE;
        String maxWord = "";
        for(int i =0; i<s1.length-1; i++) {
        	int s3 = s1[i].length();
        
        	if(s3>maxlen) {
        		
        		maxlen=s3;
        		maxWord =s1[i];
        	}
        }
        
        System.out.println(maxlen +" "+maxWord);

	}

}
