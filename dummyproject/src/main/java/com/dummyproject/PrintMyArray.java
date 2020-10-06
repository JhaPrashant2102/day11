package com.dummyproject;

public class PrintMyArray<T,U,V> {
	
	T arr[];
	U arr1[];
	V arr2[];
	
	
	public PrintMyArray(T[] arr, U[] arr1, V[] arr2) {
		super();
		this.arr = arr;
		this.arr1 = arr1;
		this.arr2 = arr2;
	}
	
	private void toPrint() {
		toPrint(this.arr);
		toPrint(this.arr1);
		toPrint(this.arr2);
	}
	
	public static <T> void toPrint(T arr[]) {
		for(T element : arr) {
			System.out.println("%s "+element);
		}
	}
	
	public static void main(String[] args) {
		Integer arr[] = {1,2,4,4,6,9};
		Double arr1[] = {1.2,2.3,4.6};
		Character arr2[] = {'a','b','c','d'};
		new PrintMyArray<Integer,Double,Character>(arr,arr1,arr2).toPrint();
	}

}
