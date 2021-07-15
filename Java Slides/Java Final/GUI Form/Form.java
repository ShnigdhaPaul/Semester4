import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Form extends JFrame implements ActionListener
{
	JButton b1;
	JTextField t1;
	JTextField t2;
	//JPasswordField p1;
	public Form()
	{
	  this.setLayout(null);
	  //JPanel p=new JPanel();
	  //p.setLayout(null);
	  t1=new JTextField();
	  t1.setText("User");
	  t1.setBounds(50,100,100,50);
	  
	  t2=new JTextField();
	  t2.setText("Pass");
	  t2.setBounds(50,200,100,50);
	  
	  b1=new JButton("OK");
	  b1.setBounds(50,300,100,100);
	  
	  //add(p);
	  add(t1);
	  add(t2);
	  add(b1);
	  
	 
	  setSize(1000,1000);
	  setVisible(true);
	  b1.addActionListener(this);
	  
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		//String s=e.getActionCommand();
		if(e.getActionCommand().equals("OK"))
		{
	     JOptionPane.showMessageDialog(null,"Button Pressed");
		 FormN f1=new FormN();
		}
	}

	
	public static void main(String[]args)
	{
		Form f1=new Form();
	}
}