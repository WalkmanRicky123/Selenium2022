package hdfc.loans.homeloans;

import java.util.Scanner;

public class StudentGradeCalculation 
{

	public static void main(String[] args) 
	{
		int[]marks= new int[5];
		float sum=0.0f,avg=0.0f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks obtained in 5 subjects :");
		
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
			sum=sum+marks[i];
		}
		System.out.println("sum of 5 subjects :"+sum);
		avg=sum/marks.length;
		System.out.println("Average marks of Subject is :"+avg);
		
		System.out.println("your grade is :");
		if(avg>80)
		{
			System.out.println("Grade A");
		}
		else if (avg>60 && avg<80) 
		{
			System.out.println("Grade B");
			
		}
		else if (avg>40 && avg<60) 
		{
			System.out.println("Grade C");
			
		}
		else 
		{
			System.out.println("Grade D");
		}

	}

}
