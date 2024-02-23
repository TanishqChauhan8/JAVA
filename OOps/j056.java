import java.util.Scanner;

class j056 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        String s = "", w = "";
        System.out.print("Enter the Word  : ");
        s = sc.nextLine();
        s = s + " ";
        for (int i = 0; i < s.length(); i++) 
		{
            if (s.charAt(i) != ' ') 
			{
                char ch = s.charAt(i);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
				ch=(char)(ch+1);
                w = w + ch;
            } 
			else
			{
                for (int j = 0; j < w.length(); j++) 
				{
                    char ch = w.charAt(j);
                    if (Character.isLowerCase(ch)) 
                        ch = Character.toUpperCase(ch);
                  
                     else if (Character.isUpperCase(ch)) 
                            ch = Character.toLowerCase(ch);
                        
						System.out.print(ch);
                }
                System.out.print(" ");
                w = "";
            }
        }
    }
}
