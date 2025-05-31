package JavaPatternmaking;

public class DiamondPattern {

	public static void main(String[] args) {
//		Decraing row
		int i;
//		Declaring for space 
		int k;
//		Declaring for star 
		int j;
//		Wrint the row count 
		int n =5;
//		Writting for loop for row
		for(i =1; i<=n; i++) {
			
//			Writting a for loop to printing the spaces 
			for(k=1; k<n-i; k++) {
				System.out.print(" ");
			}
//			Writting for loop to add stars  
			for(j=1;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
