public class scstring
{
	public static void main(String args[])
	{
		string str="programmer@gmail.com";
		int i=str.indexOf('@');
		string uname=str.substring(0,i);
		string domain=str.substring(i+(str.lenght()));
		System.out.println("Username: "+uname);
		System.out.println("Domain: "+domain);
		System.out.println(domain.startsWith(gmail));
	}
}