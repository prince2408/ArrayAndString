package java8.interfaces.change;
/**
 * If both the interface contains the default method with the same signature then the implemented class has to override it
 * to overcome the diamond problem otherwise compliler wont be able to decide which interface's default method it needs to 
 * execute.
 *1) Java interface default methods will help us in removing base implementation classes, we can provide default implementation 
 *  and the implementation classes can chose which one to override.
 *  
 *2) One of the major reason for introducing default methods in interfaces is to enhance the Collections API in Java 8 to support 
 *  lambda expressions.
 *  
 * 3) Java interface default methods are also referred to as Defender Methods or Virtual extension methods.
 * 
 * 4) If any class in the hierarchy has a method with same signature, then default methods become irrelevant.
 * A default method cannot override a method from java.lang.Object. The reasoning is very simple, 
 * it’s because Object is the base class for all the java classes. So even if we have Object class methods defined as 
 * default methods in interfaces, it will be useless because Object class method will always be used. 
 * That’s why to avoid confusion, we can’t have default methods that are overriding Object class methods.
 *  @author abhkumar
 *
 */
public class Implementation implements Interface1,Interface2{

	@Override
	public void method2() {
		System.out.println("overriding method2");
		
	}

	@Override
	public void method1() {
		System.out.println("overirding method1");
		
	}
	
	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
		System.out.println("inside implementation default method");
		
	}
	 
	 public static void main(String []args){
		 Implementation obj = new Implementation();
		 obj.defaultMethod();
	 }

}
