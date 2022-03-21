package hdfc.loans.homeloans;

import java.util.Scanner;

public class DebuggingDemo 
{
	public int m1()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array size :");
		int asize = sc.nextInt();
		
		int[]a=new int [asize];
		int sum = 0;
		
		
		System.out.println("enter the array elements: ");
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
			System.out.println("a["+i+"]="+ a[i]); // Concatenation of i variable//
			sum=sum+a[i];
		}
		System.out.println("sum of array is :"+sum);
		return sum;
	}

	public static void main(String[] args) 
	{
		
		DebuggingDemo obj = new DebuggingDemo();
		int count = obj.m1();
		System.out.println("count of array is:" +count);

	}

}
