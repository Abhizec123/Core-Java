// POSTFIX EVALUATION USING STACK
// 2 3 + = 5

import java.util.*;

public class PostfixUsingStack 
{
    public static void main(String args[])
    {
        int v1,v2;
        
        Scanner sc=new Scanner(System.in);
        
        // Read input line
        System.out.println("Enter the Expression...");
        String exp=sc.nextLine();
        
        // Populate an array of tokens
        String []expNew=exp.split(" ");
        
        // Create stack object
        stack s=new stack();
                
        // Process array elements in a loop
        for(int i=0;i<expNew.length;i++)
        {
            switch(expNew[i]) 
            {
                case "+":
                    v2=s.pop();
                    v1=s.pop();
                    s.push(v1+v2);
                    break;
                case "-":
                    v2=s.pop();
                    v1=s.pop();
                    s.push(v1-v2);
                    break;
                case "*":
                    v2=s.pop();
                    v1=s.pop();
                    s.push(v1*v2);
                    break;
                case "/":
                    v2=s.pop();
                    v1=s.pop();
                    s.push(v1/v2);
                    break;
                default:
                    s.push(Integer.parseInt(expNew[i]));                       
            }
        }
        
        // Display result
        System.out.print(s.pop());
    }
}

/* Declare Stack class */
class stack
{
    int top;
    int a[]=new int[50];
    
    stack()
    {
        this.top=-1;
    }
    public int isEmpty()
    {
        if(this.top==-1)
            return 1;
        else
            return 0;
    }
    
    public int isFull()
    {
        if(this.top==49)
            return 1;   
        else
            return 0;
    }
    public void push(int x)
    {
        if(isFull()==0)
        {
            this.a[++top]=x;
        }
    }
    public int pop()
    {
        if(isEmpty()==0)
        {
            return this.a[top--];
        }
        else
            return 0;
     }
}
