/*
45 23 67 12
23
Original List: 45 23 67 12
Sorted List: 67 45 23 12
Position: 2
*/

import java.util.*;

public class ArrayList02_Asgn 
{   
    // ???? Missing part
    static void populateList(Scanner sc,ArrayList <Integer> l)
    {
        String nums[]=sc.nextLine().split(" ");
        for(String i:nums)
            l.add(Integer.parseInt(i));
    }

    static void displayList(String s,ArrayList <Integer> l)
    {
        System.out.print(s+": ");

        for(int i=0;i<l.size();i++)
            System.out.print(l.get(i)+" ");
        System.out.println();
    }
 
    static void sortListDesc(ArrayList <Integer> l)
    {
        Collections.sort(l,Collections.reverseOrder());
    }

    static int binSearch(ArrayList <Integer> l,int val)
    {
        return Collections.binarySearch(l,val,Collections.reverseOrder());
    }
    public static void main(String[] args)
    {

        int key, index;       

        // Create Scanner objects
        Scanner sc = new Scanner(System.in);  // Handle inputs
        
        // Create a list of Integers
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Enter few numbers in a line and populate the list
        populateList( sc, al );    
        
        // Display list
        displayList( "Original List", al );
        
        // Sort list in descending order
        sortListDesc( al );
        
        // Display sorted list
        displayList( "Sorted List", al );
        
        // Input key
        key = sc.nextInt();
        
        // Perform binary search for key in al
        index = binSearch(al, key);
        if (index >= 0)
            System.out.println("Position: " + index);
        else
            System.out.println("Not found");
    }
}