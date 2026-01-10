package BasicQuestions;

public class ReverseTheWordsOfSentence {

	public static void main(String[] args) {
		System.out.println("program eexecution started");
        String s= "fox brown quick The";
		 String[] s1 = s.split(" ");
	        StringBuilder s3 =  new StringBuilder();
	        for(int i=s1.length-1; i>=0; i--){
	            String s2 = s1[i];
	            s3.append(s2);
	            
	            s3.append(" ");
	        }
	        System.out.print(s3.toString());
	        

	
	}

}
