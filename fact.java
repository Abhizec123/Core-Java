//Use of Arrays.fill()

import java.util.*;

public class fact
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        int n = sc.nextInt();
        double arr[] = new double[10];
        Arrays.fill(arr, 999);
        int j = 0;
        while(sc.hasNextDouble())
        {
            double a = sc.nextDouble();
            arr[j++] = a;
        }
        Arrays.sort(arr);
        
        System.out.print("\nSorted Array...");
        for(i=0;i<j;i++)
            System.out.print(arr[i]+" ");
        System.out.println("\nThe nth Element is : "+arr[n]);
    }
}