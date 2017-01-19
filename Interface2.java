package java8.interfaces.change;

public interface Interface2 {

	public void method2();
	
	/*default void defaultMethod(String str){
		System.out.println("inside interface2 default method 2");
	}*/
	
	default void defaultMethod(){
		System.out.println("inside interface2 default method 2");
	}
}
