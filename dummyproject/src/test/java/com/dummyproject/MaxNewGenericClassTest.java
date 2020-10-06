package com.dummyproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxNewGenericClassTest {
	@Test
	public void maxCheckForFirstPositionforInteger() {
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		MaxNewGenericClass<Integer> tester = new MaxNewGenericClass<Integer>(c,b,a);
		assertEquals(c,tester.maximum());
	}
	
	@Test
	public void maxCheckForSecondPositionforInteger() {
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		MaxNewGenericClass<Integer> tester = new MaxNewGenericClass<Integer>(a,c,b);
		assertEquals(c,tester.maximum());
	}
	
	@Test
	public void maxCheckForThirdPositionforInteger() {
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		MaxNewGenericClass<Integer> tester = new MaxNewGenericClass<Integer>(a,b,c);
		assertEquals(c,tester.maximum());
	}
	
	
	@Test
	public void maxCheckForFirstPositionForFloat() {
		Float a = 1.3f;
		Float b = 2.6f;
		Float c = 3.9f;
		MaxNewGenericClass<Float> tester = new MaxNewGenericClass<Float>(c,b,a);
		assertEquals(c,tester.maximum());
	}
	
	@Test
	public void maxCheckForSecondPositionForFloat() {
		Float a = 1.3f;
		Float b = 2.6f;
		Float c = 3.9f;
		MaxNewGenericClass<Float> tester = new MaxNewGenericClass<Float>(a,c,b);
		assertEquals(c,tester.maximum());
	}
	
	@Test
	public void maxCheckForThirdPositionForFloat() {
		Float a = 1.3f;
		Float b = 2.6f;
		Float c = 3.9f;
		MaxNewGenericClass<Float> tester = new MaxNewGenericClass<Float>(a,b,c);
		assertEquals(c,tester.maximum());
	}
	
	@Test
	public void maxCheckForFirstPositionForString() {
		String a = "Apple";
		String b = "Banana";
		String c = "Peach";
		MaxNewGenericClass<String> tester = new MaxNewGenericClass<String>(c,b,a);
		assertEquals(c,tester.maximum());
	}
	
	@Test
	public void maxCheckForSecondPositionForString() {
		String a = "Apple";
		String b = "Banana";
		String c = "Peach";
		MaxNewGenericClass<String> tester = new MaxNewGenericClass<String>(a,c,b);
		assertEquals(c,tester.maximum());
	}
	
	@Test
	public void maxCheckForThirdPositionForString() {
		String a = "Apple";
		String b = "Banana";
		String c = "Peach";
		MaxNewGenericClass<String> tester = new MaxNewGenericClass<String>(a,b,c);
		assertEquals(c,tester.maximum());
	}
}
