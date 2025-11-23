package wrapper;

public class BoxingAndUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10; 
		
//		======================Boxing============================================
		Integer Obj = Integer.valueOf(a);
		System.out.println("The integer value is: "+a);
		System.out.println("The Object value  is : "+Obj);
// ================================== UNBoxing================================
		
		System.out.println("The unboxing is started");
		int unBoxing = Obj.intValue();
		int autoUnboxing = Obj;
		System.out.println("Explicitly un boxing "+unBoxing);
		System.out.println("Auto unBoxing : "+autoUnboxing);
	}

}
