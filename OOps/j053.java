import java.util.Scanner;

class j053 {
    public static void main(String ar[]) {
        String s = "", s1 = "", s2 = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        s = sc.nextLine();
        s = s + " ";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                s1 = s1 + s.charAt(i); 
                s2 = s.charAt(i) + s2;  
            } else {
                if (s1.equals(s2)) {
                    System.out.print(s1);
                    System.out.print(" ");    
                }
				s1="";
				s2="";
            }
		}

        }
    }
}
