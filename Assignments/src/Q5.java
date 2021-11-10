import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		int n ,a,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter binary number:");
		n=sc.nextInt();
		int i=0;
		while(n>0)
		{
		a=n % 2;
		sum+=a*Math.pow(2, i);
		n=n/10;
		i++;
		}
		System.out.println("decimal number:"+sum);


		}

}
