package interviewQuestion;

interface MyFunctionalInterface{
	//single abstract method
	void myMethod(String s);
}
public class LambdaExpBasic {
public static void main(String[] args) {
// using lambda exp imp the interface
	MyFunctionalInterface myFunctionalInterface = (s) -> System.out.println("Hello, "+s);
// calling the method of the functional interface
	myFunctionalInterface.myMethod("Dude!");
}
}
//MyFunctionalInterface is a functional interface with a single abstract method myMethod.
//The LambdaExample class demonstrates the use of a lambda expression to implement the MyFunctionalInterface.
//The lambda expression (s) -> System.out.println("Hello, " + s) is used to provide the implementation for the myMethod.
//The main method creates an instance of the functional interface and calls the myMethod with the argument "World".
