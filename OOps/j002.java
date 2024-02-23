import java.util.Scanner; 

class j002
{
	public static void main(String [] ar)
	{
		int a,b,c,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three Angles : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		sum=a+b+c;
		System.out.println("Sum is "+sum);
		if(sum<180 || sum>180)
			System.out.println("Triangle is not possible");
		else
		{
		  if(a<90 && b<90 && c<90)
            System.out.println("Its an acute angle Triangle");	
         else if(a==90 || b==90 ||c==90)
            System.out.println("Its an Right angle Triangle");
         else
            System.out.println("Its an obtuse angle Triangle");
        }		
	}
}
