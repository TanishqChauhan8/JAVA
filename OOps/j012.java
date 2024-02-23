import java.util.Scanner;

class j012
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int c=0;
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
		for(int j=2;i<a[i];j++){
			if(a[i]%j==0)
			    break;
			else
			System.out.println(a[i]+"");
		    break;
		}
		}
	}
}
		
		
