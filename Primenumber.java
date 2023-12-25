import java.util.*;


class Primenumber
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int x=sc.nextInt();
        checkforprime p=new checkforprime();
        boolean str=p.checkforprime(x);
        System.out.println("Is the given value prime:"+str);
    }
}

class checkforprime
{
    private int n;
    public boolean checkforprime(int n)
    {
        this.n=n;
        if (n<=1)
        {
            return  false;
        }

        for(int i=2;i<n;i++)
        {
            if(n%i==0)
               return false;
        }
        return true;
    }
}