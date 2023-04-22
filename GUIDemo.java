import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIDemo implements ActionListener
{
	public static void main(String args[])
	{
        new GUIDemo();
    }

    //JTextField txt1, tx2;
    JTextField txt1, txt2; 
	JLabel jlab1, jlab2, jlab3;
    JFrame jfrm= new JFrame("Admission Counter");
	
	GUIDemo()
	{
        //max_x= 300, max_y= 200;
        
        jfrm.setSize(200, 100);
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //buttons
        JButton jbtn= new JButton("Submit");
        jbtn.addActionListener(this);
        
        //labels
        jlab1= new JLabel("Enter CSE Count: ");
        jfrm.add(jlab1);
		txt1= new JTextField(5);
		jfrm.add(txt1);
		
        jlab2= new JLabel("Enter CSBS Count: ");
        jfrm.add(jlab2);
		txt2= new JTextField(5);
		jfrm.add(txt2);
		
		jfrm.add(jbtn);
		
		jlab3= new JLabel("");
		jfrm.add(jlab3);
		
        jfrm.setVisible(true);
    }
	public String Checker(String a, String b)
	{
		String res;
		int num1, num2;

		if(a.length()==0)
			return "ERROR: Empty Input in CSE";
		else if(b.length()==0)
			return "ERROR: Empty Input in CSBS";
		try{
			num1= Integer.parseInt(a);
			if(num1<0)
				return "ERROR: Enter non negative number for CSE";
		}
		catch(NumberFormatException e){
			return "ERROR: Enter number for CSE";
		}
		try{
			num2= Integer.parseInt(b);
			if(num2<0)
				return "ERROR: Enter non negative number for CSBS";
			else
				res= Integer.toString(num1+num2);
			txt1.setEditable(false);
			txt2.setEditable(false);
			return "Count: " + res;
		}
		catch(NumberFormatException e){
			return "ERROR: Enter number for CSBS";
		}
	}
    public void actionPerformed(ActionEvent ae)
	{
        if(ae.getActionCommand().equals("Submit")){
            jlab3.setText(Checker(txt1.getText(), txt2.getText()));
        }
    }
}

