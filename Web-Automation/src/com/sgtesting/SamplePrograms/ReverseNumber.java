package com.sgtesting.SamplePrograms;
class Reverse
{
	int reverse(int num) {
		int count=0;
		for(int i=num;i>0;i--)
		{
			num=num/10;
			count++;
		}
		return count;
	}
}
public class ReverseNumber {
	public static void main(String[] args) {
		Reverse rev=new Reverse();
		int val=rev.reverse(1234);
		System.out.println("The reverse of given number is:"+val);
	}
}
