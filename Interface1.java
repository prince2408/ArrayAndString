package java8.interfaces.change;

public interface Interface1 {

	public void method1();
	
	default void defaultMethod(){
		System.out.println("inside interface1 default");
	}
}
