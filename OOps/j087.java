import java.util.Scanner;

class Sale
{
	String title="";
	String auth="";
	String pub="";
	double price;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.print("Enter the Tile : ");
		title=sc.nextLine();
		System.out.print("Enter the Author Name : ");
		auth=sc.nextLine();
		System.out.print("Enter the publictaion : ");
		pub=sc.nextLine();
		System.out.print("Enter the Price of the Book : ");
		price=sc.nextDouble();
	}
	
	void display()
	{
		System.out.println("Tile - "+title);
		System.out.println("Author Name - "+auth);
		System.out.println("Publication Name - "+pub);
		System.out.println("Price - "+price);
	}
}

class purchase extends Sale
{	
	double noc,amount;
	void accept()
	{
		System.out.print("Enter the Number of Copies : ");
		noc=sc.nextInt();
	}
	
	void calculate()
	{
	amount=noc*price;
	}
	
	void show()
	{
		display();
		System.out.println("Number of copies - "+noc);
		System.out.println("Amount - "+amount);
	}
	
	public static void main(String ar[])
	{
		purchase ob=new purchase();
		ob.input();
		ob.accept();
		ob.calculate();
		System.out.println("<====================================>");
		ob.show();
	}
}
	