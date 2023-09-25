import java.lang.*;
import java.util.*;
class maxelement
{
	public static void main(String[] args)
	{
		int A[]={3,9,7,8,12,6,15,5,4,10};

		int max=A[0];
		/*for(int i=0;i<A.length;i++)
		{
			if(A[i]>max)
			{
				max=A[i];
			}

		}*/
		for(int x:A)
		{
			if(x>max)
			{
				max=x;
			}
		}
		System.out.println("Maximum Element is: "+max);
	}
}