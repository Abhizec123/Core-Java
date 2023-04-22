import java.util.*;

public class Threading03
{
    public static void main(String args[])
    {
        System.out.print("\nMain Thread Started");
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter a No : ");
        int n=sc.nextInt();

        MyThread1 mt=new MyThread1("Reverse",n);
        Thread th=new Thread(mt);
        th.start();

        System.out.print("Main Thread Ended");
    }
}
class MyThread1 implements Runnable
{
    int d,n,sum=0;
    String s;

    MyThread1(String s,int n)
    {
        this.s=s;
        this.n=n;
    }
    public void run()
    {
        System.out.println("\n"+s+" Thread Started");
        while(n>0)
        {
            d=n%10;
            sum=(sum*10)+d;
            n=n/10;
        }
        System.out.print("Reverse : "+sum);
        System.out.print("\n"+s+" Thread Ended");
    }
}