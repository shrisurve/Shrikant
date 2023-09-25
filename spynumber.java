import java.lang.*;
import java.util.*;
class spynumber
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=input.nextInt();
		
		int rem,sum=0,multi=1;
		while(num!=0)
		{
			rem=num%10;
			sum+=rem;
			multi*=rem;
			num/=10;
		}
		if(sum==multi)
		{
			System.out.println("this is spynumber");
		}
		else
		{
			System.out.println("this is not spynumber");
		}

	}
}