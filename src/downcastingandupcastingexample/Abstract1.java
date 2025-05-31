package downcastingandupcastingexample;

public abstract class Abstract1 {

	abstract public void test();
		// TODO Auto-generated method stub
}

abstract class Abstract2 extends Abstract1 {
	
	abstract public void test2();
	abstract public void test();
	
}

abstract class Abstract3 extends Abstract2 {
	
	abstract public void test3();
	abstract public void test2();
	abstract public void test();
}

 class v1 extends Abstract3 {
	
	// implentation for test
	public void test() {
		System.out.println("I am test method1");
		}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("I am test method3");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("I am test method2");
	}
	
	public static void main(String[]args) {
		
		v1 obj = new v1();
		obj.test();
		obj.test2();
		obj.test3();
		
		
		
	}
	
	}
