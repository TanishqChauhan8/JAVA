 import java.util.Scanner;
 
 class j057
 {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		String s="",w="";
		System.out.print("Enter the String : ");
		s=sc.nextLine();
		s=s+" ";
		for(int i=0;i<s.length();i++)
		{
		  if(s.charAt(i)!=' ')
			w=w+s.charAt(i);
	
			else
			{
				for(int j=0;j< w.length();j++)
				{
					char ch=w.charAt(j);
				    if(Character.toUpperCase(ch)=='A'|| Character.toUpperCase(ch)=='I'|| Character.toUpperCase(ch)=='E'|| Character.toUpperCase(ch)=='O'|| Character.toUpperCase(ch)=='U')
					System.out.print(ch);
					
					else if(Character.toUpperCase(ch)!='A'|| Character.toUpperCase(ch)!='I'|| Character.toUpperCase(ch)!='E'|| Character.toUpperCase(ch)!='O'|| Character.toUpperCase(ch)!='U')
				{
					ch=(char)(ch-1);
					 if(Character.toUpperCase(ch)=='A'|| Character.toUpperCase(ch)=='I'|| Character.toUpperCase(ch)=='E'|| Character.toUpperCase(ch)=='O'|| Character.toUpperCase(ch)=='U')
					 ch=(char)(ch+2);
					
					System.out.print(ch);
				}
				}
				System.out.print(" ");
				w="";
			}
		}
	}
 }