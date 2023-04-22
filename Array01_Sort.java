import java.util.*;

public class Array01_Sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        double arr[]=new double[100];
        Arrays.fill(arr,10000.0);
        int n=0;
        
        System.out.print("Enter a Number : ");
        while(sc.hasNextDouble())
        {
            System.out.print("Enter a Number : ");
            arr[n++]=sc.nextDouble();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.printf("%.2f",arr[i]);
            System.out.print(" ");
        }
     }
} 
      