import java.lang.*;
import java.util.*;
class employee{
	public static void main(String args[])
	{
	   int a,b,c;
	   System.out.println("Enter the Age of Three persons:");
	   Scanner S=new Scanner(System.in);
	   a=S.nextInt();
	   b=S.nextInt();
	   c=S.nextInt();
	   if(a>b&&a>c)
	   {
	     System.out.println("A: is greater");
	   }
	   else if(b>c)
	   {
	     System.out.println("B: is greater");
	   }
	   else
	   {
	     System.out.println("C: greater");
	   }
	}

}