package main.java.com.test.java;

//Example of method implementation inside interface - prefixed with default keyword
public interface SimpleInterface {
	int sum(int a, int b);
	
	default double round(float f){
		
		return Math.round(f);
	}
	
	default double sqrt(int a){
		return Math.sqrt(a);
	}
}
