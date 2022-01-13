package com.sgtesting.SamplePrograms;
class Sum
{
	int add()
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum=sum+i;

		}
		return sum;
	}
}
public class SumofDigits {
	public static void main(String[] args) {

		Sum o1=new Sum();
		int a=o1.add();
		System.out.print(a);

	}

}
