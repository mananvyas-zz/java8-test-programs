package main.java.com.test.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Excercise {

	public static void main(String[] args) {
		List<Person> people =  Arrays.asList(
				new Person("f1","zom",11),
				new Person("f2","om",22),
				new Person("f3","ken",33),
				new Person("f4","peter",44),
				new Person("f5","ram",55)
				);

		
//			Collections.sort(people, new Comparator<Person>(){
//				
//				@Override
//				public int compare(Person p1, Person p2) {
//				
//				return p1.getLastName().compareTo(p2.getLastName());
//			}		
//		});	
			
			Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
			
		printAll(people);
	}
	
	public static void printAll(List<Person> people){
		for(Person p : people){
			System.out.println(p);
		}
	}
	
	
}
