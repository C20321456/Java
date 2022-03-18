package number_game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Game extends JFrame implements ActionListener  {
	JPanel Panel1;
	JButton Button1, Button2;
	
	public Game() {
		super("Number guessing game");
		setVisible(true);
		setSize(400,400);
		JPanel Panel1 = new JPanel();
		add(Panel1);
		Panel1.setLayout(new FlowLayout());
		Panel1.setBackground(Color.white);
		
		Button1 = new JButton("Generate new number");
		Panel1.add(Button1);
		Button1.addActionListener(this);
		
		
		JLabel label1= new JLabel("Then take a guess..");
		Panel1.add(label1);
		
		JTextField yourInput = new JTextField("Enter your Guess",30);
		Panel1.add(yourInput);
		
		
		
		Button2 = new JButton("Check your guess");
		Panel1.add(Button2);
		Button2.addActionListener(this);
		
	}
	

	public static void main(String[] args) {
		Game numGame = new Game();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Button1)
		{
			Random randomGenerator = new Random();
			
			int randomGenerator_int = randomGenerator.nextInt(10);
			
			System.out.println("Random Integers: "+ randomGenerator_int);
			
		}
			
	}

}
