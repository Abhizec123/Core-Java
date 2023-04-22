// ERROR will be encountered if we typa a string in place of Integer
/*
 * Q.1.) What is an exception?
Exception is an abnormal condition that occurs during program execution and disrupts the normal flow of the program
If an exception is not handled, then it terminates the program abruptly

Q.2.) How are exceptions handled in Java?
Exceptions are handled with the help of try, catch and finally block.
try - surround the code in try block where exception might occur
catch - catch block handles the exception gracefully

Q.3.) What is finally Block?
Finally blocks are executed every time
Finally blocks are executed when exception occurs or doesn’t occur

Q.4.) Can we avoid the execution of finally block?
Finally block is not executed when System.exit is called either from try or catch block
This is the only case when finally block is not executed

Q.5.) Can we have multiple catch block for a try block?
Yes. We can have multiple catch block for a try block

Q.6.) What is unreachable catch block in Java?
Catch block becomes unreachable when broader exception is handled before specific exception.

Q.7.) Can we have try block without catch or finally?
No. You cannot write try block without catch or finally
 */

import java.util.*;

public class ExceptionHandlingDemo 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            int i,n,s=0;
            
            System.out.print("Enter the No of Elements : ");
            n=sc.nextInt();
            int a[]=new int[n];
        
            for(i=0;i<n;i++)
            {
                System.out.print("Enter a No : ");
                a[i]=sc.nextInt();
            }
            for(i=0;i<a.length;i++)
                s=s+a[i];
            
            System.out.print(s);
        }
        catch(Exception e)
        {
            System.out.print("ERROR");
        }    
    }
}

