package gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FirstGui extends JFrame implements ActionListener{
	JLabel Label1;
	JButton Button1, Button2 ;
	JPanel Panel1;
	

	public FirstGui() {
		super("My first GUI");
		setVisible(true);
		setSize(300,400);
		setLayout(new FlowLayout());
		
		Panel1 = new JPanel();
		add(Panel1);
		Panel1.setBackground(Color.red);
		Panel1.setLayout(new FlowLayout());
		
		Button1 = new JButton("Click me");
		Panel1.add(Button1);
		Button1.setToolTipText("This is the first button, and show a message when clicked.");
		Button1.addActionListener(this);
		
		Button2= new JButton("Click me 2.");
		Panel1.add(Button2);
		Button2.setToolTipText("This is the second button, it will show a different message."); 
		Button2.addActionListener(this);
	}
		
			
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() ==Button1)
		{
			JOptionPane.showMessageDialog(this,"Button Clicked.");
		}
		else if(e.getSource() == Button2)
		{
			JOptionPane.showMessageDialog(this,"Button 2 Clicked.");
		}
	}
	
	public static void main(String [] args) {
		FirstGui gui_object = new FirstGui();
	}	
}
