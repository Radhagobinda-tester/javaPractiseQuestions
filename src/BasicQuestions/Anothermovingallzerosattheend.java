package BasicQuestions;

public class Anothermovingallzerosattheend {

	public  static void sotingZero(int [] a){
        int size =a.length;
      
        int nz=0,z=0;
    
        while(nz < size){
            if(a[nz]!=0){
             int   temp = a[nz];
                a[nz]=a[z];
                a[z]=temp;
                nz++;
                z++;
            }else{
                nz++;
            }
        
    }
        
        
    }
    public static void main(String[] args) {
    System.out.println("moving all zeros end of the array");
        int [] a = {1,2,0,3,};
        sotingZero(a);
       for(int z:a){
           System.out.print(z+" ");
       }
        
    } 

}
