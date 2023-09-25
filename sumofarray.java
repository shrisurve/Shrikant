import java.lang.*;
class sumofarray
{
	public static void main(String[] args)
	{
		int A[]={3,9,7,8,12,6,15,5,4,10};
		int sum=0;
		//Using for loop
		/*for(int i=0;i<A.length;i++)
		{
			sum=sum+A[i];
		}*/

		//Using for each loop
		for(int x:A)
		{
			sum=sum+x;
		}
		System.out.println("Sum is: "+sum);
	}
}