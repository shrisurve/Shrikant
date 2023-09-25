import java.lang.*;
import java.util.*;
public class namevalidation
{
	static boolean isValid(String name)
	{
		return name.matches("[a-zA-Z0-9//s]+");
	}
	static boolean isValid(int age)
	{
		return age>=15 && age<=25;
	}
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String name=input.nextLine();
		System.out.println("Enter the Age: ");
		int age=input.nextInt();

		System.out.println(isValid(name));
		System.out.println(isValid(age));

	}
}