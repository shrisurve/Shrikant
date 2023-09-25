import java.lang.*;
import java.util.*;
class highestcommonfactor
{
	static int hcf(int m,int n)
	{
		while(m!=n)
		{
			if(m>n)m=m-n;
			else n=n-m;
		}
		return m;
	}
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int a=input.nextInt();
		int b=input.nextInt();

		int c=hcf(a,b);
		System.out.println("Highest Common Factor is: "+c);

	}
}