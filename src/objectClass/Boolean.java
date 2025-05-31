package objectClass;

public class Boolean {
	
	int a;
	// No Arg constructor 
	Boolean(){
		
	}
	// Parameterised constructor
	Boolean(int d){
		this.a =d;
		
	}
	// override the equals method
	public boolean equals(Object var) {
		
		boolean flag = false;
		// down casting is used we are comparing obj and obj1, 10 and 20 
		if(this.a==((Boolean)var).a) {
			flag = true;
		}
		return flag;
	}
	
	
	
	
	public static void main(String[]args) {
		Boolean obj = new Boolean(10);
		Boolean obj1 = new Boolean(20);
		//Comparing two Addresses
		System.out.println(obj.equals(obj1));
	}
}
