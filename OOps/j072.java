import java.util.Scanner;

class j072
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		int n;
		char ch;
		System.out.print("Enter the Number of Friends : ");
		n=sc.nextInt();
		System.out.print("Enter the letter  : ");
		ch=sc.next().charAt(0);
		String name[]=new String [n];
		String phone[]=new String[n];
		sc=new Scanner (System.in);
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the Name of the Friend : ");
			name[i]=sc.nextLine();
			System.out.print("Enter the Phone Number of the Friend : ");
			phone[i]=sc.nextLine();
		}
		
		for(int i=0;i<n;i++)
		{
			if(name[i].charAt(0)==ch)
			System.out.println(name[i]+" - "+phone[i]);
		}
	}
}