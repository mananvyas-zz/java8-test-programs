package main.java.com.test.java;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int[] someNumbers = {1,2,3,4};
		int key = 0;
		
//		System.out.println("Add");
//		process(someNumbers,key, (v,k) -> System.out.println(v + k));
		
//		System.out.println("Divide");
		//Handle divide by 0
		process(someNumbers,key, (v,k) -> {
			try {
				System.out.println(v / k);
			} catch(ArithmeticException ae){
				ae.printStackTrace();
			}
		});

	}
	
	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer){
		for(int i : someNumbers){
			consumer.accept(i, key);
		}
	}

}
