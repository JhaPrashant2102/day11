package com.dummyproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxGenericClassTest {

	@Test
	public void maxCheckForFirstPositionforInteger() {
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		MaxGenericClass<Integer> tester = new MaxGenericClass<Integer>(c,b,a);
		assertEquals(c,tester.findMax());
	}
	
	@Test
	public void maxCheckForSecondPositionForInteger() {
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		MaxGenericClass<Integer> tester = new MaxGenericClass<Integer>(a,c,b);
		assertEquals(c,tester.findMax());
	}
	
	@Test
	public void maxCheckForThirdPositionForInteger() {
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		MaxGenericClass<Integer> tester = new MaxGenericClass<Integer>(a,b,c);
		assertEquals(c,tester.findMax());
	}
	
	@Test
	public void maxCheckForFirstPositionForFloat() {
		Float a = (float) 1;
		Float b = (float) 2;
		Float c = (float) 3;
		MaxGenericClass<Float> tester = new MaxGenericClass<Float>(c,b,a);
		assertEquals(c,tester.findMax());
	}
	
	@Test
	public void maxCheckForSecondPositionForFloat() {
		Float a = (float) 1;
		Float b = (float) 2;
		Float c = (float) 3;
		MaxGenericClass<Float> tester = new MaxGenericClass<Float>(a,c,b);
		assertEquals(c,tester.findMax());
	}
	
	@Test
	public void maxCheckForThirdPositionForFloat() {
		Float a = (float) 1;
		Float b = (float) 2;
		Float c = (float) 3;
		MaxGenericClass<Float> tester = new MaxGenericClass<Float>(a,b,c);
		assertEquals(c,tester.findMax());
	}
	
	@Test
	public void maxCheckForFirstPositionForString() {
		String a = "Apple";
		String b = "Banana";
		String c = "Peach";
		MaxGenericClass<String> tester = new MaxGenericClass<String>(c,b,a);
		assertEquals(c,tester.findMax());
	}
	
	@Test
	public void maxCheckForSecondPositionForString() {
		String a = "Apple";
		String b = "Banana";
		String c = "Peach";
		MaxGenericClass<String> tester = new MaxGenericClass<String>(a,c,b);
		assertEquals(c,tester.findMax());
	}
	
	@Test
	public void maxCheckForThirdPositionForString() {
		String a = "Apple";
		String b = "Banana";
		String c = "Peach";
		MaxGenericClass<String> tester = new MaxGenericClass<String>(a,b,c);
		assertEquals(c,tester.findMax());
	}

}
