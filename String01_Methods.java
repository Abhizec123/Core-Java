//String functions in JAVA

import java.util.*;

public class String01_Methods
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        //String declaration and taking input
        String s1="Pachu";
        String s2=sc.nextLine();
        
        //Method 1: Concatenation
        System.out.println(s1+" "+s2+"  : Age = "+2+4);
        System.out.println("-----------------------------------------");
        
        //Method 2: Findling length of a string
        int l=s2.length();
        System.out.println("The Length of s2 is : "+l);
        System.out.println("-----------------------------------------");
        
        //Method 3: Accessing characters of a string
        for(int i=0;i<l;i++)
            System.out.println(s2.charAt(i));
        System.out.println("-----------------------------------------");
            
        //Method 4: split() - Returns Array of Strings
        String s3="Laddu Kumar Mondal";
        String a[]=s3.split(" ");
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
        System.out.println("-----------------------------------------");
            
        //Method 5: indexOf() - Searches for the first occurence of a character or substring
        //lastIndexOf() - Searches for the last occurence of a character or substring
        String s4="You are a very good looking guy. You should try talking with her";
        System.out.print("word You found at : "+s4.indexOf("You")+" and "+s4.lastIndexOf("You")+"\n");
        System.out.println("-----------------------------------------");
        
        //Method 6: Coverting Integer to String and Vice Versa
        String s5="120";
                
        int n=Integer.parseInt(s5); //String to Integer conversion
        String s6=Integer.toString(n); //Integer to String conversion
        System.out.println((n+1)+"||"+s6);
        System.out.println("-----------------------------------------");
        
        //Method 7: Changing the case of Characters within a string
        String s7="VIKRAM";
        System.out.println(s7.toLowerCase()+"||"+s3.toUpperCase());
        System.out.println("-----------------------------------------");
        
        //Method 8: Substring
        String s8="Tony Stark";     
        System.out.println(s8.substring(0,4));
        System.out.println("-----------------------------------------");
        
        //Method 9: replace()
        String s9 = "i";
        s9 = s9.replace("i","iiiiiiiiii");//X10
        s9 = s9.replace("i","iiiiiiiiii");//X100
        s9 = s9.replace("i","iiiiiiiiii");//X1000
        s9 = s9.replace("i","Abhishek\n");//X10
        System.out.println(s9);
        System.out.println("-----------------------------------------");
        
        //Method 10: trim()
        String s10="   Hello baby  wassup   ";
        System.out.println(s10.trim()); 
        System.out.println("-----------------------------------------");
        
        //Method 11: startsWith() and endsWith() - returns boolean
        String s11="Foobar";
        boolean ans1=s11.startsWith("Foo");
        System.out.println(ans1);
        ans1=s11.endsWith("Bar");
        System.out.println(ans1);
        System.out.println("-----------------------------------------");
        
        //Method 12: equals() VS == VS comapreTo() 
        //== (not used in most of the cases)
        String s12="Hello";
        String s13="hello";
        
        System.out.println(s12.equals(s13));
        System.out.println(s12.equalsIgnoreCase(s13));
        
        if(s12.compareTo(s13)==0)
            System.out.println("Equal");
        else if(s12.compareTo(s13)>0)
            System.out.println(s12+" > "+s13);
        else
            System.out.println(s12+" < "+s13);       
    }
}