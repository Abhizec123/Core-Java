import java.awt.event.*;
import javax.swing.*;

public class GUIDemo3 
{
    public static void main(String args[])
    {
        Gui2 gr=new Gui2();
        gr.setComp();
        gr.setVisible(true);
        gr.setSize(500,500);
        gr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class Gui2 extends JFrame
{
    JLabel l1,l2;
    JTextField f1;
    JButton b;

    Gui2()
    {
        super("UD-Version");
    }
    void setComp()
    {
        l1=new JLabel("How much have you scored in PCA2 : ");
        f1=new JTextField();
        b=new JButton("Listen-UD");
        l2=new JLabel();
        
        l1.setBounds(20,30,250,20);
        f1.setBounds(250,30,50,20);
        b.setBounds(150,80,120,40);
        l2.setBounds(50,10,50,20);
        b.addActionListener(new act1());

        add(l1);
        add(f1);
        add(b);
        add(l2);
    }
    class act1 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            int n=Integer.parseInt(f1.getText());
            if(n>=35)
                l2.setText("Ok..Your mark's is quite good");
            else if(n>=30 && n<35)
                l2.setText("Not to worry!! Not to worry!! you can perform better");
            else
                l2.setText("you need a nice kick on your ass");    
        }
    }
}

