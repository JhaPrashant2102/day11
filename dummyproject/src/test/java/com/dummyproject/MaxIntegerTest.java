/**
 * 
 */
package com.dummyproject;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author prashant
 *
 */
public class MaxIntegerTest {
	
	@Test
	public void maxCheckForFirstPosition() {
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		MaxInteger tester = new MaxInteger(c,b,a);
		assertEquals(c,tester.findMax());
	}
	
	@Test
	public void maxCheckForSecondPosition() {
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		MaxInteger tester = new MaxInteger(a,c,b);
		assertEquals(c,tester.findMax());
	}
	
	@Test
	public void maxCheckForThirdPosition() {
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		MaxInteger tester = new MaxInteger(a,b,c);
		assertEquals(c,tester.findMax());
	}

}
