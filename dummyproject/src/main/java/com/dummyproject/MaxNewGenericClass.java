package com.dummyproject;

public class MaxNewGenericClass<T extends Comparable<T>> {
	
	private T a;
	private T b;
	private T c;
	
	public MaxNewGenericClass(T a, T b, T c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public T maximum() {
		return MaxNewGenericClass.maximum(a,b,c);
	}
	
	public static<T extends Comparable<T>> T maximum(T a,T b, T c) {
		T max = a;
		if(b.compareTo(max)>0)
			max = b;
		if(c.compareTo(max)>0)
			max = c;
		printMax(a,b,c,max);
		return max;
		
	}
	
	public static <T> void printMax(T a,T b, T c,T max) {
		System.out.printf("Maximum of %s, %s and %s is %s\n",a,b,c,max);
	}
	
	public static void main(String args[]) {
		Float a = 6.6f;
		Float b = 7.6f;
		Float c = 8.6f;
		new MaxNewGenericClass(a,b,c).maximum();
	}
}
