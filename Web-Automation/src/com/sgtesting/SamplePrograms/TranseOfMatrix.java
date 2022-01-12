package com.sgtesting.SamplePrograms;

public class TranseOfMatrix {

	public static void main(String[] args) {
		int a[][]= {{4,7},{2,9},{9,6}};
		int b[][]= {{5,8},{7,9},{6,8}};
		int c[][]=new int[3][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int k=1;k>=0;k--)
		{
			for(int m=2;m>=0;m--)
			{
				System.out.print(c[m][k]+" ");
			}
			System.out.println();
		}
	}
}
