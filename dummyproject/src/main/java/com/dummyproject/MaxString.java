package com.dummyproject;

public class MaxString {
	private String n1;
	private String n2;
	private String n3;
	
	
	public MaxString(String n1, String n2, String n3) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	public String findMax() {
		String max = n1;
		if(n2.compareTo(max)>0)
			max = n2;
		if(n3.compareTo(max)>0)
			max = n3;
		return max;
	}
}
