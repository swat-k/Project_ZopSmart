import java.util.*;

public class Palindrome {
    public static void main(String[]args)
    {
        String res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        String rstr="";
        char ch;
        for (int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            rstr=ch+rstr;
        }
        if(str.equals(rstr))
        {
            System.out.println(str+" "+rstr);
            System.out.println("The given string is in Palindrome");
        }
        else
        {
            System.out.println(str+" "+rstr);
            System.out.println("The given string is not in Palindrome");
        }
    }

}
