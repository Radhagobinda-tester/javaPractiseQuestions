package BasicQuestions;

public class Twostringsarerotationsofeachother {
  public static boolean areRotations(String str1 , String str2) {
	  if(str1==null || str2==null || str1.length()!=str2.length()) {
		  return false;
	  }
	  
	  String concatenated = str1+str2;
	  return concatenated.contains(str2);
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "waterbottle";
        String s2 = "erbottlewat";
        String s3 = "bottlewater";
        String s4 = "notright";
        

        System.out.println("'" + s1 + "' and '" + s2 + "' are rotations: " + areRotations(s1, s2));
        // Output: 'waterbottle' and 'erbottlewat' are rotations: true

        System.out.println("'" + s1 + "' and '" + s3 + "' are rotations: " + areRotations(s1, s3));
        // Output: 'waterbottle' and 'bottlewater' are rotations: true

        System.out.println("'" + s1 + "' and '" + s4 + "' are rotations: " + areRotations(s1, s4));
        // Output: 'waterbottle' and 'notright' are rotations: false
        
        System.out.println("'" + s1 + "' and 'bottle' are rotations: " + areRotations(s1, "bottle"));
        // Output: 'waterbottle' and 'bottle' are rotations: false
	}

	
}
