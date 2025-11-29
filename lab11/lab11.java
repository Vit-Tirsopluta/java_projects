package lab11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lab11 extends JFrame {
    
    private Point p1;

    public lab11() {
        setSize(800, 600);
        setLocation(260, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MyMouseAdapter mouseAdapter = new MyMouseAdapter();
        addMouseListener(mouseAdapter);
        addMouseMotionListener(mouseAdapter);
        
        addKeyListener(new MyKeyAdapter());
        
        setVisible(true);
        requestFocus();
    }

    class MyMouseAdapter extends MouseAdapter {
        
        @Override
        public void mousePressed(MouseEvent e) {
            p1 = e.getPoint();
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            if ((e.getModifiersEx() & InputEvent.BUTTON1_DOWN_MASK) != 0) {
                
                Point p2 = e.getPoint();
                Graphics g = getGraphics();
                
                g.setColor(Color.BLACK);
                g.drawLine(p1.x, p1.y, p2.x, p2.y);
                
                p1 = p2;
            }
        }
    }

    class MyKeyAdapter extends KeyAdapter {
        
        @Override
        public void keyPressed(KeyEvent e) {
            repaint();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new lab11());
    }
}