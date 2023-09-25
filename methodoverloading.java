class methodoverloading
{
	int max(int x,int y)
	{
		return x>y?x:y;
	}
	float max(float x,float y)
	{
		return x>y?x:y;
	}
	int max(int x,int y,int z)
	{
		return (x>y&&x>z)?x:(y>z)?y:z;
	}
	public static void main(String[]args)
	{
		methodoverloading obj=new methodoverloading();

		System.out.println("Maximum is: "+obj.max(10,5));
		System.out.println("Maximum is: "+obj.max(7,9,2));
		System.out.println("Maximum is: "+obj.max(3.9f,7.2f));


	}
}