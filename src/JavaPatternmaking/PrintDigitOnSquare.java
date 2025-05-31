package JavaPatternmaking;

public class PrintDigitOnSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// creating a variable 
		int n =5;
//		Print cout variable as 0 
		int count = 0;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
//				Writting a condition if count is less 10 then print 0
				if(count < 10) {
					System.out.print("0");
				}
			System.out.print(count++ +" ");
			}
		
		System.out.println();
	}
	}

}
