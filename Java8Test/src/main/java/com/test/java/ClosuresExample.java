package main.java.com.test.java;

public class ClosuresExample {

	public static void main(String[] args) {
		int a = 10;
		//b coming as a freezed value - closures concept
		//final is not needed but compiler expect it to be final - not allowed to change those variables
		int b = 20; 
		//b = 30; //Uncomment this line to see compilation error occurs - b is not allowed to change
		doProcess(a, i -> System.out.println(i+b));

	}
	
	public static void doProcess(int i, Process p){
		p.process(i);
	}


}

interface Process {
	void process(int i);
}
