package de.doomtoaster;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import de.doomtoaster.Leiter;

public class App extends JFrame{
	
	public App(){
		super();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(1920,1000);
		setLayout(new GridLayout(3,3));		
		setBackground(Color.red);
		setVisible(true);
	}
	public static void main(String[] args) {
		App app = new App();
		Leiter leiter = new Leiter();	
		app.add(leiter);
		JButton buttontest = new JButton("test");
		app.add(buttontest);
		
		app.setVisible(true);


	}
}











