import java.lang.*;
import java.util.*;
public class variableargument
{
	static void show(int ...x)
	{
		for(int a:x)
		{
			System.out.print(a+" ");
		}
	}
	public static void main(String[]args)
	{
		show(new int[]{10,20,30,40});

	}
}