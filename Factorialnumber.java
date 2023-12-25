import java.io.*;
import java.util.Scanner;

class factorial
{
 private int n;
 public int factorial(int x)
{
 n=x;
 int i=1;
 while(i!=n)
 {
  i=i*n;
  i=i+1;
 }
 return i;
}
}

public class Factorialnumber				
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a value:");
int x=sc.nextInt();
factorial f=new factorial();
int res=f.factorial(x);
System.out.println("Factorial value:"+res);
}
}
