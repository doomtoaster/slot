package de.doomtoaster;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import de.doomtoaster.Leiter;

public class App extends JFrame{
	
	public App(){
		super();
		setTitle("My Gui");
        setSize(400, 400);

        // Create JButton and JPanel
        JButton button = new JButton("Click here!");
        JPanel panel = new JPanel();

        // Add button to JPanel
        panel.add(button);
        // And JPanel needs to be added to the JFrame itself!
        this.add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		App app = new App();
		}
}











