package hdfc.loans.exceptions;

import java.util.Scanner;

public class UserDefinedException extends Exception
{

	public UserDefinedException(String string) 
	{
		super(string);
	}

	public static void main(String[] args) 
	{
		String str;
		Scanner sc = new Scanner(System.in);
		
		
		while (true) 
		{
			System.out.println("enter the 10 digit string :");
			str=sc.nextLine();
			try 
			{
				if (str.length() != 10) 
				{
					throw new UserDefinedException("Should be of 10 character only");
				}
				else
				{
					System.out.println(str);
					break;
				}
			} 
			catch (UserDefinedException e) 
			{

				e.printStackTrace();
			} 
			finally 
			{
				System.out.println("I am your final block");
				
			}
		}

	}

}
