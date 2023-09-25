import java.lang.*;
import java.util.Scanner;

class overloading
{
	int m,n;
	overloading() //default constructor
	{
		m=5;
		n=28;
	}
	overloading(int p, int q)   //parameterized constructor
	{
		m=p;
		n=q;
	}
	overloading(char x, char y)
	{
		m=x;
		n=y;
	}
	void dispaly()
	{
		System.out.println(m);
		System.out.println(n);
	}
};

class mainover
{
	public static void main(String[]args)
	{
		overloading obj1=new overloading();
		overloading obj2=new overloading(15,25);
		overloading obj3=new overloading('A','B');
		obj1.dispaly();
		obj2.dispaly();
		obj3.dispaly();

	}
}