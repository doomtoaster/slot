package de.doomtoaster;

import java.awt.Color;

import javax.swing.JButton;

public class Sprosse extends JButton{
	private int wert;
	public Sprosse(int wert) {
		super();
		this.wert = wert;
		setText("" + wert);
		setVisible(true);
		setBackground(Color.blue);
	}

}
