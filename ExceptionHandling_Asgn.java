/*
 * Write a Java program to input n and add n number of integers.
 * In case of InputMismatchException, display "ERROR".
 * ->3
 * ->10 20 5
 * Ans -> 35
*/

import java.util.*;

public class ExceptionHandling_Asgn
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            int i,n,s=0;
               
            n=sc.nextInt();
            int a[]=new int[n];
        
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                s=s+a[i];
            }
                
            System.out.print(s);
        }
        catch(Exception e)
        {
            System.out.print("ERROR");
        }    
    }
}