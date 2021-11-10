import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		int n , count = 0,a;
		String x = " ";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter decimal number:");
		n=sc.nextInt();
		while(n>0)
		{
		a=n % 2;
		x=a+""+x;
		n=n/2;
		}
		System.out.println("binary number:"+x);


		}



}
