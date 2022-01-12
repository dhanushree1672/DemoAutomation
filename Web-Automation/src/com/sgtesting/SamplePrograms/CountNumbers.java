package com.sgtesting.SamplePrograms;

public class CountNumbers {

	public static void main(String[] args) {
		int count=0;
		int n=1234;
		while(n>0) {	
			n=n/10;
			count++;
		}
		System.out.println("Count of Numbers is:"+count);
	}
}
