package objectClass;

public class Tostring {
 String name;
 int id;
 double sal;
 // Constructor 
 Tostring(String ename, int eid, double esal){
	 this.name = ename;
	 this.id = eid;
	 this.sal =esal;
	 
 }
 // override the object super class method
 // changing the address 
 public String toString() {
	 
	// it will convert the adress into string formmat here ww will give after "Afte the wi the i will print automatically". 
	return "wi"+id;
	 
 }
 public static void main(String[] args) {
	 
	 Tostring dillip  = new  Tostring("dillip", 101, 45000);
	 System.out.println(dillip);
	 Tostring papu  = new  Tostring("dillip", 102, 45000);
	 System.out.println(papu);
	 
	 Tostring pannu  = new  Tostring("pannu", 103, 3515000);
	 System.out.println(pannu); 
	 System.out.println("Pannu salary is updating :" + pannu.sal); 
	 pannu.sal=50000;
	 System.out.println("Pannu  updated salary is :" +  pannu.sal);
	}


 
}

// o/p:- Wi101, wi102 etc....
