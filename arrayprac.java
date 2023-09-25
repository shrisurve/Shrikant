import java.lang.*;
import java.util.*;
class arrayprac
{
	public static void main(String[] args)
	{
		int a[]={5,8,9,2,3,2,5};
		a[3]=90;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		System.out.println(" ");
		System.out.println(a.length);
	}
}