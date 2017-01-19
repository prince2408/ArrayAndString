package java8.interfaces.change;

public class StaticImplementation implements Interface3 {

	@Override
	public void method3() {
		System.out.println("inside method 3");
	}

	public static void main(String []args){
		StaticImplementation obj = new StaticImplementation();
		obj.method3();
		
	}
	
}
