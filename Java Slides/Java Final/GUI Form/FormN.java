import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormN //extends JFrame
{
	public FormN()
	{
		
		//JPanel p=new JPanel();
		JFrame f=new JFrame();
		f.setLayout(null);
	  JButton b1=new JButton("OK");
	  b1.setBounds(100,100,100,100);
	  //add(t1);
	  //add(t2);
	  f.add(b1);
	  f.setSize(400,400);
	  f.setVisible(true);
	  //b1.addActionListener(this);
	  
	  //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
