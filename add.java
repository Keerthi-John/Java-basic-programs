//Program to add two  numbers by taking input from the keyboard


java.util.Scanner;
class Demo{
public static void main(String args[])
{
 Scanner sc = new Scanner(System.in); //Creation of scanner object
 System.out.println("Enter two numbers");
 int a = sc.nextInt();   //Storing  of input from keyboard in the variable 
 int b = sc.nextInt();
 int c = a + b;
 
 System.out.println("The sum of two numbers"+a" and "+b" is " +c); //printing the result
 
 }
 }