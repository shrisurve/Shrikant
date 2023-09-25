import java.lang.*;
import java.util.Scanner;
class triangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int length,breadth,area,perimeter;
		System.out.println("Enter the Lenght and breadth of triangle: ");
		length=sc.nextInt();
		breadth=sc.nextInt();
		area=length*breadth/2;
		perimeter=2*(length+breadth);

		System.out.println("Area is: "+area);
		System.out.println("Perimeter is: "+perimeter);
	}
}