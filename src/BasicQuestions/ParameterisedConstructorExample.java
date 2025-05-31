package BasicQuestions;

public class ParameterisedConstructorExample {

	
		// TODO Auto-generated method stub
		
		// Declaring two variables 
		String name;
	 	int age;
		
		// Creating a  parameterised construstor 


	ParameterisedConstructorExample(String name,int age){
			this.name= name;
			this.age = age;
		}
	
//creating a non constructor 
	
	public void display(){
		System.out.println("The employe age is : "+ age);
		System.out.println("The Employee name is : "+ name);
	}
			
			public static void main(String[] args) {
				// creating a object 
				
				ParameterisedConstructorExample p = new ParameterisedConstructorExample("Radha",32);
				ParameterisedConstructorExample p1 = new ParameterisedConstructorExample("gobinda",32);
				
				p1.display();
				p.display();
			}
		

	
	

}
