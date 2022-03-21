package hdfc.loans.homeloans;

import java.util.Scanner;

public class SIngleDimensionArray {

	public static void main(String[] args) 
	{
		/*int[] a = {10,20,30,40};
		
		for(int i=0;i<a.length;i++)
		{
		
		System.out.println("a["+i+"]="+ a[i]); // Concatenation of i variable//
       */
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array size :");
		int asize = sc.nextInt();
		
		int[]a=new int [asize];
		int sum = 0;
		
		/*a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;// index out of bound exception if we add extra data
		*/
		
		System.out.println("enter the array elements: ");
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
			System.out.println("a["+i+"]="+ a[i]); // Concatenation of i variable//
			sum=sum+a[i];
		}
		System.out.println("sum of array is :"+sum);
		
		}

}
