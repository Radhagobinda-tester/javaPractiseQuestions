package DeeptiJavaProgram;

public class AdditionOfArrayInteger {

	public static void main(String[] args) {
int b[] ={10,20,30,40,50};
		int result=0;
			
		for(int i=b.length-1; i>0;i--)
		{
		result=result+b[i];
		
		}
System.out.println("The addition of all arrays :"+result);

	}

}
