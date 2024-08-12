package cab_booking;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Index extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JButton  bt1,bt2;
    JPanel p1,p2,p3;
    Font f,f1;
    
    Index()
    {
        super("Home Page");
        setLocation(450,250);
        setSize(500,200);
        
        f=new Font("Arial",Font.BOLD,20);
        f1=new Font("Arial",Font.BOLD,15);
        
        l1=new JLabel("Admin Login");
        l2=new JLabel("Customer Login");
        
        bt1=new JButton("Login");
        bt2=new JButton("Login");
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        
        ImageIcon c=new ImageIcon(ClassLoader.getSystemResource("cab_booking/Icons/login.png"));
	Image i=c.getImage().getScaledInstance(130,100,Image.SCALE_DEFAULT);
	ImageIcon c1=new ImageIcon(i);
	l3=new JLabel(c1);
        
        l4=new JLabel("Cab Booking Management");
        l4.setHorizontalAlignment(JLabel.CENTER);
        
        l4.setFont(f);
        l1.setFont(f1);
        l2.setFont(f1);
        bt1.setFont(f1);
        bt2.setFont(f1);
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(2,2,10,10));
        p1.add(l1);
        p1.add(bt1);
        p1.add(l2);
        p1.add(bt2);
        
        p2=new JPanel();
        p2.setLayout(new GridLayout(1,1,10,10));
        p2.add(l3);
        
        p3=new JPanel();
        p3.setLayout(new GridLayout(1,1,10,10));
        p3.add(l4);
        
        setLayout(new BorderLayout(10,10));
        add(p3,"North");
        add(p2,"West");
        add(p1,"Center");        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bt1)
        {
            new AdminSection().setVisible(true);
        }
        if(e.getSource()==bt2)
        {
            new Login();
        }
    }
    public static void main(String[] args) 
    {
        new Index().setVisible(true);
    }
}
