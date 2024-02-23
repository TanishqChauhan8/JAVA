 import java.util.Scanner;
 
 class j008
 {
	 public static void main(String[] ar)
	 {
		 int arr[]=new int[10];
		 Scanner sc=new Scanner(System.in);
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
	     }
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
	 }
 }