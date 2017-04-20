package main.java.com.test.java;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable(){
			public void run(){
				System.out.println("Printed inside..");
			}
			
		});
		
		
		myThread.run();
		
		Thread myLambdaThread = new Thread(() -> System.out.println("Lambda Runnable...."));
		myLambdaThread.run();

	}

}
