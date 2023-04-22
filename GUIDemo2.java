import java.awt.event.*;
import javax.swing.*;

public class GUIDemo2 
{
	public static void main(String [] args)
    {
		gui jf= new gui();
		jf.setComp();
		jf.setVisible(true);
		jf.setSize(400,400);
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}
class gui extends JFrame
{
	JLabel l1,l2,l3;
	JButton b;
	JTextField t1,t2;

    gui()
    {
        super("Admission Counter");
    }
    void setComp()
    {
		l1=new JLabel("CSE Count: ");
		l2= new JLabel("CSBS Count: ");
		b= new JButton("Submit");
		t1=new JTextField();
		t2= new JTextField();
		l3= new JLabel();
		l1.setBounds(20,30,100,30);
		l2.setBounds(20,70,100,30);
		t1.setBounds(120,30,100,30);
		t2.setBounds(120,70,100,30);
		b.setBounds(20,110,100,30);
		l3.setBounds(20,150,100,30);
		b.addActionListener(new act());
		
        add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(b);
		add(l3);
	}
    class act implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            int a= Integer.parseInt(t1.getText());
            int b1= Integer.parseInt(t2.getText());
            int sum= a+b1;
            l3.setText(" Result is : "+sum);	
        }
    }	
}	