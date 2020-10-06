package com.dummyproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenericClassFinalTest {

	@Test
	public void givenMoreThanThreeIntegerArguments_ShouldReturnMax() {
		GenericClassFinal<Integer> tester = new GenericClassFinal<Integer>(); 
		tester.maximum(1,2,3,4,5,6,7);
		assertEquals((Integer)7,tester.getMax());
	}

	@Test
	public void givenMoreThanThreeFloatArguments_ShouldReturnMax() {
		GenericClassFinal<Float> tester = new GenericClassFinal<Float>(); 
		tester.maximum(1.2f,2.3f,3.4f,4.5f,5.6f,6.7f,7.8f);
		assertEquals((Float)7.8f,tester.getMax());
	}
	
	@Test
	public void givenMoreThanThreeStringArguments_ShouldReturnMax() {
		GenericClassFinal<String> tester = new GenericClassFinal<String>(); 
		tester.maximum("Apple","Ball","Cat","Dog");
		assertEquals("Dog",tester.getMax());
	}
}
