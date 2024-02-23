import java.util.Scanner;

class j011
{
	public static void main(String ar[])
	{
		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		for(int i=0;i<a.length;i++)
		{	
			if(a[i]<0)
			System.out.println(a[i]+"");
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			System.out.println(a[i]+"");
		}
    }
}