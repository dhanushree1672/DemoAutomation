package com.sgtesting.SamplePrograms;
class NumberMiss
{
	static int miss()
	{
		int a=123567;
		int n=7;
		int sum=(a%10)*2;
		for(int i=0;i<n;i++)
		{
			sum=sum-1;
		}
		return sum;
	}
}
public class MissingNumber {
	public static void main(String[] args) {
		int a=NumberMiss.miss();
		System.out.println("The Missing Number in the given sequecial order is:"+a);
	}
}
