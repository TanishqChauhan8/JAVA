import java.util.Scanner;

class j028
{
	public static void main(String ar[])
	{
		int m[][]={{-1,0,2},{-3,-1,6},{4,3,-1}};
		int sum[][]={{-6,9,4},{4,5,0},{1,-2,-3}};
		System.out.println("The array n[] is ---> ");
		int n[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			    n[i][j]=sum[i][j]-m[i][j];
				System.out.print(" "+n[i][j]);
			}
			System.out.println();
		}
	}
}