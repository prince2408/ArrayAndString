
 In order to utilize lambda create/ or use an existing funcational inteface which contains that only one method with the same signature as a return type of lambda and use it as a type of the variable on which lambda is getting assigned.
 
 * Type Interface : Compiler tries to match the lambda expression with the related interface.
 * Functional Interface : can contain only one abstract method and multiple default defined method
 * For creating a default method in java interface, we need to use “default” keyword with the method signature.Now when a class will implement Interface1, it is not mandatory to provide implementation for default methods of interface.But during extending multiple interfaces it’s made mandatory to provide implementation for common default methods of interfaces
