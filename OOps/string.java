class ABC
{
	public static void main(String ar[])
	{
		String s1="My name is Tan";
		String str[]=s1.split(" ");
		String s2=new String();
		for(int i=0;i<str.length;i++)
		{
			s2=" "+str[i]+s2;
		}
		s2=s2.trim();
		System.out.print(s2);
	}
}