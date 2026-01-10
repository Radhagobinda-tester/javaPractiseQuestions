package BasicQuestions;

public class CountOfUppercaseAndLowerCAse {

	public static void main(String[] args) {
		String s ="HeXaWare";
		int lowerCase = 0;
		int Upppercase =0;
		String result = "";
		 for(int i=0; i<s.length(); i++) {
			 char ch = s.charAt(i);
			 if(java.lang.Character.isUpperCase(ch)) {
				 result = result + java.lang.Character.toLowerCase(ch);
				 Upppercase++; 
			 }if(java.lang.Character.isLowerCase(ch)) {
				 result = result + java.lang.Character.toUpperCase(ch);
				 lowerCase++; 
			 }
		 } 
		 System.out.println(result);
       System.out.println(Upppercase+" "+lowerCase);
	}

}
