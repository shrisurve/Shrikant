import java.lang.*;
import java.util.Scanner;
class example
{
	public static void main(String args[])
	{
	  Scanner S=new Scanner(System.in);
	  int num;
	  System.out.println("Enter the Number:");
	  num=S.nextInt();
	  if(num%2==0)
	  {
	  	System.out.println("Number is Even" +num);
	  }
	  else
	  {
	  	System.out.println("Number is Odd" +num);
	  }
    }
}