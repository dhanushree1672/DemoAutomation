package com.sgtesting.SamplePrograms;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		int num=9;
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count>2)
		{
			System.out.println("The given number "+num+" is a prime");
		}
		else
		{
			System.out.println("The given number "+num+" is not a prime");
		}

	}

}
