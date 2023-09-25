import java.lang.*;
import java.util.*;
class leapyear
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Year Number: ");
		int year=scan.nextInt();
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("Its a leap year");
				}
				else
				{
					System.out.println("Its not leap year");
				}
			}
			else
			{
				System.out.println("Its a leap year");
			}

		}
		else
		{
			System.out.println("Its not leap year");
		}
	}
}