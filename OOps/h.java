import java.util.*;

class ABC{

public static void main(String args[])
{
	StringBuffer s=new StringBuffer();
	s.append("TANISHQ");
	s.replace(1,2,"S");
	s.insert(3,"ji");
	s.deleteCharAt(3);
	System.out.print(s);
}
}