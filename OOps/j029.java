import java.util.Scanner;

class j029 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
		int c=0;
        System.out.print("Enter the Number of Floors in the Hotel : ");
        int f = sc.nextInt();
        System.out.print("Enter the Number of Rooms in each floor : ");
        int r = sc.nextInt();
        sc.nextLine();

        String a[][] = new String[f][r];
        for (int i = 0; i < f; i++) 
		{
            for (int j = 0; j < r; j++) 
			{
                System.out.print("Enter the Name of the Visitor for Room [" + (j + 1) + "] floor [" + i + "] : ");
                a[i][j] = sc.nextLine();
            }
        }
        System.out.print("Enter the Name of the Visitor whose Detail You want to fetch : ");
        String s = sc.nextLine();
        for (int i = 0; i < f; i++) 
		{
            for (int j = 0; j < r; j++) 
			{
                if (s.equals(a[i][j])) 
				{
                    System.out.println("Floor Number ---> " + i);
                    System.out.println("Room Number ---> " + (j + 1));
					c=1;
                }
            }
        }
		if(c!=1)
		System.out.println("Visitor Not found");
    }
}
