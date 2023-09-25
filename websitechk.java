import java.lang.*;
import java.util.*;
class websitechk
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a url ");
		String url=scan.nextLine();

		String protocol=url.substring('0', indexof(":"));
		if(protocol.equals("http"))
		{
			System.out.println("Hyper Text Transfer Protocol");
		}
		else if(protocol.equals("ftp"))
		{
			System.out.println("File Transfer Protocol");
		}


		String ext=url.substring(url.lastIndexOf(".")+1);
		if(ext.equals("com"))
		{
			System.out.println("Commercial website");
		}
		else if(ext.equals("org"))
		{
			System.out.println("Organisation website");
		}
		else if(ext.equals("net"))
		{
			System.out.println("Network website");
		}
	}
}