import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.geom.*;
import java.util.*;
import java.text.*;
import java.math.*;
public class GUI
{
    private JFrame frame;
    private Label startLabel;
    private screen scr;
    private int screen;
    public GUI()
    {
        frame = new JFrame();
        frame.setTitle("Destroy and Defend: Offline Strategy");
        frame.setSize(1600, 900);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);
        mouseInput();
        scr = new screen();
        screen = 1;
    }
    
    public void mouseInput(){
        frame.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.getButton() == MouseEvent.BUTTON1) {
                        System.out.println("Button 1 clicked...");
                    }
                    scr.buttons(screen, e.getX(), e.getY());
                }
            });
    }
    
    private class screen{
        public void buttons(int screen, int x, int y){
            if (screen == 1){
                startScreen(x,y);
            } else {
                gameScreen(x,y);
            }
        }
        public void startScreen(int x, int y)
        {
            if (x>400 && x<1200 && y>500 && y<700)
            {
                // action? 
            }
        }
        
        public void gameScreen(int x, int y) // 6 upgrade and 4 attacks
        {
            if (x>20 && x<80 && y>820 && y<880)
            {
                //upgrade;
            }
            if (x>100 && x<160 && y>820 && y<880)
            {
                //upgrade;
            }
            if (x>180 && x<240 && y>820 && y<880)
            {
                //upgrade;
            }
            if (x>260 && x<320 && y>820 && y<880)
            {
                //upgrade;
            }
            if (x>340 && x<400 && y>820 && y<880)
            {
                //upgrade;
            }
            if (x>420 && x<480 && y>820 && y<880)
            {
                //upgrade;
            }
            if (x>1520 && x<1580 && y>820 && y>880)
            {
                //attack;
            }
            if (x>1440 && x<1500 && y>820 && y>880)
            {
                //attack;
            }
            if (x>1360 && x<1420 && y>820 && y>880)
            {
                //attack;
            }
            if (x>1280 && x<1340 && y>820 && y>880)
            {
                //attack;
            }
        }
    }
}