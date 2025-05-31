package JavaPatternmaking;

public class HollowPattern {

	public static void main(String[] args) {

//	 Creating na integer variable 
		 int n=5;
		 
//		 Creating a for loop for i row 
		 for(int i =0; i<n; i++) {
			 
//    Creating a for for loop for j as column
			 for(int j =0; j<n; j++) {
				 
//				 Writtong a if condition if the forst row and last row press *
				 if(i==0 || i==n-1 || j==0 || j==n-1) {
					 
					 System.out.print("*");
					 
				 }else {
//					 Else print Space 
					 System.out.print(" ");
 
				 }
			 }
			 
			 System.out.println();

		 }
		
	}

}
