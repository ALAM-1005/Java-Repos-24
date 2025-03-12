package com;

public class PrintEvenNumber {
	public static void main(String[] args) {
		int[] a = {10,11,12,13,14,15};
		for(int i=0;i<a.length;i++)
		if(a[i]%2 == 0){
			System.out.println("even number -->"+a[i]);
		}
		for(int i=0;i<a.length;i++) {
		if(a[i]%2 ==1) {
			System.out.println("odd Number -->"+a[i]);
		}
	}
	}
}
