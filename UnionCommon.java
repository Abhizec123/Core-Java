// Intersection & Common Elements of an Array in O(n) Complexity using HashSet

import java.util.HashSet;

public class UnionCommon 
{
    public static void main(String args[]) 
    {
        int a[]={1,5,4,7,3,2};
        int b[]={5,9,1,6,8};

        // Union of 2 arrays
        System.out.print("Union of 2 Arrays....\n");
        Union(a,b);
        
        // Common Element of 2 arrays
        System.out.print("\nIntersection of 2 Arrays....\n");
        Common(a,b);
    }

    public static void Union(int a[],int b[])
    {
        HashSet <Integer> map=new HashSet<>();
        int i;

        for(i=0;i<a.length;i++)
            map.add(a[i]);
        for(i=0;i<b.length;i++)
            map.add(b[i]);
        System.out.print(map);    
    }

    public static void Common(int a[],int b[])
    {
        HashSet <Integer> map=new HashSet<>();
        int i;
        
        for(i=0;i<a.length;i++)
            map.add(a[i]);
        for(i=0;i<b.length;i++)
        {
            if(map.contains(b[i])==true)
                System.out.print(b[i]+" ");        
        }
    }
}
