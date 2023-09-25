import java.lang.*;
import java.util.*;
class menudriven
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("======");
		System.out.println("ADD");
		System.out.println("SUB");
		System.out.println("MUL");
		System.out.println("DIV");

		System.out.println("Enter the two numbers:");
		int x=scan.nextInt();
		int y=scan.nextInt();
		scan.nextLine();

		System.out.println("Enter the option in word");
		String option=scan.nextLine();
		

		switch(option)
		{
		case "ADD": System.out.println("Sum is: "+(x+y));
			break;

		case "SUB": System.out.println("Difference is: "+(x-y));
			break;

		case "MUL": System.out.println("Product is: "+(x*y));
			break;

		case "DIV": System.out.println("Ratio is: "+(x/y));
			break;

		default : System.out.println("Invalid Option");
		}
	}
}