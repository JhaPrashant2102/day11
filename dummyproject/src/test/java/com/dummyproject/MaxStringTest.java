package com.dummyproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxStringTest {
	@Test
	public void maxCheckForFirstPosition() {
		String a = "Apple";
		String b = "Banana";
		String c = "Peach";
		MaxString tester = new MaxString(c,b,a);
		assertEquals(c,tester.findMax());
	}
	
	@Test
	public void maxCheckForSecondPosition() {
		String a = "Apple";
		String b = "Banana";
		String c = "Peach";
		MaxString tester = new MaxString(a,c,b);
		assertEquals(c,tester.findMax());
	}
	
	@Test
	public void maxCheckForThirdPosition() {
		String a = "Apple";
		String b = "Banana";
		String c = "Peach";
		MaxString tester = new MaxString(a,b,c);
		assertEquals(c,tester.findMax());
	}
}
