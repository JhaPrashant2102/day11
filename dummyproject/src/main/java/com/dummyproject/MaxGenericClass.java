package com.dummyproject;

public class MaxGenericClass<T extends Comparable> {
	
	private T a;
	private T b;
	private T c;
	
	public MaxGenericClass(T a, T b, T c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public T findMax() {
		T max = a;
		if(b.compareTo(max)>0)
			max = b;
		if(c.compareTo(max)>0)
			max = c;
		return max;
	}
}