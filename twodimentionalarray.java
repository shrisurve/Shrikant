import java.lang.*;
class twodimentionalarray
{
	public static void main(String[] args)
	{
		//int A[][]=new int[5][3];
		int B[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		for(int i=0;i<B.length;i++)
		{
			for(int j=0;j<B[0].length;j++)
			{
				System.out.print(B[i][j]+" ");
			}
			System.out.println(" ");
		}
		/*for(int x[]:B)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println(" ");
		}*/
	}
}