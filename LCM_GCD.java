// Most Optimized Logic of finding LCM and GCD

public class LCM_GCD 
{
    public static void main(String args[])
    {
        System.out.print("LCM of 2 and 5 is..."+lcm(2,5));
        System.out.print("\nGCD of 2 and 5 is..."+gcd(2,5));
    }
    static int lcm(int a,int b)
    {
        return (a*b)/gcd(a,b);
    }
    static int gcd(int a,int b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
}
