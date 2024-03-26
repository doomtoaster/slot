package de.doomtoaster;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Sprosse extends JButton{
	private int wert;
	private Border border = new LineBorder(new Color(218,130,0), 4, true);
	public Sprosse(int wert) {
		super();
		this.wert = wert;
		setName("" + wert);
		setText("" + wert);
		setVisible(true);
		setBackground(Color.black);
		setForeground(new Color(250,217,2));
		setBorder(border);
		setFocusable(false);
		//super.setContentAreaFilled(false);

	}
	public void setActive(){
		setBackground(Color.yellow);
		setForeground(Color.black);
		repaint();

	}
	public void setPassive(){
		setBackground(Color.black);
		setForeground(Color.yellow);
		repaint();

	}
}


