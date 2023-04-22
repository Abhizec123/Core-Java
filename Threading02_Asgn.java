/*
Observe the following carefully:
Replace ??? with suitable lines so that the output can be "Running thread". Ensure to 
display from run() method.
Write only the missing part as stated above. Avoid writing the full program / class, 
main() method, input / output handling or validation of inputs.
*/
public class Threading02_Asgn extends Thread 
{
    public static void main(String args[]) 
    {  
        Threading02_Asgn st = new Threading02_Asgn();  
    }
    //???
    Threading02_Asgn()
    {
        System.out.println("Running thread");
    }
    public void run() // you can ignore this function
    {
        System.out.println("Running thread");
    }      
}

