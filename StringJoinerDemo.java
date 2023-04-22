// StringJoiner class in JAVA

import java.util.*;
 
public class StringJoinerDemo 
{
    public static void main(String[] args) 
    {    
        // Helps to join multiple Strings with a delimeter in between
        StringJoiner joiner = new StringJoiner(",");
        joiner.add("How").add("are").add("you?");
        System.out.println(joiner);
        
        // Helps to add a prefix and sufix to a string like "[...]"
        StringJoiner joiner2 = new StringJoiner(" ", "[", "]");
        joiner2.add("India").add("is").add("beautiful").add("country!!!");
        System.out.println(joiner2);
        
        // Merging two Strings
        StringJoiner mergedStr = joiner.merge(joiner2);
        System.out.println(mergedStr);
    }
}
