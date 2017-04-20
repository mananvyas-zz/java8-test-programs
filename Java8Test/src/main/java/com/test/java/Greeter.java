package main.java.com.test.java;

public class Greeter {
	public void greet(){
		System.out.println("Hello World!!");
	}
	public static void main(String[] args) {
//		Greeter greeter = new Greeter();
//		greeter.greet();

		MyLambda myLambdaFunction = () -> System.out.println("Hello lembda");
		
	}

}

interface MyLambda{
	void foo();
}