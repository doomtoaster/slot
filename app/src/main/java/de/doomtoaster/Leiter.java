package de.doomtoaster;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Leiter extends JPanel implements Runnable{
	private int[] werte = {14000,8400,5200,3200,2000,1200,800,400,300,240,120,60,30,15,0};
	private Thread t;
	private int pos = 4;
	ArrayList<Sprosse> sprossen = new ArrayList<>();
	public Leiter() {
		super();		
		setLayout(new GridLayout(werte.length,0));
		setSize(100,100);
		assemble();
		setBackground(Color.black);	
		start();
		setVisible(true);
	}
	public void assemble(){

		for (int i : werte) {
			Sprosse sprosse = new Sprosse(i);
			this.add(sprosse);	
			sprossen.add(sprosse);
		}
	}
	public void start () {
		System.out.println("Starting " +  "leiter");
		if (t == null) {
			t = new Thread (this, "leiter");
			t.start ();
		}
	}
	public void run(){
		for (Sprosse var : sprossen) {
			System.out.println(var.getName());
		}	
	}
	public ArrayList<Sprosse> getSprossen(){
		return sprossen;
	}

}
