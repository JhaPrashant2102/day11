package com.dummyproject;

public class MaxInteger {
	private Integer n1;
	private Integer n2;
	private Integer n3;
	
	
	public MaxInteger(Integer n1, Integer n2, Integer n3) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	public int findMax() {
		return Math.max(n1, Math.max(n2, n3));
	}
}
