package BasicQuestions;

public class Fibbinaciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n1=0, n2 =1, sum = 1;
      System.out.print(n1+","+n2);
      
      for(int n =2; n<6;n++) {
    	  
    	  sum = n1+n2;
    	  System.out.print(","+ sum);	  
    	  
    	  n1=n2;
    	  n2=sum;
    	  
      }
    		 
       
	}

}
