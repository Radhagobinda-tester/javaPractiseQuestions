package objectClass;

public class Hash_Code {
	 String name;
	 int id;
	 double sal;
	 
	 Hash_Code(String ename, int eid, double esal){
		 this.name = ename;
		 this.id = eid;
		 this.sal =esal;
		 
	 }
	 // changing the address by using overiding method 
	 public int hashCode() {
		 int hc =1010;
		hc= hc+id;
		 return hc;
		 
	 }
	 public static void main(String[] args) {
		 
		 Hash_Code dillip  = new  Hash_Code("dillip", 101, 45000);
		 System.out.println(dillip.hashCode());
		 Hash_Code papu  = new  Hash_Code("papu", 102, 45000);
		 System.out.println(papu.hashCode());
		 
	 }

	
	
	
}
