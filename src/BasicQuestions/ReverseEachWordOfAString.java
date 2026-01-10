package BasicQuestions;

public class ReverseEachWordOfAString {

	public static void main(String[] args) {
		System.out.println("program eexecution started");
        String s= "fox brown quick The";
        String[] s1 = s.split(" ");
        StringBuilder s3 =  new StringBuilder();
        for(int i=0; i<s1.length; i++){
            String s2 = s1[i];
            
            for(int j=s2.length()-1; j>=0; j--){
                char ch = s2.charAt(j);
              s3.append(ch); 
            }
            s3.append(" ");
        }
        System.out.print(s3.toString());
        

	}

}
