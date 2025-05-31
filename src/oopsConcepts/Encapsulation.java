package oopsConcepts;

public class Encapsulation {
	
//	 Creatng a n variable 
	private String empname;
	
//Getters methos is used to get the methosd 
	public String getEmp_name() {
		return empname;
	}
//	Stters method is used to modify the data 
	public void setEmpname(String name) {
		this.empname =name;
	}
	public static void main(String[] args) {

		Encapsulation e = new Encapsulation();
		e.setEmpname("arun");
		System.out.println(e.getEmp_name());

	}

}
