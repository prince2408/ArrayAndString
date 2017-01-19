package java8.interfaces.change;

//An interface with exactly one abstract method becomes Functional Interface. We don’t need to use
//@FunctionalInterface annotation to mark an interface as Functional Interface. @FunctionalInterface annotation is a facility to 
//avoid accidental addition of abstract methods in the functional interfaces. 

@FunctionalInterface
public interface Interface3 {

	public void method3();
	
	
	static void staticMethod(){
	 System.out.println("static inmplementation in interface");
	}
}
