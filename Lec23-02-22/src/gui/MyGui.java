package gui;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.button;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyGui extends JFrame {
	
	int count=0;
	JLabel label1;
	Jbutton button1;
	JPanel panel1;
	
	
	public MyGui(String title) {
		
	super(title);
	
	//JFrame frame1 = new JFrame();
	//frame1.setTitle("My First GUI");
	setVisible(true);
	setSize(500,500);
	JPanel panel1 = new JPanel();
	add(panel1);
	panel1.setLayout(new FlowLayout);
	panel1.setBackground(Color.gray);
	panel1.add(button1);
	button1.setText("Counter");
	JLabel label1= new Jlabel("Hi students");
	panel1.add(label1);
	button1.addActionListener(this);
	
	public void action(ActionEvent e) {
		count++;
		label1.set;
	}
	
	}

}
