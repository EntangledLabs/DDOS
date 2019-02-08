import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.geom.*;
import java.util.*;
import java.text.*;
import java.math.*;
public class main
{
    private Player p1; private Player p2;
    private numberCalculator calc;
    private int turn;
    public main(){
        p1 = new Player();
        p2 = new Player();
        turn = 1;
        calc = new numberCalculator();
    }

    public static void main(String[] args){
        GUI gui = new GUI();
        //gui.startButtonShow();
    }
}
