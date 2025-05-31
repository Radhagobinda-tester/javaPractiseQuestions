package downCastExamples;

public class DownCastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  Creating a object of super calss 
		animal a = new animal();
		goldenRetriver g = (goldenRetriver) a;
		g.guardDog();
	}

}
