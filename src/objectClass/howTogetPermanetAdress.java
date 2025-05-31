package objectClass;

public class howTogetPermanetAdress {
 String name;
 int id;
 double sal;
 
 howTogetPermanetAdress(String ename, int eid,double esal) {
	 
	 this.name =ename;
	 this.id = id;
	 this.sal=esal;
 }
 
 public  String toString() {
	 // ths stete should vview the permann adress 
	 return super.toString()+"  "+"Tyss"+id;
	 
 }
  public static void main (String[]args) {
	  howTogetPermanetAdress h = new howTogetPermanetAdress("vishal", 101, 45000);
	  System.out.println(h);
	  
	  
  }
 
 
 
}
