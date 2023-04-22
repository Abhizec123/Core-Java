import java.util.*;

class ObjectPassing
{
    public static void main(String args[])
    {    
        Scanner sc=new Scanner(System.in);
        Solution obj1=new Solution();
        Solution obj2=new Solution();
        
        System.out.println("Enter x1 & y1 : ");
        obj1.x=sc.nextInt();
        obj1.y=sc.nextInt();
        
        System.out.println("Enter x2 & y2 : ");
        obj2.x=sc.nextInt();
        obj2.y=sc.nextInt();
        
        System.out.println("The Radius is : "+obj1.calculate(obj1,obj2));        
    }
}
class Solution
{
    int x,y;
    
    double calculate(Solution ob1,Solution ob2)
    {
        double a=(ob1.x+ob1.y)*(ob1.x+ob1.y);
        double b=(ob2.x+ob2.y)*(ob2.x+ob2.y);
        double ans=Math.sqrt(a+b);
        return ans;
    }    
}