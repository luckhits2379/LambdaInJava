package com.ng.lambda;

import java.util.ArrayList;
import java.util.List;


//method references can only be used to replace lambda expressions that have a single method
public class MethodReference {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		List<Integer> myList = new ArrayList();

		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);

		// Since for each method accepts a consumer, which has accept method which
		// accepts one parameter we can pass other matching method as reference
		// we can save a method ref and pass as value
		myList.forEach(System.out::println);

		MyFunctionalInterface customFunctionalIterface = System.out::println;

		customFunctionalIterface.print("Since our custom functional interface also has matching method, we can assign System.out::println method");
		
		MyFunctionalInterface2 customFunctionalIterface2 = new MyClass2()::sum;

		int sum = customFunctionalIterface2.sum(1, 2, 2);

		System.out.println("Sum using passing an instane method: " + sum);

		MyFunctionalInterface2 customFunctionalIterfaceStatic2 = MyClass2::sumStatic;

		int sumStatic = customFunctionalIterfaceStatic2.sum(1, 2, 2);

		System.out.println("Sum using passing an static method: " + sumStatic);

	}

}

class MyClass2 {

	public int sum(int a, int b, int c) {

		return a + b + c;
	}

	public static int sumStatic(int a, int b, int c) {

		return a + b + c;
	}
}
