package de.doomtoaster;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Leiter extends JPanel{
	private int[] werte = {0,15,30,60,120,240,300,400,800,1200,2000,3200,5200,8400,14000};
	public Leiter() {
		super();
		Sprosse testsprosse = new Sprosse(999);
		setLayout(new GridLayout(1,werte.length));
		setSize(100,100);
		assemble();
		setBackground(Color.pink);	
		add(testsprosse);	
		setVisible(true);	
	}
	public void assemble(){

		for (int i : werte) {
			this.add(new Sprosse(i));
		}
	}
	
}
