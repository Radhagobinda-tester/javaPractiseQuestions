package wrapper;

public class BoxingAndUnBoxingExamples {

	public static void main(String[] args) {
//Boxing: The process of converting premitive type to object type data is called boxing
   int a =10;
   Integer b =Integer.valueOf(a);
   System.out.println("Converting integer to object : "+b);
   int c = b.intValue();
   System.out.println("Converting object to integer :"+c);

	}

}
