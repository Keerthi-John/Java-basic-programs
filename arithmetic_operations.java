#Program to perform arithmetic operations by taking input from user

import java.util.Scanner;

public class Demo
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in)
		System.out.println("Enter two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();

		int c = a + b;
		System.out.println("Addition of numbers is: "+c);
		int d = a - b;
		System.out.println("Subtraction of numbers is: "+d);
		int e = a * b;
		System.out.println("Multiplication  of numbers is: "+e);
		int f = a / b;
		System.out.println("Division of numbers is: "+f);
	}
}

		
		
