package com.dummyproject;

public class GenericClassFinal<T extends Comparable<T>> {

	private T max;
	
	public T getMax() {
		return max;
	}
	public void setMax(T max) {
		this.max = max;
	}
	public GenericClassFinal() {
		super();
	}
	public T maximum() {
		return max;
	}
	
	public T maximum(T ... args) {
		max = args[0];
		for(T t:args) {
			if(t.compareTo(max)>0) {
				max = t;
			}
		}
		return max;
	}
	
}
