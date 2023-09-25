import java.lang.*;
import java.util.Scanner;
class greaterno
{
	public static void main(String args[])
	{
		int a,b,c;
		System.out.println("Enter the three Numbers: ");

		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		if(a>b && a>c)
		{
			System.out.println(a+ " A is greater");
		}
		else if(b>c)
		{
			System.out.println(b+ " B is greater");
		}
		else
		{
			System.out.println(c+ " C is greater");
		}
	}
}