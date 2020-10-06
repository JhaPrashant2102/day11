package com.dummyproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxFloatTest {
	
	@Test
	public void maxCheckForFirstPosition() {
		Float a = (float) 1;
		Float b = (float) 2;
		Float c = (float) 3;
		MaxFloat tester = new MaxFloat(c,b,a);
		assertEquals(c,tester.findMax());
	}
	
	@Test
	public void maxCheckForSecondPosition() {
		Float a = (float) 1;
		Float b = (float) 2;
		Float c = (float) 3;
		MaxFloat tester = new MaxFloat(a,c,b);
		assertEquals(c,tester.findMax());
	}
	
	@Test
	public void maxCheckForThirdPosition() {
		Float a = (float) 1;
		Float b = (float) 2;
		Float c = (float) 3;
		MaxFloat tester = new MaxFloat(a,b,c);
		assertEquals(c,tester.findMax());
	}

}
