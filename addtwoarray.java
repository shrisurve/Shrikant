import java.lang.*;
class addtwoarray
{
	public static void main(String[] args)
	{
		int A[][]={{1,2,3},{4,5,6},{7,8,9}};
		int B[][]={{5,7,3},{2,1,6},{9,8,5}};
		int C[][]=new int[3][3];

		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				C[i][j]=A[i][j]+B[i][j];
			}

		}
		/*for(int i=0;i<3;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
			System.out.print(C[i][j]+" ");
		    }
		    System.out.println(" ");
		}*/
		for(int x[]:C)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println(" ");
		}
		
	}
}