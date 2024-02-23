import java.util.Scanner;

class j069 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number up to where you want to print: ");
        n = sc.nextInt();
        int count=1,k=1;

        for (int j = 1; j <= n; j++) {
			int l=0;
			while(l!=count)
			{
			  System.out.print(k+" ");
			  
			  if (k == 15)
				break;
			
			 k++;
			 l++;
            }
			 if (k == 15)
				break;
			
			count++;
             System.out.println();
        }
    }
}