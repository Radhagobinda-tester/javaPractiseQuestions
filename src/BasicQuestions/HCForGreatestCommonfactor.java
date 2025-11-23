package BasicQuestions;

public class HCForGreatestCommonfactor {
   public static int findGCD(int a,int b) {
	   int temp;
	   while(b!=0) {
		    temp=b;
		   b= a%b;
		   a=temp;
	   }
	   return a;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num1 =48;
     int num2 =18;
     System.out.println(num1 +" and "+num2 + " the greatest common didvisor is "+ findGCD(num1,num2));
	}

}
