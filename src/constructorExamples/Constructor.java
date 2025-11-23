package constructorExamples;

public class Constructor {
	String name;
	String place;
	public  Constructor (String n, String p) {
		name = n;
		place =p;
		
	}

	public static void main(String[] args) {
		Constructor c =  new Constructor("Radha", "Odisha");
		
	System.out.print(c.name);
		

	}

}
