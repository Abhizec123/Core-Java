/*
Write a Java program to develop a stack of size 5, input choice and process as follows:
1: Push element
2: Pop element and display
0. Quit

When stack capacity is 5, display [Full-5] after detecting stack full exception and display
[Empty] after detecting stack empty exception.
Note: Answer box is already loaded with answer guidelines and part codes. You may use for
it rapid development.

For example:
Input	Result
2       [Empty]
0
*/

import java.util.*;
public class GenStack_Asgn
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        final int MAX=5;
        int i;
        Integer nums[]=new Integer[MAX];
        String str[]=new String[MAX];
        GenSimpleStack<String> stack2=new GenSimpleStack<String>(str);
        
        while(true)
        {
            int ch=sc.nextInt();   
            switch(ch)
            {
                case 0:
                    System.exit(1);
                case 1:
                    try
                    {
                        stack2.push(sc.next());
                    }
                    catch(StackFullException obj)
                    {
                        System.out.print(obj);
                    }
                    break;
                case 2:
                    try
                    {
                        System.out.print(stack2.pop()+" ");
                    }
                    catch(StackEmptyException obj)
                    {
                        System.out.print(obj);
                    }
                    break;
            }
        }
    }
}      

interface IGenSimpleStack<T>
{
    void push(T item) throws StackFullException;
    T pop() throws StackEmptyException;
    boolean isEmpty();
    boolean isFull();
}

class GenSimpleStack<T> implements IGenSimpleStack<T>
{
    private T[] data;
    private int tos;
    
    GenSimpleStack(T[] arrayRef)
    {
        data=arrayRef;
        tos=0;
    }
    public void push(T obj) throws StackFullException
    {
        if(isFull())
            throw new StackFullException(data.length);
        data[tos]=obj;
        tos++;
     }
     public T pop() throws StackEmptyException
     {
         if(isEmpty())
             throw new StackEmptyException();
         tos--;
         return data[tos];
     }
     public boolean isFull()
     {
         return tos==data.length;
     }
     public boolean isEmpty()
     {
         return tos==0;
     }
}

class StackFullException extends Exception
{
    int size;
    StackFullException(int s)
    {
        super("StackFull");
        size=s;
    }
    public String toString()
    {
        return "[Full-"+size+"] ";
    }
}

class StackEmptyException extends Exception
{
    int size;
    StackEmptyException()
    {
        super("StackEmpty");
    }
    public String toString()
    {
        return "[Empty]";
    }
}                

