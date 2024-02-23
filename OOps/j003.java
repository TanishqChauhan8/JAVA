import java.util.Scanner;

class j004
{
  public static void main(String ar[])
  {
	  int sp,cp,p,l,pp,lp;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Selling price and Cost price : ");
	  sp=sc.nextInt();
	  cp=sc.nextInt();
	  if(sp>cp)
	  {
		  p=sp-cp;
		  System.out.println("Your Profit amount is : "+p);
		  pp=(p*100)/cp;
		  System.out.println("Your Profit percentage is : "+pp);
	  }
	  else if(sp<cp)
	  {
		  l=cp-sp;
		  System.out.println("Your Loss amount is "+l);
		  lp=(l*100)/cp;
		  System.out.println("Your Loss Percentage is "+lp);
	  }
	  else
	  {
		  System.out.println("Neither profit nor loss");
	  }
  }
}