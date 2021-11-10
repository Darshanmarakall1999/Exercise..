import java.util.Scanner;

public class Q9 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int n1=0,n2=1,n3;
		System.out.print("0 1 ");
		int i=3;
		while(i<=n)
			{
				n3=n1+n2;
				n1=n2;
				n2=n3;
				System.out.print(n3+" ");
				i++;
			}
		//c
		int n5=1;
		int n6=2;
		System.out.println();
		System.out.print(n5+" ");
		System.out.print(n6+" ");

		for(int j=3;j<=n;j++)
		{
			if(j%2 != 0)
			{
			n5=n5+3;
			System.out.print(n5+" ");
			}
			else
			{
			n6= n6+4;
			System.out.print(n6+" ");
			}
		}
			System.out.println();
		//d
		int m1=1;
		int m2=5;
		int m3=8;
		int m4;
		System.out.print(m1+" "+m2+" "+m3+" ");
		for(int x=4;x<=n;x++)
		{
			m4=m1+m2+m3;
			m1=m2;
			m2=m3;
			m3=m4;
			System.out.print(m4+" ");
		}
		
		
		
	}

}
