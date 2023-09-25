import java.lang.*;
import java.util.*;
class primenumber
{
	static boolean isPrime(int n)
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=input.nextInt();
		System.out.println(isPrime(num));
	}
}