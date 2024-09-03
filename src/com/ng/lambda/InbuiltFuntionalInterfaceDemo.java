package com.ng.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Common functional Interfaces in java.util.function
public class InbuiltFuntionalInterfaceDemo {

	public static void main(String[] args) {

		// has boolean test(T t) method, represents a predicate (boolean-valued
		// function) of one argument
		Predicate<Integer> isEven = (n) -> (n & 1) == 0;
		
		System.out.println("Test Using 'Predicate Functional Interface' Test Method: " +isEven.test(2)); 
		System.out.println("Test Using 'Predicate Functional Interface' Test Method: " +isEven.test(3)); 

		// has void accept(T t) method, represents an operation that accepts a single
		// input argument and returns no result
		Consumer<String> print = (s) -> System.out.println(s);
		print.accept("Print using 'Consumer Functional Interface' Accept Method");


		// has R apply(T t) method, represents a function that accepts one argument and
		// produces a result.
		Function<Integer, String> convert = (a) -> String.valueOf(a);
		System.out.println("Convert Integer to String Using 'Function Functioanl Interface' Apply Method: "+ convert.apply(12345));

		// has T get(), represents a supplier of results.
		Supplier<String> supply = () -> "I am Supplier";
		System.out.println("Supply Using 'Supplier Functioanl Interface' Get Method: "+supply.get());

	}

}
