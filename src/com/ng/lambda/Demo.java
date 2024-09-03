package com.ng.lambda;

import java.util.Comparator;

public class Demo {
    
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// There are several ways we can implement functional interface
		// 1: Creating a clas which implements functional interface
		// 2: providing implementation of anonymous inner class (class without name)
		// 3: using lambda expression
		// 4: lamda expression can be further concise its size

		// 1 . using class
		MyFunctionalInterface classImp = new MyFunctionalImp();

		classImp.print("This is using implmenting functional interface");

		// 2: providing implementation of anonymous class
		MyFunctionalInterface anonymousClass = new MyFunctionalInterface() {

			@Override
			public void print(String s) {

				System.out.println(s);

			}
		};

		anonymousClass.print("This is using anonymous class implementation");

		// 3.1: using lambda expression with param and return type
		MyFunctionalInterface lambdaWithType = (String s) -> {

			System.out.println(s);
		};

		lambdaWithType.print("This is using lambda with parameter type and method body");

		// 3.2: using lambda expression without param type
		MyFunctionalInterface lambdaWithoutType = (s) -> System.out.println(s);

		lambdaWithoutType.print("This is using lambda without parameter type and method body");

		// We can remove parameter type and return type, as it will be resolved by
		// compiler referring to its fucntional iterface
		MyFunctionalInterface2 lambdaWithMultipleParam = (int a, int b, int c) -> {

			return a + b + c;
		};

		lambdaWithoutType.print(Integer.toString(lambdaWithMultipleParam.sum(1, 2, 3)));


		MyFunctionalInterface2 lambdaWithMultipleParamWithoutType = (int a, int b, int c) -> a + b + c;

		lambdaWithoutType.print(Integer.toString(lambdaWithMultipleParamWithoutType.sum(10, 20, 30)));


		//Passing lamda function as parameter to another method
		lambdaPassingToMethod((s)-> System.out.println(s), "I am passing funcional iterface as method paramter");
		
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer a1, Integer a2) {
				
				return a1 - a2;
			}
		};
		
		Comparator<Integer> comparatorUsingLambda = (a, b) -> a - b;
		
		// Traditional way to implement a functional interface
		Runnable runnable = new Runnable() {
		    
			@Override
		    public void run() {
		        
				System.out.println("Hello from Runnable!");
		    }
		};

		// Using a lambda expression
		Runnable runnableUsingLambda = () -> System.out.println("Hello from Lambda!");

	}


	public static void lambdaPassingToMethod(MyFunctionalInterface f, String s) {

		f.print(s);

	}


}
