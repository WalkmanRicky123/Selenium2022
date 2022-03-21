package hdfc.loans.homeloans;

import java.util.Scanner;

public class MathOperations {

	public static void main(String[] args) 
	{
		int a,b, result;
		char choice;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1.addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("Enetr your choice");
			choice=sc.next().charAt(0);
			
			switch (choice) 
			{
			
			case '1': System.out.println("Enter the valur for addition");
						a=sc.nextInt();
						b=sc.nextInt();
						result=a+b;
						System.out.println("Result of addition: "+result);
				
				break;
				
			case '2':System.out.println("Enter the valur for subtraction");
					a=sc.nextInt();
					b=sc.nextInt();
					result=a-b;
					System.out.println("Result of substraction: "+result);
				
				break;
				
			case '3': System.out.println("Enter the valur for multiplication");
					a=sc.nextInt();
					b=sc.nextInt();
					result=a*b;
					System.out.println("Result of multiplication: "+result);
	
				break;
				
			case '4':System.out.println("Enter the valur for division");
					a=sc.nextInt();
					b=sc.nextInt();
					result=a/b;
					System.out.println("Result of division: "+result);
	
				break;
				
			case '5':
				System.exit(0);
				break;

			default:System.out.println("Wrong Choice Enterd !!!!!!, please enter between 1-5");
				break;
			}
			
			
		}
		while(choice!=5);
		

	}

}
