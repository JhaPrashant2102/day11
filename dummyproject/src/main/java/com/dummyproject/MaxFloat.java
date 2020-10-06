package com.dummyproject;

public class MaxFloat {
	private Float n1;
	private Float n2;
	private Float n3;
	
	
	public MaxFloat(Float n1, Float n2, Float n3) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	public Float findMax() {
		Float max = n1;
		if(n2.compareTo(max)>0)
			max = n2;
		if(n3.compareTo(max)>0)
			max = n3;
		return max;
	}
}
