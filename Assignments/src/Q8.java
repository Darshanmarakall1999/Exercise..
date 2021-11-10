import java.util.Scanner;

public class Q8 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double grand_total=0;
		while(true)
		{
			System.out.println("Enter the item code:");
			int i_code=sc.nextInt();
			System.out.println("Enter the description:");
			String desc=sc.next();
			System.out.println("Enter Quntity:");
			int qty=sc.nextInt();
			System.out.println("Enter the item price:");
			double price=sc.nextDouble();
			double total=qty*price;
			grand_total+=total;
			System.out.println("Do yo want to continue press 'Y' or press 'N':");
			char choice=sc.next().charAt(0);
			if(choice=='Y')
				continue;
			else
				break;
			
		}
		System.out.println("how do you want pay? by cash press'$' or by card press 'c':");
		char type=sc.next().charAt(0);
		if(type=='$')
		{
			    if(grand_total>10000)
				{
					grand_total=grand_total*0.9;
					System.out.println("Grand_Total="+grand_total);
				}
			    else
			    {
					System.out.println("Grand_total="+grand_total);
				}
		}
		else if(type=='c')
		{
			if(grand_total>10000)
			{
				grand_total=grand_total*0.9;
				System.out.println("Grand_Total="+grand_total);
			}
			if(grand_total<1000)
			{
				grand_total+=grand_total*0.025;
				System.out.println("Grand_Total="+grand_total);
			}
		}
	}

}
