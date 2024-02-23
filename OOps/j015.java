import java.util.Scanner;

class j015
{
	public static void main(String ar[])
	{
		int n=0;
		int temp1=0;
		int temp2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of element in the list: ");
		n=sc.nextInt();
		int list[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter element into the list:");
			list[i]=sc.nextInt();
		}
		
		for(int i=0;i<(n/2);i++)
		{
			for(int j=i+1;j<(n/2);j++)
			{
				if(list[i]>list[j])
					temp1=list[i];
					list[i]=list[j];
					list[j]=temp1;
			}
		}
		for(int i=n/2;i<n;i++)
		{
		for(int j=i+1;j<n;j++)
			{
				if(list[i]<list[j]){
					temp2=list[i];
					list[i]=list[j];
					list[j]=temp2;
				}
			}
		}
		System.out.println("The sorted list is ----> ");
		for(int i=0;i<n;i++)
			System.out.println(list[i]+"");
	}
}
		
				