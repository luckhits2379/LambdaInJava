package com.ng.lambda;


//Functional Interface which as only one method ( by default abstract / public), use @FunctionalInterface so that 
//other cant modify this by mistak

@FunctionalInterface
public interface MyFunctionalInterface2 {
	
	public abstract int sum(int a, int b, int c);

}
