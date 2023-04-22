// SINGLY-LINKED_LIST in Java using COLLECTION FRAMEWORK

import java.util.*;
public class SLL02 
{
   public static void main(String args[]) 
   {
        LinkedList<String> list = new LinkedList<String>();
        list.add("is");
        list.add("a");
        list.addLast("list");
        list.addFirst("this");
        list.add(3, "linked");
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.size());   
        list.remove(3);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
   }
}
