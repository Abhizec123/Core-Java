/*
Output :- 
What? Form 1.
What? Form 2.
 */
interface Form1 
{ 
	public String base = "Form 1."; 
	abstract public void display1(); 
} 

// Create interface Form2 which extends Form1 
interface Form2 extends Form1
{ 
	public String base = "Form 2."; 
	abstract public void display2(); 
} 

// Create class FormGen is created which implements Form2 
class FormGen implements Form2 
{ 
	public String base = "Form 3."; 
	public void display1()
    {
        System.out.print("What? Form 1.");
    }
    public void display2()
    {
        System.out.print("\nWhat? Form 2.");
    }
} 

// Main class 
public class Interface02_Asgn
{ 
	public static void main(String[] args)
    { 
		// Instantiate FormGen and call display methods 
		FormGen form = new FormGen(); 

		form.display1(); 
		form.display2(); 
	} 
}