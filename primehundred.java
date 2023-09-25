import java.lang.*;
import java.util.*;
class primehundred
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Start Number: ");
		int start=input.nextInt();
		System.out.println("Enter the End Number: ");
		int end=input.nextInt();
		int count=0;
		System.out.println("");
		for(int i=start;i<=end;i++)
		{
			int j;
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if(i==j)
			{
				count++;
				System.out.print(i+" ");
			}
		}

		System.out.println("\nCount: "+count);
	}
}