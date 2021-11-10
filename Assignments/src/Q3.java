import java.util.Scanner;
//Write a program to find whether a given number is a Fibonacci number or not.
public class Q3 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int n1=0,n2=1,n3;
		int i=0;
		if(n==0 || n==1)
		{
			System.out.println("Yes");
		}
		else	
		{
			while(i<=n+5)
			{
				i++;
				n3=n1+n2;
				n1=n2;
				n2=n3;
				if(n==n3)
				{
					System.out.println("Yes");
					break;
				}
				if(i==n+5) {
					System.out.println("No");
					break;}
				
			}
		}
	}

}
