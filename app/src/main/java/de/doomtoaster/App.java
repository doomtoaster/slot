package de.doomtoaster;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import de.doomtoaster.Leiter;

public class App extends JFrame implements Runnable{
public static ArrayList<Sprosse> sprossen;
public Leiter leiter = new Leiter();
public static int zeiger = 4;
public static boolean gewonnen = false;
        public App(){
                super();
                setTitle("My Gui");
                setSize(400, 400);
                add(leiter);
                setVisible(true);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e){
                        if((int)(Math.random() * 2) == 1) zeiger--;
                        else zeiger++;
                        System.out.println(zeiger);
                        if(zeiger<1 ) gewonnen = true;
                        
                }});
                sprossen = leiter.getSprossen(); 
                sprossen.get(zeiger).setActive();
                repaint();
        }
        public static void main(String[] args) {
                App app = new App();
                Thread thread = new Thread(app);
                thread.start();
                
        }
        public void run(){
                while(!gewonnen){
                        try{
                        if(zeiger == 0 || zeiger == 14) break;
                        sprossen.get(zeiger-1).setActive();
                        Thread.sleep(200);
                        sprossen.get(zeiger-1).setPassive();
                        sprossen.get(zeiger+1).setActive();
                        Thread.sleep(200);
                        sprossen.get(zeiger+1).setPassive();
                        for (Sprosse var : sprossen) {
                                var.setPassive();
                        }
                }
                catch(InterruptedException e){
                        System.out.println(e.getMessage());
                }}

        }
}











