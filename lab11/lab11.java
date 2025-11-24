package lab11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lab11 extends JFrame implements MouseListener, MouseMotionListener, KeyListener {
    
    Point p1;

    public lab11() {
        super("Варіант 10: Малювання та Очищення");
        
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);
        
        setSize(600, 400);
        setLocation(100, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        requestFocus();
    }

        public void mousePressed(MouseEvent e) {
        p1 = e.getPoint();
    }

    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}


    public void mouseDragged(MouseEvent e) {
        if ((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
            
            Point p2 = e.getPoint();
            Graphics g = getGraphics();
            
            g.setColor(Color.BLACK);
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
            
            p1 = p2;
        }
    }

    public void mouseMoved(MouseEvent e) {}

    public void keyPressed(KeyEvent e) {
        repaint();
    }

    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new lab11();
    }
}