package BasicQuestions;

public class RemoveVowelsFromAstring {

	public static void main(String[] args) {
		String s = "radha";
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u') {
				sb.append(ch);
			}
		}
		
     System.out.println(sb);
	}

}
