import java.lang.*;
import java.util.*;
class gradecount
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Name of Student: ");
		String name=input.nextLine();
		System.out.println("Enter the Roll No of Strudent: ");
		int rollno=input.nextInt();

		System.out.println("Enter the Marks of three subject: ");
		double che,math,phy;
		 che=input.nextDouble();
		 math=input.nextDouble();
		 phy=input.nextDouble();


		double total=che+math+phy;
		System.out.println("Total are: "+total);

		double avg=total/3;
		System.out.println("Average are: "+avg);

		if(avg>=90 && avg<=100)
			System.out.println("Outstanding");
		else if(avg<90 && avg>=70)
			System.out.println("A");
		else if(avg<70 && avg>=60)
			System.out.println("B");
		else if(avg>=35 && avg<60)
			System.out.println("C");
		else 
			System.out.println("Fails");


	}
}