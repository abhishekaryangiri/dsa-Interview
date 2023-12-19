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
