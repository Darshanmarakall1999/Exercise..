import java.util.Scanner;
//Write a program to find the factorial of a given number. 0! is always 1.
//Factorial of a negative number is not possible.
public class Q2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int fact=1;
		if(n>0)
		{
			System.out.println("Factoral="+Factorial(n));
		}
		else
			System.out.println("Factorial for negative number is not possible");
		
	}
	public static int Factorial(int n)
	{
		int fact=1;
		if(n==0 || n==1)
			return 1;
		for(int i=n;i>0;i--)
		{
			fact*=i;
		}
		return fact;
		
	}

}
