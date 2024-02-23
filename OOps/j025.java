import java.util.Scanner;

class j025 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Number of Student: ");
        n = sc.nextInt();
        int rollno[] = new int[n];
        String name[] = new String[n];
        int marks1[] = new int[n];
        int marks2[] = new int[n];
        int marks3[] = new int[n];
        int avg;

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter the Roll Number of Student " + (i + 1) + " : ");
            rollno[i] = sc.nextInt();
            System.out.println("Enter the Name of the Student " + (i + 1) + " : ");
			sc.nextLine(); 
            name[i] = sc.nextLine();
            System.out.println("Enter the marks in 1st sub : ");
            marks1[i] = sc.nextInt();
            System.out.println("Enter the marks in 2nd Sub : ");
            marks2[i] = sc.nextInt();
            System.out.println("Enter the marks in 3rd Sub : ");
            marks3[i] = sc.nextInt();
            
            avg = (marks1[i] + marks2[i] + marks3[i]) / 3;
            
            if (avg > 85 && avg <= 100)
                System.out.println("Excellent");
            else if (avg > 75 && avg <= 84)
                System.out.println("Distinction");
            else if (avg > 60 && avg <= 74)
                System.out.println("First Class");
            else if (avg >= 40 && avg <= 59)
                System.out.println("Pass");
            else
                System.out.println("Poor");
        }
    }
}
