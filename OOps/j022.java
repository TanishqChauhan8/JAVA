import java.util.Scanner;

class j022
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int p[]=new int[6];
		int q[]=new int[4];
		int r[]=new int[10];
		int k=0;
		System.out.println("Enter Element into the Array p: ");
		for(int i=0;i<6;i++)
			p[i]=sc.nextInt();
		
		System.out.println("Enter Element into the Array q: ");
		for(int i=0;i<4;i++)
			q[i]=sc.nextInt();
		
		System.out.println("Element in array j: ");
		for(int i=0;i<6;i++)
			r[i]=p[i];
		
		for(int i=6;i<10;i++)
		{
			r[i]=q[k];
			k++;
		}
		for(int i=0;i<10;i++)
		System.out.println(r[i]);
	}
	
}
			