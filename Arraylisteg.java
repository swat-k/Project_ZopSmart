import java.io.*;
import java.util.*;

class Arraylisteg
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
ArrayList<String>l1=new ArrayList<>();
l1.add("Anusha");
l1.add("Arvind");
l1.add("Ashwini");
l1.add("Shanthi");
l1.add("Kumar");
l1.add("Vaishnavi");
for(;;)
{
System.out.println("1:View List  2:Remove Element  3:Add Element  4:Exit");
System.out.println("Enter any one of the option:");
int val = sc.nextInt();
switch(val)
{
 case 1:
 System.out.println("Elements in the ArrayList");
Iterator<String>it =l1.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
break;
case 2:
System.out.println("Enter the position whose value is to be removed:");
int x=sc.nextInt();
l1.remove(x);
break;
case 3:
System.out.println("Enter the value to be added:");
String y=sc.next();
l1.add(y);
break;
default:System.exit(0);
}
}
}
}
