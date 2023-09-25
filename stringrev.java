import java.lang.*;
import java.util.*;
class stringrev
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the your name: ");
		String name=input.nextLine();
		String reverseName="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reverseName=reverseName+name.charAt(i);
		}
		System.out.println(reverseName);
		boolean ans=name.equals(reverseName);
		if(ans==true)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}