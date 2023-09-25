import java.lang.*;
import java.util.*;
class searchelemntarray
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int A[]={3,9,7,8,12,6,15,5,4,10};
		
		System.out.println("Enter the Key foe Search: ");
		int key=input.nextInt();

		//Using for loop
		/*for(int i=0;i<A.length;i++)
		{
			if(A[i]==key)
			{
				System.out.println("Element index are: "+i);
				System.exit(0);
			}
		}
		System.out.println("Element Not Found");*/
		//Using for each loop

		for(int x:A)
		{
			if(x==key)
			{
				System.out.println("Element Index are: "+x);
				System.exit(0);
			}
		}
		System.out.println("Element not Found");
	}
}