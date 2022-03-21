package hdfc.loans.exceptions;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) 
	{
		//int nr=100, dr=10,result;
		//int nr=100, dr=0,result;
		
		int nr, dr,result;
		//ArithmeticException a = new ArithmeticException("Divide by zero");
		
		Scanner sc= new Scanner(System.in);
		while (true) 
		{
			System.out.println("Enter the Nr value");
			nr=sc.nextInt();
			
			System.out.println("Enter the Dr value");
			dr=sc.nextInt();
			
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;
			}
			catch (ArithmeticException e) 
			{

				e.printStackTrace();
			} 
		}

	}

}
